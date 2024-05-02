package java06;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int Speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("자동차 색깔 : " + color + "\n자동차 속도 : " + speed);
	}
	
}

class Car extends Vehicle {
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("자동차 색깔 : " + color + "\n자동차 속도 : " + speed + "\n자동차 배기량 : " + displacement + "\n자동차 기어 단수 : " + gears);
	}
}
