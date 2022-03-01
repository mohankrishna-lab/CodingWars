package practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class CodingWars6 {

	public static void main(String[] args) {
		System.out.println(presses("HOW R U"));
	}
	
	public static int presses(String phrase) {
		int count = 0;
		Map<Character, Integer> codeNum = new LinkedHashMap<>();
		codeNum.put('1', 1);
		codeNum.put('2', 4);
		codeNum.put('3', 4);
		codeNum.put('4', 4);
		codeNum.put('5', 4);
		codeNum.put('6', 4);
		codeNum.put('7', 5);
		codeNum.put('8', 4);
		codeNum.put('9', 5);
		codeNum.put('0', 2);
		codeNum.put('a', 1);
		codeNum.put('b', 2);
		codeNum.put('c', 3);
		codeNum.put('d', 1);
		codeNum.put('e', 2);
		codeNum.put('f', 3);
		codeNum.put('g', 1);
		codeNum.put('h', 2);
		codeNum.put('i', 3);
		codeNum.put('j', 1);
		codeNum.put('k', 2);
		codeNum.put('l', 3);
		codeNum.put('m', 1);
		codeNum.put('n', 2);
		codeNum.put('o', 3);
		codeNum.put('p', 1);
		codeNum.put('q', 2);
		codeNum.put('r', 3);
		codeNum.put('s', 4);
		codeNum.put('t', 1);
		codeNum.put('u', 2);
		codeNum.put('v', 3);
		codeNum.put('w', 1);
		codeNum.put('x', 2);
		codeNum.put('y', 3);
		codeNum.put('z', 4);
		codeNum.put('A', 1);
		codeNum.put('B', 2);
		codeNum.put('C', 3);
		codeNum.put('D', 1);
		codeNum.put('E', 2);
		codeNum.put('F', 3);
		codeNum.put('G', 1);
		codeNum.put('H', 2);
		codeNum.put('I', 3);
		codeNum.put('J', 1);
		codeNum.put('K', 2);
		codeNum.put('L', 3);
		codeNum.put('M', 1);
		codeNum.put('N', 2);
		codeNum.put('O', 3);
		codeNum.put('P', 1);
		codeNum.put('Q', 2);
		codeNum.put('R', 3);
		codeNum.put('S', 4);
		codeNum.put('T', 1);
		codeNum.put('U', 2);
		codeNum.put('V', 3);
		codeNum.put('W', 1);
		codeNum.put('X', 2);
		codeNum.put('Y', 3);
		codeNum.put('Z', 4);
		codeNum.put(' ', 1);
		
		
		for (int i = 0; i < phrase.length(); i++) {
			char ch = phrase.charAt(i);
			int num = codeNum.get(ch);
			count += num;
		}
		return count;
	}
}
