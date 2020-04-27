package 반복제어문2.형성평가09;

import java.util.Scanner;

/*
 * 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.

* 주의 

 ')'와 '('사이에 공백이 1칸 있다.
(1,_1) 처럼 출력한다 : '_'는 공백
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		x = sc.nextInt();
		
		for(int i = 1; i<=x; i++) {
			for (int j = 1; j<=x;j++) {
				System.out.printf("(%d, %d) ",i,j);
			}
			System.out.println();
		}
		

	}

}
