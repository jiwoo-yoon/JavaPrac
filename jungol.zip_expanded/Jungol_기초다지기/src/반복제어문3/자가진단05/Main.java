package 반복제어문3.자가진단05;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
 * 
입력 예
3
출력 예
*****
 ***
  *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			for(int j =0;j<i;j++) {
				System.out.print(" ");
			}for(int k =0;k+i+i <n+(n-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
