package com.lec.java.crawl03;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * Daum 인기 검색어
 */
public class DaumFavorSearch {

	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");
		String url;
		Document doc;
		Response response;
		Element element;

		url = "http://www.daum.net";
		response = Jsoup.connect(url).execute();

		doc = response.parse();

		Elements favor_elements = doc.select("div.slide_favorsch ul.list_favorsch li a");

		System.out.println(favor_elements.size() + " 개");

		for (Element favor_element : favor_elements) {
			System.out.println(favor_element.text());
			System.out.println(favor_element.attr("href"));
		}

	}

}
