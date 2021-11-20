package zprac;

public class ThisShouldWorkFine {

	public static void main(String[] args) {
		giveValue(01);
	}
	
	public static void giveValue(int num) {
		int max = 1;
		boolean flag = false;
		String s = "";
		int i = 1;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 0) {
				s += 0;
			}
			if (max != rem || flag) {
				System.out.println(i++);
				s += rem;
			}else {
				flag = true;
			}
			num /= 10;
		}
		
		System.out.println(s);
	}
}
