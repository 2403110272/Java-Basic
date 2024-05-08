package countable;

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m =  {new Bird("쏙독새"), new Bird ("까마귀"), new Tree ("사과 나무"), new Tree ("오렌지 나무")};
		
		for (Countable e : m) {
			e.count();
		}
		
		for (int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			} else {
				((Tree)m[i]).ripen();
			}
		}

	}

}
