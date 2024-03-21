package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {
	
	public static int getNumberKeyboard(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(br.readLine());
	}
	
	public static int[ ] getScoresLine( int num ) throws IOException {
		
		int [] scores =new int[num];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		for (int i = 0; i < num; i++) {
			scores [i] = Integer.parseInt(st.nextToken());
		}
		
		return scores;
	}
	
	public static void printSumAverage(int[] scores) {
		int sum = 0;
		
		for (int i = 0; i < scores.length ; i++) {
			sum +=scores[i];
			}
		System.out.println("합계 : " + sum + " ( " + scores.length + "명 )");
		
		int average = sum /  scores.length;
		
		System.out.println("평균 : " + average);
		
		}


	public static void main(String[] args) throws IOException{
		int numStudent = getNumberKeyboard("학생 수 : ");
		int [] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}

}
