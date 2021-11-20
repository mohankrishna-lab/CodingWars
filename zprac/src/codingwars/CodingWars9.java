package codingwars;

public class CodingWars9 {
	public static void main(String[] args) {
		String s = "The QUICK brown fox jumps over the lazy dog";
		System.out.println(palindrome(s));
	}
	
	public static boolean palindrome(String s) {
		boolean[] b = new boolean[26];
		char[] ch = s.toCharArray();
		char c = 'a';
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				char c1 = (char) (c - 32);
				if (ch[j] == c || ch[j] == c1) {
					b[k] = true;
					c++;
					k++;
					j=-1;
					break;
				}
			}
		}	
		for (int i = 0; i < b.length; i++) {
			if (b[i] == false)
				return false;
		}
		return true;
	}
}
