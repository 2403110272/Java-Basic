package while1;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bContinue = 1;
		
		while (bContinue != 0) {
			System.out.print("숫자를 입력하세요 : ");
			int num = input.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			
			else {
				System.out.println("홀수입니다.");
			}
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			bContinue = input.nextInt();
			}
		
		

	}

}
