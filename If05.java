package select;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = input.nextInt();
		
		if (num>0) {
			
			if (num%2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		
	}

}
