package chap13;

class Vehicle {
	String name = "탈 것";

	void whoami() {
		System.out.println("나는 탈 것이다.");
	}
}

class Car extends Vehicle {
	String name = "자동차";

	void whoami() {
		System.out.println("나는 자동차이다.");
	}
}

class SportsCar extends Car {
	void whoami() {
		System.out.println("나는 스포츠 자동차이다.");
	}
}