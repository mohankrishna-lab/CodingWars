package workconfia;

import java.sql.Date;
import java.util.concurrent.TimeUnit;


public class Work1 {
	public static void main(String[] args) { 
		/*
		 * Date date = new Date(947749574324531l); long
		 * millis=System.currentTimeMillis() - date.getTime(); System.out.println(date);
		 * long mai = TimeUnit.DAYS.convert(millis, TimeUnit.MILLISECONDS);
		 * System.out.println(mai);
		 * 
		 * print(new Integer[] {32,332,3221}); Integer a[] = new Integer[]
		 * {32,332,3221}; for (int i = 0; i < a.length; i++) { System.out.println(a[i]);
		 * }
		 * 
		 */
		if (true & true) {
			System.out.println("hi");
		}else {
			System.out.println("bye");
			
		}
		Prac prac = new Prac();
		if (prac != null) {
			System.out.println("it is not null");
		}else {
			System.out.println("it is null");
		}
		
		
		if (Boolean.TRUE.equals(true)) {
			System.out.println("boolean ture");
		}else {
			System.out.println("boolean false");
		}
	}
	
	public static void print(Integer[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
