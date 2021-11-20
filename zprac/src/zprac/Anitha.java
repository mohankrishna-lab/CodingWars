package zprac;

public class Anitha {
	public static void main(String[] args) {
		String s = "glove";
		String ss = "";
		
		int fetch = fetchNumber(s);
		
		for (int i = fetch; i < s.length(); i++) {
			ss += s.charAt(i);
		}
		ss += '-';
		
		for (int i = 0; i < fetch; i++) {
			ss += s.charAt(i);
		}
		
		ss += "ay";
		
		System.out.println(ss);
	}
	
	public static int fetchNumber(String s) {
		int fetch = -1;
		
		for (int i = 0; i < s.length(); i++){
			fetch++;
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
					s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				break;
			}
		}
		return fetch;
	}
}
