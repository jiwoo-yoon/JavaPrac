package com.lec.java.while04;

public class While04Main {

	public static void main(String[] args) {
		System.out.println("while문 연습");
		// 1 ~ 100 수 중에서 2와 7의 공배수만 출력
		// 2와 7의 공배수: 2의 배수 && 7의 배수
		
		System.out.println("1 ~ 100 사이 2와 7의 공배수");
		int count = 1;
		while (count <= 100) {
			if ((count % 2 == 0) && (count % 7 == 0)) {
				System.out.println(count);
			}
			
			count++;
		} // end while
		
		System.out.println("\n 1 ~ 10 까지의 합");
		System.out.println("\n1부터 10까지 합(while)");
		int sum = 0; // 합계를 저장할 변수
		int n = 1;
		while (n <= 10) {
			sum = sum + n; // sum += n;
			n++;
		} // end while
		System.out.println("sum = " + sum);
		
		
	} // end main()

} // end class While04Main