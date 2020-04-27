package 반복제어문1.형성평가05;
/*
 * 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 
 * 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.

(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = 0; // 밑변
		int h = 0; // 높이
		double tw = 0; //넓이
		String c = ""; // y,Y 받을거

		while (true) {
			System.out.print("Base = ");
			b = sc.nextInt();
			System.out.print("Height = ");
			h = sc.nextInt();
			tw = (double) b * h / 2;
			
			System.out.printf("Triangle width = %.1f\n", tw);
			System.out.printf("Continue? ");
			
			c = sc.next();
			if (c.equals("y") || c.equals("Y")) {
				
			} else {
				break;
			}
		}

	}

}
