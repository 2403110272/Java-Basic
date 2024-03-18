package loop;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();
			
			for (int i = num; i <= 9; i++) {
				System.out.println("[구구단 " + i + "단]");
				for (int j= num; j <= 9; j++) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
	}

}
