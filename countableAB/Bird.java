package countableAB;

public class Bird extends Countable {

	Bird (String name, int num) {
		super(name, num);
	}
	
	void fly() {
		System.out.println(num + "마리의 " + name + "가 날아간다.");
	}
	@Override
	void count() {
		System.out.println(name + "가 "+ num + "마리 있다.");

	}

}
