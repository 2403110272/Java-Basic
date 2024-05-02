package java06;

public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getPointX() {
		return x;
	}

	int getPointY() {
		return y;
	}
	

	public String toString() {
		return "x 좌표 : " + x + ", y 자표 : " + y + "\n";
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	int getMovablePointXspeed() {
		return xSpeed;
	}

	int getMovablePointYspeed() {
		return ySpeed;
	}

	

	public String toString() {
		return "x 좌표 : " + getPointX() + ", y 좌표 : " + getPointY() + "\n" + "x로 이동속도 : " + xSpeed + "\n" + "y로 이동속도 : "
				+ ySpeed;
	}
}