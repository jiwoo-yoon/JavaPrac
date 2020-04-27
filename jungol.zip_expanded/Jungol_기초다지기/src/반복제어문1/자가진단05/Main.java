package 반복제어문1.자가진단05;

import java.util.Scanner;

/*
 * 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가 -1이 입력되면 종료하는 프로그램을 작성하시오.

* 입출력예의 진한 글씨는 실행값이다.
* 입·출력 예
5
12
4/
21
7/
100
-1
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; //
		int x = 0; // 3으로 나눈 나머지
		int y = 0;// 나눈 몫
		
		
		while(true) {
			n=sc.nextInt();
			x = n % 3;
			y = n / 3;
			
			if(x == 0) {
				System.out.println(y);
			}else if(n == -1) {
				break;
			}
		}
		sc.close();
	}

}
