package for01;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("양의 숫자를 입력하세요 : ");
	
		int sum =0;
		int num = input.nextInt();
		
		while (num < 0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			num = input.nextInt();
		}
		for (int i = 1; i <= num ; i++) {
			sum += i;
		}
		System.out.print("1부터" + num + "까지의 합은 " + sum +"입니다.");
				
		}
	}
