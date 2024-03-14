package select;

import java.util.Scanner;

public class Example06 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numMenu = input.nextInt();
		
		switch (numMenu) {
		case 1 :
		case 2 :
		case 3 :
			System.out.println("몇 잔을 주문하시겠습니까?");
			int numCoffee = input.nextInt();
			System.out.println(numMenu + "번 메뉴를 " + numCoffee + "잔 주문하셨습니다.");
			break;
		default :
			System.out.println("없는 메뉴입니다.");
		}
	}

}
