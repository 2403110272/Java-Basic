package example;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		System.out.println((a%4==0) && (a%5==0));
		System.out.println((a%4==0) || (a%5==0));
		System.out.println((!(a%4==0) && (a%5==0)) || ((a%4==0) && !(a%5==0)));
	}

}
