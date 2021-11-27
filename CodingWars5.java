package practise;

public class CodingWars5 {

	public static void main(String[] args) {
		System.out.println(digPow(46288, 3));
	}
	
	public static long digPow(int n, int p) {
		long l = -1;
		String s = Integer.toString(n);
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Math.pow(s.charAt(i) - '0', p++);
		}
		if (sum < n) {
			return l;
		}
		for (long i = 1; i <= sum; i++) {
			if (n * i == sum) {
				return i;
			}else if (n * i > sum){
        return l;
      }
		}
		return l;
	}
}
