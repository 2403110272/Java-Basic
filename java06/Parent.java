package java06;

public class Parent {
		String name = "영조";
		
		void print() {
			System.out.println(name);
		}
}

class Child extends Parent{
	String name = "사도세자";
	
	void print() {
		System.out.println("나는 " + name + "이다.");
	}
}
