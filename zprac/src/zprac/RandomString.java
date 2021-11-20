package zprac;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {
		Random random = new Random();
		
		String s[] = {"hi", "hello", "world", "bye", "friends"};
		String str = "";
		for (int i = 1; i <= s.length + 1; i++) {
			str += s[random.nextInt(s.length)];
			str += " ";
		}
		System.out.println(str.trim());
	}
}
