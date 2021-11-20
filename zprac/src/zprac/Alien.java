package zprac;

public class Alien implements MainAlienInterface{
	
	public void print() {
		System.out.println("hi man");
	}
	
	public int sayHello(String s) {
		int intHello = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("char is " + ch[i] + " " + (int)ch[i]);
			intHello += ch[i];
		}
		return intHello;
	}
	
	public boolean comparing(int a, int b) {
		if (a >= b) {
			return true;
		}
		return false;
	}
}
