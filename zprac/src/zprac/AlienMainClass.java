package zprac;

public class AlienMainClass {
	
	public static void main(String[] args) {
		Alien a = (Alien) AlienFactory.getObject("alien");
		a.print();
		if (a.comparing(12, 20)) {
			System.out.println(12);
		}else {
			System.out.println(20);
		}
		System.out.println(a.sayHello("null"));
		OuterSpace o = (OuterSpace) AlienFactory.getObject("outerspace");
		o.print();
		if (o.comparing(34, 76)) {
			System.out.println(34);
		}else {
			System.out.println(76);
		}
		System.out.println(o.sayHello("string"));
		
		System.out.println("A - a =" + ('A' - 'a'));
		
	}
}
