package 반복제어문2.형성평가10;
/*
 * 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
구구단 사이의 공백은 3칸이다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int n1 = 0;
		int n2 = 0;
		
		
		n = sc.nextInt();
		n1 = sc.nextInt();

		if (n > n1) {
			n2 = n - n1;
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j <= n2; j++) {
					System.out.printf("%d * %d =%3d\t", n + j, i, (n + j) * i);
				}
				System.out.println();
			}
		} else if (n < n1) {
			n2 = n1 - n;
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j <= n2; j++) {
					System.out.printf("%d * %d =%3d\t", n + j, i, (n + j) * i);
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d =%3d \n", n, i, n * i);
			}
		}
	}

}
