package while1;

import java.util.Scanner;


public class While01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num =  input.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터" + num + "까지의 합은 " + sum + "입니다." );

	}

}
