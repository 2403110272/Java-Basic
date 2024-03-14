package select;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int x = input.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}

	}

}
