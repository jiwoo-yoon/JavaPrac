package 배열2.형성평가0A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 13 ;
		
		System.out.println(n+100);
		System.out.println(n*1000);
		System.out.println(n*1/2);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
//		for(int i = 0; i<x; i++) {
//			System.out.print("Hello Java ");
//		}
		
		if(x>=19) {
			System.out.println("성인입니다.");
		}else if(x<0) {
			System.out.println("잘못입력했닙다.");
		}else{
			System.out.println("미성년자입니다.");
		}
		
	}
	
	
	
}
