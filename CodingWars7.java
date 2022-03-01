package practise;

public class CodingWars7 {

	public static void main(String[] args) {
		int sum = sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
		System.out.println(sum);
	}
	
	public static int sequence(int[] arr) {
		
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
				if (sum > 0 || arr[i] > 0) {
					sum += arr[i];
					if (sum < 0) {
						sum = 0;
					}
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
		}
		return maxSum;
	}
}
