package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요. : ");
		
		//int a = Integer.parseInt(input.next());
		String tempA = input.next();
		int a = Integer.parseInt(tempA);
		
		int b = Integer.parseInt(input.next());
		int c = Integer.parseInt(input.next());
		
		if (a>c) {
			if (a>b) {
				System.out.println("가장 큰 수는 " + a + "입니다.");
			}
		}
		if (b>c) {
			if (b>a) {
				System.out.println("가장 큰 수는 " + b + "입니다.");
			}
		}
		if (c>a) {
			if (c>b) {
				System.out.println("가장 큰 수는 " + c + "입니다.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
