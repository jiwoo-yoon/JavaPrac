package 반복제어문3.자가진단06;

import java.util.Scanner;

/*
 * 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
 * 
입력 예
3
출력 예
ABC
DE
F
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char a =65;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
