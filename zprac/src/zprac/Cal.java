package zprac;

public class Cal {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 15; i++) {
			if (i % 2 != 0) {
				int sum = i;
				for (int j = 3; j <= 15; j++) {
					if (j % 2 != 0) {
						sum += j;
						for (int k = 5; k <= 15; k++) {
							if (k % 2 != 0 && k != i && k != j && i != j) {
								sum += k;
								if (sum == 30) {
									System.out.println(i + " " + j + " " + k);
								}
								sum -= k;
							}
						}
						sum -= j;
					}
				}
			}
		}
	}
}
