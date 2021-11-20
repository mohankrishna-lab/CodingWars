package codingwars;

public class CodingWars6 {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 };
		int[] b = removeDuplicate(a, 3);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] removeDuplicate(int[] elements, int maxOccurrences) {
		int counts = 0;
		for (int i = 0; i < elements.length - 1; i++) {
			int count = 1;
				for (int j = i + 1; j < elements.length; j++) {
					if (elements[i] == elements[j]) {
						count++;
					}
					if (count > maxOccurrences) {
						int k = j;
						int num = elements[i];
						while (k < elements.length) {
							if (elements[k] == num) {
								elements[k] = -1;
								counts++;
							}
							k++;
						}
					}
				}
		}
		int j = 0;
		int[] a = new int[elements.length - counts];
		for (int i = 0; i < a.length;) {
			if (elements[j] != -1) {
				a[i] = elements[j];
				 i++;
			}
			j++;
		}
		return a;
	}
}
