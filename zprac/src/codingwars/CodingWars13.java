package codingwars;

public class CodingWars13 {
	public static void main(String[] args) {
		System.out.println(encode("(( @"));
	}
	
	static String encode(String word){
		String s = "";
		String ss = word.toLowerCase();
		char[] ch = ss.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				s += "(";
			}else {
				s += ")";
			}
		}
	    return s;
	  }
}
