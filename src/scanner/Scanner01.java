package scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("정수 타입 숫자를 입력하세요 : ");
		int x = input.nextInt();
		System.out.println("실수 타입 숫자를 입력하세요 : ");
		double y = input.nextDouble();
		
	
		
		System.out.println("x + y = " + (x + y));
		System.out.println(" x - y = " + (x - y));
		System.out.println(" x * y = " + (x * y));
		System.out.println(" x / y = " + (x / y));

	}

}
