package star;

import java.util.Scanner;


public class Star05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int x = num;
		int y = num;
		
		
		for (int i = 0; i < y; i++) {
			for(int j = 1; j <= x; j++) {
				if (num > j) 
				System.out.print(" ");
				else
					System.out.print("*");
				}
				num--;
				x++;
				System.out.println(" ");
		}

	}

}
