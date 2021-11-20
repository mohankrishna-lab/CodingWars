package codingwars;

import java.util.Arrays;
import java.util.List;

public class CodingWars11 {
	public static void main(String[] args) {
		System.out.println(getCount("abracacadskleiofdkslajflkdabra"));
		String s = "hello world";
		String s1 = s.replaceAll("[^ello]", "");
		System.out.println(s1);
	}
	
	public static int getCount(String str) {
		int count = 0;
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				count++;
		}
		String s = str.replaceAll("[^aeiou]", "");
		System.out.println(s);
		System.out.println(s.length());
		return count;
	}
}
