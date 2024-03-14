package example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은?");
		int r = input.nextInt();
		System.out.println("원기둥의 높이는?");
		int n = input.nextInt();
		
		System.out.println("원기둥의 부피는" + r*r*3.14*n);
	}

}
