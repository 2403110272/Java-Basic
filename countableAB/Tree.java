package countableAB;

public class Tree extends Countable {
	
	Tree(String name, int num) {
		super(name, num);
	}

	
	void ripen() {
		System.out.println(name +"의 열매가 잘 익었다.");
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");

	}

}
