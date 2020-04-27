package 반복제어문3.형성평가08;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예
3
출력 예
1 2 3
  4 5
    6
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int num = 1;
		
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int x = 0; x<n-i;x++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
