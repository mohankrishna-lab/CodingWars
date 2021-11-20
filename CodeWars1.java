package practise;

public class CodeWars1 {

	public static void main(String[] args) {
		System.out.println(print(5));
		StringBuffer expected = new StringBuffer();
	      expected.append("  *\n");
	      expected.append(" ***\n");
	      expected.append("*****\n");
	      expected.append(" ***\n");
	      expected.append("  *\n");
	    //  System.out.println(expected);
	}
	
	public static String print(int n) {
		String s = "";
		if (n % 2 == 0 || n <= 0) {
			return null;
		}
		int indexF = n / 2 + 1;
		int indexS = n / 2 + 1;
		for (int i = 1; i <= n; i += 2) {
			for (int j = 1; j <= n; j++) {
				if (j >= indexF && j <= indexS) {
					s += "*";
					
				} else if (j > indexS){
					break;
				} else {
					s += " ";
				}
			}
			indexF -= 1;
			indexS += 1;
			s += "\n";
		}
		indexF += 2;
		indexS -= 2;
		for (int i = n; i >= 1; i -= 2) {
			for (int j = 1; j <= n; j++) {
				if (j >= indexF && j <= indexS) {
					s += "*";
					
				} else if (j > indexS){
					break;
				} else {
					s += " ";
				}
			}
			indexF += 1;
			indexS -= 1;
			s += "\n";
		}
		return s.stripTrailing();
	}
}
