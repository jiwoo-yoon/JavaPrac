package 반복제어문3.형성평가04;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
입력 예
3
출력 예
*****
 ***
  *
 ***
*****
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j =1 ; j<i;j++) {
				System.out.print(" ");
			}for(int z = i; z<=(n*2)-i;z++) {
				System.out.print("*");
			}
			System.out.println();
		}for(int i =1 ; i<=n-1;i++) {
			for(int j = n-1;j>i;j--) {
				System.out.print(" ");
			}for(int z = 1; z<=(2*i)+1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
