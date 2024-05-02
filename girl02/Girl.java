package girl02;

public class Girl {

	Girl() {
	};

	Girl(String name) {
	};

	private String name;

	void show() {
		System.out.println("그녀는 자바 초보자이다.");
	};
}

class GoodGirl extends Girl {
	void show() {
		System.out.println("그녀는 자바를 잘 안다.");
	};
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	};
}
