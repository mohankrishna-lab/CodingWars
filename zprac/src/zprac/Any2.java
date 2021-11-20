package zprac;

public class Any2 {
	public static void main(String[] args) {
		String s = "1234567891";
		int a = 5;
		System.out.println(print(s,a,10));
		char ch = '7';
		int c = (int)ch - 48;
		System.out.println(((int)'9')+ 0);
		System.out.println(c);
		System.out.println(48);
	}
	
	public static String print(String s, int a, int b) {
		char[] ch = s.toCharArray();
		String max = "";
		for (int i = 0; i < ch.length; i++) {
			if (i == b - 2 || i == 1) {
				max = max + ch[i];
			}
		}
		return max;
	}
}
