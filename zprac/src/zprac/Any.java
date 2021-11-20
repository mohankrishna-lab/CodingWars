package zprac;

public class Any {

			
	public static void main(String[] args) {
		int length = 6;
		int[] a = {1,2,3,4,9,8};
		print(length, a);
	}
	
	public static int print(int length, int[] p_i) {
		int sum = 0;
		for (int i = 0; i < p_i.length; i++) {
			if (i == 0) {
				sum += p_i[0];
			}else if (i % 2 != 0) {
				sum += p_i[i];
			}
		}
		
		return sum;
	}
}
