package practise;

import java.util.Arrays;

public class CodingWars3 {

	public static void main(String[] args) {
		String dr = "/+1-541-754-3010 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
			    + "+1-541-984-3012 <P Reed> /PO Box 530; Pollocksville, NC-28573\n :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209\n"
			    + "+1-741-984-3090 <Peter Reedgrave> _Chicago\n :+1-921-333-2222 <Anna Stevens> Haramburu_Street AA-67209\n"
			    + "+1-111-544-8973 <Peter Pan> LA\n +1-921-512-2222 <Wilfrid Stevens> Wild Street AA-67209\n"
			    + "<Peter Gone> LA ?+1-121-544-8974 \n <R Steell> Quora Street AB-47209 +1-481-512-2222\n"
			    + "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n"
			    + "<Sophia Loren> +1-421-674-8974 Bern TP-46017\n <Peter O'Brien> High Street +1-908-512-2222; CC-47209\n"
			    + "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +1-098-512-2222, Denver\n"
			    + "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado\n"
			    + "+1-099-500-8000 <Peter Crush> Labrador Bd.\n +1-931-512-4855 <William Saurin> Bison Street CQ-23071\n"
			    + "<P Salinge> Main Street, +1-098-512-2222, Denve\n"+ "<P Salinge> Main Street, +1-098-512-2222, Denve\n";
		//Arrays.stream(dr.split("\n")).forEach(System.out::println);
		//System.out.println(dr);
		System.out.println(phone(dr, "1-908-512-2222"));
	}
	
	public static String phone(String strng, String num) {
		String[] s = strng.split("\n");
		String str = "";
		int count = 0;
		for (String ss : s) {
			if (ss.contains("+" + num)) {
				count++;
			}
		}
		if (count >= 2) {
			return "Error => Too many people: " + num;
		}
		if (count == 0) {
			return "Error => Not found: " + num;
		}
		for (String ss : s) {
			if (ss.contains("+" + num)) {
				return "Phone => " + num + ", Name => " + makePhoneString(ss, num);
			}
		}
		return str;
	}
	
	public static String makePhoneString(String ss, String num) {
		String s = "";
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) == '<') {
				s += ss.substring(i + 1, ss.indexOf('>'));
				ss = ss.replace(ss.substring(i, ss.indexOf('>') + 1), "");
			}
		}
		ss = ss.replace(ss.substring(ss.indexOf('+'), ss.indexOf('+') + num.length() + 1) , "").trim();
		if (ss.contains("/ ")) {
			ss = ss.replace("/ ", "");
		}
		String st = "";
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z' || ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z' || ss.charAt(i) == '-' || ss.charAt(i) == '.' || ss.charAt(i) >= '0' && ss.charAt(i) <= '9') {
				st += ss.charAt(i);
			} else if (st.charAt(st.length() - 1) != ' ') {
				st += " ";
			}
		}
		st = st.trim();
		s += ", Address => " + st;
		return s;
	}
}
