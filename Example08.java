package example;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		
		int num = input.nextInt();
		int a = num / 100;
		int b = (num % 100) / 10;
		int c = (num % 100) % 10;
		
		System.out.println("각 자릿수의 합 = " + (a+b+c));

	}

}
