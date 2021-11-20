package zprac;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



public class A {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		long l = 1624871658975l- 300000l;
		Date date = new Date(162487135897l);
		Date newDate = new Date(1124943599111l);
		System.out.println("birthday " + date);
		System.out.println(l);
		System.out.println("time" + date.getTime());
		Map<Integer, String> map = new HashMap<>();
		map.put(23, "hi");
		System.out.println(map.get(23));
		System.out.println(newDate);
		System.out.println();
	}
}
