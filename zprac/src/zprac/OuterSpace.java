package zprac;

public class OuterSpace implements MainAlienInterface{

	public void print() {
		System.out.println("hello outer space");
	}
	
	public int sayHello(String s) {
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			System.out.println("char is " + s.charAt(i));
			length++;			
		}
		return length;
	}
	
	public boolean comparing(int a, int b) {
		if (a >= b) {
			return true;
		}
		return false;
	}
}
