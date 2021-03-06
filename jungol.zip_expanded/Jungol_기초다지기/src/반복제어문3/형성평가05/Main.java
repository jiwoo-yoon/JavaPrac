package 반복제어문3.형성평가05;

import java.util.Scanner;

/*
 * 자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.
 * 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
입력 예
3
출력 예
    *
  ***
*****

위 문제에는 법칙이 있습니다.
별찍기 문제는 법칙을 생각하여 문제풀이를 하면 간단하게 해결할수있습니다.
공백은 2의배수로 줄어들고 소멸됩니다.
ex) 3일때에는 4 2 0 이 됩니다.
그렇기때문에 공백을 입력해주는 for문 16번줄에는 2씩 줄어드는 결과값을 출력해줘야 합니다.
n+(n-2)-(i*2) // 입력받은 n값에 (n-2)를 더해줌으로 3일때는 4, 4일때는 6, 5일때는 8 이런식으로 2,4,6,8로 2의 배수를 얻을수있으며,
이렇게 얻은값에 (i*2)를 빼줍니다.
i는 초기값은 0이며 15번의 for문이 한바퀴를 돌때마다 1씩 증가하므로 첫번째줄은 0 두번째는 2, 세번째는 4, 
이런식으로 2의배수값으로 16번 for문의 반복숫자를 빼줄수있습니다.
*을 출력하는 19번 for문은 i*2의 값이 0 2 4 6 8 순으로 가기때문에 별을 1 3 5 를 출력할수있습니다.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n+(n-2)-(i*2);j++) {
				System.out.print(" ");
			}for(int x= 0; x<=i*2;x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
