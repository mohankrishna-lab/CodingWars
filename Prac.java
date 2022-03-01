package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prac {

	public static void main(String[] args) {
		print(new int[] {0,2,5,7,1,4,3,6});
	}
	
	public static int print(int[] row) {
		int count = 0;
		for (int i = 0; i < row.length; i += 2) {
			if (row[i] % 2 == 0 && row[i] + 1 == row[i + 1] || row[i] % 2 != 0 && row[i] - 1 == row[i + 1]) {
				continue;
			} else {
				swapPairs(row, i, i + 1, row[i + 1]);
				count++;
			}
		}
		Arrays.stream(row).forEach(System.out::println);
		System.out.println(count);
		return count;
	}
	public static void swapPairs(int[] row, int i, int j, int swapValue) {
		for (int k = j + 1; k < row.length; k++) {
			if (row[i] % 2 == 0 && row[i] + 1 == row[k]) {
				row[j] = row[k];
				row[k] = swapValue;
				break;
			} else if (row[i] % 2 != 0 && row[i] - 1 == row[k]) {
				row[j] = row[k];
				row[k] = swapValue;
				break;
			}
		}
	}
	
	public static void prints(int[] row) {
		 Map<Integer, Integer> graph = new HashMap<>();
	        for(int i=0; i<row.length; i+=2){
	            graph.put(row[i], row[i+1]);
	            graph.put(row[i+1], row[i]);
	        }
	        
	}
}
