package 반복제어문1.형성평가01;

import java.util.Scanner;

//정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = sc.nextInt();

		while (true) {
			a++;
			System.out.print(a + " ");
			if (a == b)
				break;
		}
	}
}