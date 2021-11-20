package zprac;

import java.util.ArrayList;
import java.util.List;

public class Pracz {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(x -> System.out.println(x));
	}
}
