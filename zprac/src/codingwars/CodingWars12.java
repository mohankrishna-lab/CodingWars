package codingwars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodingWars12 {
	public static void main(String[] args) {
		System.out.println(isAnagram("foefet", "toffee"));
	}

	public static boolean isAnagram(String test, String original) {
		char[] ch1 = test.toLowerCase().toCharArray();
		char[] ch2 = original.toLowerCase().toCharArray();
		List<Character> list1 = convertArrayToList(ch1);
		List<Character> list2 = convertArrayToList(ch2);
		Collections.sort(list1);
		Collections.sort(list2);
		if (list1.toString().equals(list2.toString())) {
			return true;
		}
		return false;
	}
	
	public static List<Character> convertArrayToList(char[] ch){
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
		}
		return list;
	}
}


