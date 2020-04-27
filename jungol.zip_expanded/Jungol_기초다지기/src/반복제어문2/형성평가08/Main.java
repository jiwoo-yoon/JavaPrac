package 반복제어문2.형성평가08;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l1 = 0;
		int l2 = 0;
		
		l1 = sc.nextInt();
		l2 = sc.nextInt();
		
		for(int i = 1; i<l1+1; i++) {
			for(int j = 1; j<l2+1; j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
		

	}

}
