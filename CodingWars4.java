package practise;

import java.text.DecimalFormat;

public class CodingWars4 {

	public static void main(String[] args) {
		System.out.println(unWantedDollars(" $ 89.0"));
		double d = 0.1;
	}
	
	public static Double unWantedDollars(String money) {
		String s = "";
		for (int i = 0; i < money.length(); i++) {
			if (money.charAt(i) >= '0' && money.charAt(i) <= '9' || money.charAt(i) == '.' || money.charAt(i) == '-') {
				s += money.charAt(i);
			}
		}
		
		if (s.isEmpty()) {
			return 0.0;
		}
		System.out.println(s.indexOf('.'));
		System.out.println(s.length() - 2);
		if (!s.contains(".")) {
			s += ".0";
		} else if (s.indexOf('.') == s.length() - 2 ) {
			s += "0";
		}
		return Double.parseDouble(s);
	}
}
