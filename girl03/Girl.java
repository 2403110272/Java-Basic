package girl03;

public class Girl {
	public Girl(String name){
	this.name = name;
}

	protected String name;

	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
}

class GoodGirl extends Girl {
	GoodGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl {
	BestGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
	}
}
