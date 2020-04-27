package 반복제어문3.자가진단07;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
 * 입력 예
3
출력 예
1 2 3 A
4 5 B C
6 D E F
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 1;
		char a = 65; //아스키코드 문자변수 A
		
		for(int i= 0; i<n; i++) {
			for(int j =1;j<=n-i;j++) { //x를 증가시켜줌으로
				System.out.print(x + " ");//연속적인 숫자출력가능
				x++;
			}
			for(int z= 0; z<= i;z++) { //아스키코드를 사용하여
				System.out.print(a + " ");//연속적인 문자출력가능
				a++;
			}
			System.out.println();
		}

	}

}
