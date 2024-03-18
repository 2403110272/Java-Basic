package dowhile;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		int num = input.nextInt();
		int sum =0;
		int i = 1;
		
		do {
			i++;
			num = input.nextInt();
		} while (i<=5);
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
		
	}

}
