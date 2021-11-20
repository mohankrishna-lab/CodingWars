package practise;

import java.util.ArrayList;
import java.util.List;

public class GeneticAlgorithm {

	public static void main(String[] args) {
		System.out.println(challenge(11l));
	}
	
	public static String challenge(long n) {
		long totalSquare = n * n;
		String s = "";
		long index = 0;
		long sum = 0;
		for (long i = n - 1; i >= 1; i--) {
			index = i - 1;
			
			s += i;
			for (long j = index; j >= 1; j--) {
				sum += j * j;
				if (sum > totalSquare) {
					if (index > 0) {
						index--;
						j = index;
					}
					s = "" + i;
				} else if (sum == totalSquare) {
					s += " " + j;
					return s;
				} else if ((sum + (j * j)) < totalSquare) {
					System.out.println(s);
					s += " " + j;
					sum = i * i;
					System.out.println("second " + s);
					System.out.println("sum is: " + sum);
				}
			}
		}
		return null;
	}
	
	
	public static String decompose(long n) {
		List<Long> decomposeArray = Decomposer(n, n * n);

		// no valid solution exists
		if(decomposeArray == null) return "";

	    // remove the last element
		decomposeArray.remove(decomposeArray.size() - 1);
		List<String> result = new ArrayList<>();

		for(Long ele : decomposeArray){
			result.add(String.valueOf(ele.longValue()));
		}

		return String.join(" ", result);
	}

	/**
	 * Recursion to get the list of decompose
	 * @param n
	 * @param remain
	 * @return
	 */
	public static List<Long> Decomposer(long n, long remain){
		// basic case
		if(remain == 0){
			List<Long> r = new ArrayList<Long>();
			r.add(n);
			return r;
		}

		// iterate all element less than n
		for(long i = n - 1 ; i > 0; i--){
			if((remain - i * i) >= 0){
				List<Long> r = Decomposer(i, (remain - i * i));

				// only get the answer
				if(r != null){
					r.add(n);
					return r;
				}
			}
		}

		// no answer
		return null;
	}
}
