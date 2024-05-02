package chap13;

public class Phone {
	// 필드 선언
	public String model;
	public String color;

	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

class SmartPhone extends Phone {
	// 필드 선언
	public boolean wifi;

	// 생성자 선언
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}