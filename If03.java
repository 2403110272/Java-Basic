package select;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println("양수입니다.");
		}
		else if (num == 0) {
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
	}

}
