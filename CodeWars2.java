package practise;


public class CodeWars2 {

	public static void main(String[] args) {
		System.out.println(revrot("123456987654", 6));
	}
	
	public static String revrot(String strng, int sz) {
		String s = "";
		if (strng.isEmpty() || sz <= 0 || strng.length() < sz) {
			return "";
		}
		
		while (true) {
			String ss = strng.substring(0, sz);
			if (isReverse(ss)) {
				StringBuffer sb = new StringBuffer(ss).reverse();
				s += new String(sb);
			} else {
				s += ss.substring(1, sz) + ss.substring(0, 1);
			}
			strng = removeTakenString(strng, sz);
			if (strng.length() < sz) {
				break;
			}
		}
		return s;
	}
	
	public static boolean isReverse(String s) {
		long cube = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int n = Integer.parseInt(Character.toString(s.charAt(i)));
			cube += n * n * n;
		}
		
		if (cube % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static String removeTakenString(String s, int sz) {
		if (s.length() < sz) {
			return "";
		}
		return s.substring(sz, s.length());
	}
}
