package codingwars;

import java.util.Arrays;

public class CodingWars7 {
	public static void main(String[] args) {
		int[] a = {43,43,43,65,765,32};
		System.out.println(findAverage(a));
		char ch = Character.toUpperCase('w');
		System.out.println(ch);
		Arrays.stream(a).average().orElse(0);
	}
	
	public static double findAverage(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
		}
		avg /= array.length;
		return avg;
	}
}
