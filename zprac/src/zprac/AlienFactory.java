package zprac;

public class AlienFactory {
	public static MainAlienInterface getObject(String s) {
		MainAlienInterface obj = null;
		if (s.equalsIgnoreCase("Alien")) {
			obj = new Alien();
		}else if(s.equalsIgnoreCase("OuterSpace")) {
			obj = new OuterSpace();
		}
		return obj;
	}
}
