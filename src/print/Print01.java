package print;

public class Print01 {

	public static void main(String[] args) {
		String myName = "박서현";
		int myAge = 24;
		
		System.out.println("* 이름 : " + myName);
		System.out.println("* 나이 : " + myAge);
	
		System.out.print("* 이름 : " + myName);
		System.out.println("   * 나이 : " + myAge);
		
		System.out.println("* 이름 : " + myName + "   * 나이 : " + myAge);
	}

}
