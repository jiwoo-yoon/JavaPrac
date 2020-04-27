package 반복제어문2.형성평가07;

import java.util.Scanner;

/*
 * 한 개의 자연수를 입력받아 
 * 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		x = sc.nextInt();
		
		for(int i = 0; i<10;i++) {
			y += x; // 그수를 계쏙 더하면 배수다
			System.out.print(y + " ");
		}

	}

}
