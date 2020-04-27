package 반복제어문3.형성평가02;

import java.util.Scanner;

/*
 * 1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
 * 
입력 예
7
출력 예
7 14 21 28 35 42 49 56 63 70
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int cnt = 1;
		
		n = sc.nextInt();
		
		for(int i = 0; i<10; i++) {
			if((n*cnt)%10 != 0 && (n*cnt) < 100) {
				System.out.print((n*cnt) + " ");
				cnt++;
			}else if((n*cnt)%10 == 0 && (n*cnt) < 100){
				System.out.print(n*cnt);
				break;
			}
		}
		
	}

}
