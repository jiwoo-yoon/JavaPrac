package 반복제어문3.형성평가06;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예
3
출력 예
    1
  1 2
1 2 3

위 문제는 공백의 법칙은 4 2 0 이런식으로 2의 배수값으로 줄어든다는것입니다.
공백의 for문은 40번줄로,
입력값 + 입력값-2 - (i*2) 를 해준다면,
3을 예로 들었을때 
3 + 1 - (0) 이 됩니다.
4가되어 4번 공백을 생성하고,
두번째 줄은 
3 + 1 - (2) 가 되어 
2번의 공백을 생성합니다.
괄호안의 숫자가 2가되는이유는,
39번의 for문이 한바퀴를 돌게되면 i의 값이 1씩 증가하기때문에 (i*2) 의 값은 0 2 4 6 순으로 올라갈수있습니다.
그 전 문제와 달리 별이 아닌 정수를 출력하여야 하기 때문에
42번 for문의 변수값인 x를 넣게되면 한바퀴를 돌때마다 1 2 3 4 순으로 값이 들어갑니다.
정수 사이에 공백이 존재하기 때문에 (x+" ")공백을 추가하여 문제를 풀 수 있습니다.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n+(n-2)-(i*2); j++) {
				System.out.print(" ");
			}for(int x = 1; x<= n-(n-1)+i;x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		

	}

}
