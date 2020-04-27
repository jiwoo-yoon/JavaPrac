package com.lec.java.crawl04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * 이미지 크롤링
 * 
 * 참조: 
 * 1. HttpURLConnection 사용
 * 
 * 2. ImageIO 사용
 */

/*
	yes24.com 의 검색어 는 cp949 로 url 인코딩 되어 있다.  한글 1글자 = 2byte 
*/

/* 다음 사항들을 크롤링 한다
 * 	책이름 / 책 가격 / 상세페이지 링크 url / 썸네일 url
 *  books 폴더 생성후 실행 
 */
public class Yes24 {
	
	private static final String PATH = "books";

	public static void main(String[] args) throws IOException {
		String search = "파이썬"; // 검색어
		
		Yes24 app = new Yes24();
		
		//크롤링
		ArrayList<InfoBook> list = app.crawlYes24(search);
		
		int fileIndex = 1;
		for(InfoBook e:list) {
			System.out.println(e); //크롤링 정보 출력
			
			//썸네일 이미지 다운로드
			String fileName = String.format(PATH + File.separator + "yes24%03d.jpg", fileIndex);
			
			URL imgUrl = new URL(e.getImgUrl());
			HttpURLConnection conn = (HttpURLConnection)imgUrl.openConnection();
			InputStream in = conn.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			
			FileOutputStream out = new FileOutputStream(fileName);
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int byteImg;
			byte [] buf = new byte[conn.getContentLength()];
			while((byteImg = bin.read(buf)) != -1) {
				bout.write(buf, 0, byteImg);
			}
			
			bout.close();
			bin.close();
			
			System.out.println(fileName + "이 저장되었습니다.");
			
			fileIndex++;
		}
		
		
	}
	/**
	 * 
	 * @param search : 검색어
	 * @return 검색결과 List
	 * @throws IOException
	 */
	private ArrayList<InfoBook>crawlYes24(String search) throws IOException{
		ArrayList<InfoBook> list = new ArrayList<InfoBook>();
		
		String url;
		Document doc;
		Response response;
		Elements elements;
		Elements rowElements;
		
		url = "http://www.yes24.com/searchcorner/Search?keywordAd=&keyword=&domain=ALL&qdomain=%C0%FC%C3%BC&Wcode=001_005&query="
				+ URLEncoder.encode(search, "cp949");
		
		//System.out.println(url); //url 정상동작확인
		
		response = Jsoup.connect(url).execute();
		doc = response.parse();
		//#schMid_wrap > div:nth-child(4) 크롬 카피탭에서 정말 마지막에 도움받기
		elements = doc.select("#schMid_wrap > div:nth-child(4)");
		//System.out.println(elements.size());
		
		rowElements = elements.get(0).select("tr:nth-child(odd)");
		
		for(Element element : rowElements) {
			String imgUrl =
					element.selectFirst("td.goods_img > a > img").attr("src").trim();
			//System.out.println(imgUrl);
			
			//책 제목과 가격, 상세페이지 url
			Element a = element.selectFirst("td.goods_infogrp > p.goods_name > a");
			String bookTitle = a.text().trim();
			String linkUrl = "htttp://www.yes24.com" + a.attr("href");
			
			double price = Double.parseDouble(
			element.selectFirst("td.goods_infogrp > div.goods_price > em.yes_b").text().trim().replace(",", "")
			);
			//System.out.println(bookTitle + ", " + linkUrl + " , " + price);
			list.add(new InfoBook(bookTitle, price, linkUrl, imgUrl));
		}
		
		return list;
	}
	
	
}