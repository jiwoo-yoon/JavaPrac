package com.lec.java.crawl02;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NateSearch {

	public static void main(String[] args) throws IOException {
		System.out.println("네이트 인기 검색어");

		String url;
		Document doc;
		Response response;
		Element element;

		url = "https://www.nate.com/";
		response = Jsoup.connect(url).execute();

		doc = response.parse();

		Elements search_elements = doc.select(".search_keyword dd a");

		System.out.println(search_elements.size() + "개");

		for (Element search_element : search_elements) {

			System.out.println(search_element.text());
			System.out.println(search_element.attr("href"));

		}

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
