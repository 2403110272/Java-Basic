package star;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
					
					System.out.println( );
		}

	}

}