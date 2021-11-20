package zprac;

public class Coding {
	public static void main(String[] args) {
		int[] a = {1, 3, 5};
		//System.out.println(maxUniqueStones(10, 3, a));
		System.out.println(minSets("1234", 4, 4));
	}
	
	public static int maxUniqueStones(int input1, int input2, int[] input3) {
		int unique = 0;
		
		return unique;
	}
	
	
	public static int minSets(String input1, int input2, int input3) {
		int min = 0;
		int rotate = rotating(input2);
		for (int i = 1; i <= rotate; i++) {
			for  (int j = 0; j < input1.length(); j++) {
				if (4 <= (int)input1.charAt(j)) {
					System.out.println(input2);
					System.out.println(input1.charAt(j));
					
					min++;
				}
			}
		}
		
		return min;
	}
	
	public static int rotating(int a) {
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}
		return count;
	}
	

	
}
