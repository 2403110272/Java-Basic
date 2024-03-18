package star;

import java.util.Scanner;

public class Star04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j<i) {
				System.out.print(" ");
			}
				else {
					System.out.print("*");
				}
	}
			System.out.println();

}
		
	}
}
