package com.lec.java.string03;

/*  StringBuffer, StringBuilder

	 String 클래스는 immutable 클래스이고, /변할수없는~
	 StringBuffer, StringBuilder는 mutable 클래스임 /변할수있는~


	 StringBuffer:
		Java ver 1.0부터 있던 클래스
		쓰레드에 안전(thread-safe), 속도가 느림
	
	 StringBuilder:
		Java 5부터 생긴 클래스
		쓰레드에 안전하지 않다(thread-unsafe), 속도가 빠름.
	
		그 외에는 StringBuffer와 StringBuilder는 같은 기능(메소드)을 갖고 있음
		

	** 웹 프로그래밍 등에선 문자열을 '붙여 나가며' 완성하는 동작을 많이 함
		실무에서는
			String 을 concat() (혹은 + 연산)하기 보다는
			StringBuffer 를 append() 하는 것을 더 많이 사용함  (성능 UP)
			
		※ 그러나 학습예제에선 예제단순화를 위해 String 을 기본적으로 사용하니 참조 바랍니다
 */
public class String03Main {

	public static void main(String[] args) {
		System.out.println("[1] StringBuffer, StringBuilder");
		// String 클래스는 immutable 클래스이고,
		// StringBuffer, StringBuilder는 mutable 클래스임

		System.out.println("[String: immutable]");

		String str1 = "Hello";
		String str2 = str1;

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		if (str1 == str2) {
			System.out.println("==동일참조");
		} else {
			System.out.println("==다른참조");
		}

		System.out.println(str1.concat("Java")); // concat을 한다고 하더라도 String은 immutable이라 변할수 없고, heap에다가 새로운 String타입의
													// 객체 "HelloJava"가 나온다.
		System.out.println(str1); // 변경 ㄴㄴ

		str1 = str1.concat("Java"); // 여기서는 heap에 만든 새로운 주소값을 덮어쓰기를 했기 떄문에
		System.out.println(str1); // 변경 ok,

		if (str1 == str2) {
			System.out.println("==동일참조");
		} else {
			System.out.println("==다른참조"); // 다른참조가 나온다다다다다다
		}

		System.out.println();
		System.out.println("[StringBuffer: mutable]");

		StringBuffer buff1 = new StringBuffer("Hello");
		StringBuffer buff2 = buff1;

		System.out.println("buff1 : " + buff1);
		System.out.println("buff2 : " + buff2);

		if (buff1 == buff2) {
			System.out.println("==동일참조");
		} else {
			System.out.println("==다른참조");
		}

		System.out.println(buff1.append("Java"));
		System.out.println(buff1);
		System.out.println(buff2);

		if (buff1 == buff2) {
			System.out.println("==동일참조");
		} else {
			System.out.println("==다른참조");
		}

		// StringBuffer:
		// Java ver 1.0부터 있던 클래스
		// 쓰레드에 안전(thread-safe), 속도가 느림

		// StringBuilder:
		// Java 5부터 생긴 클래스
		// 쓰레드에 안전하지 않다(thread-unsafe), 속도가 빠름.

		// 그 외에는 StringBuffer와 StringBuilder는 같은 기능을 갖고 있음

		StringBuilder buff3 = new StringBuilder("hello");
		System.out.println(buff3.append("java"));

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
