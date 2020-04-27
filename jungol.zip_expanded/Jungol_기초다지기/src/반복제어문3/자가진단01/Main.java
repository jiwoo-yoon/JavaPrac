package 반복제어문3.자가진단01;

import java.util.Scanner;

/*
 * 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int sum = 0;
		int cnt = 0;

		n = sc.nextInt();

		for (int i = 0; sum < n; i++) {

			if (i % 2 != 0 ) {
				sum += i;
				cnt++;
			}

			
		}
		System.out.println(cnt + " " + sum);
	}
}
