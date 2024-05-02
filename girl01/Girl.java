package girl01;

public class Girl {
	private String name;
}

class GoodGirl extends Girl {
	void show() {
		System.out.println("그녀는 자바를 잘 안다");
	};
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	};
}
