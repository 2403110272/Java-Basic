package java06;

public class PointTest {

	public static void main(String[] args) {
		Point t = new Point(5, 4);
		Point t2 = new MovablePoint(6, 7, 15, 17);
		System.out.println(t.toString());
		System.out.println(t2.toString());
	}

}
