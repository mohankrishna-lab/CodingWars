package zprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		/*
		 * List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7); List<Double> num =
		 * Arrays.asList(2.2,432423.43); List<Double> lists =
		 * num.stream().map(d->Math.pow(d, d)).collect(Collectors.toList());
		 * List<Double> list = numbers.stream().map(x->Math.pow(x,
		 * x)).collect(Collectors.toList()); list.forEach(System.out::println);
		 * lists.forEach(System.out::println);
		 */
		List<String> charS = Arrays.asList("abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "sdffsd");
		for (int j = 0; j < 30; j++) {
			System.out.println(charS.get(j % 4));
		}
		char[] ch = {'s','f','h','k'};
		String str = new String(ch);
		System.out.println(str);
		
		
		
		for (int i = 1;i <= 10; i++) {
			
		}
	}
}
