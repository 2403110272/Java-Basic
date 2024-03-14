package select;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요. : ");
		int num = input.nextInt();
		
		if (num>=90) {
			System.out.println("학점은 A 입니다.");
		}
		else if (num>=80) {
			System.out.println("학점은 B 입니다.");
		}
		else if (num>=70) {
			System.out.println("학점은 C 입니다.");
		}
		else if (num>=60) {
			System.out.println("학점은 D 입니다.");
		}
		else {
			System.out.println("학점은 E 입니다.");
		}

	}

}
