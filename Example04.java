package example;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		int a = input.nextInt();
		int x = a / 3600;
		int y = a % 3600 / 60;
		int z = (a % 3600) % 60;  
		System.out.printf("%d 시간 %d분 %d초", x , y , z);

	}

}
