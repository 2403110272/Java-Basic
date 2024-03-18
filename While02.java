package while1;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, i = 0;
		int sum = 0;
		
		while (true) {
			System.out.print("숫자를 입력하세요. : ");
			num = input.nextInt();
			if (num==0) {
				break;
			}
			sum += num;
			i ++ ;
		}
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
		

	}

}
