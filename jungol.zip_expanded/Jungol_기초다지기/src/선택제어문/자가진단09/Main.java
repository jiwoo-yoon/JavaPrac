package 선택제어문.자가진단09;

/*
 * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = (a < b) ? a : b; 

		min = (min < c) ? min : c;

		System.out.println(min);

		sc.close();
	}

}