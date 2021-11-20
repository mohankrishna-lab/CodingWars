package zprac;

public class Any3 {
	public static void main(String[] args) {
//		int count = 0 ;
//		int[] n = {-5,4,-5,3,-2,-4};
//		int count1 = 0;
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] < 0 && n[i]%2==0) {
//				count1++;
//			}
//		}
//		System.out.println(count1);
		
		
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for (int j = 0;j <3; j++) {
				sum = sum + array[i][j];
			}
		}
		
		System.out.println(sum / 5);
	}
	
	public static int fun(int x, int y) {
		if (x <= 0) {
			return y;
		}else {
			return (fun(x-1,y-1));
		}
	}
}
