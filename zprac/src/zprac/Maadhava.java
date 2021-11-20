package zprac;

public class Maadhava {
	public static void main(String[] args) {
		int[] a = {2,3,4,1,3,4,2,2,5,43,23,0,32,123,4324,4320,49,32};
		
		int jitu = a[0];
		int tipu = a[1];
		int vitu = a[2];
		
		for (int i = 3; i < a.length; i++) {
			if (jitu <= tipu && jitu <= vitu) {
				jitu += a[i];
			}else if (tipu <= jitu && tipu <= vitu) {
				tipu += a[i];
			}else if (vitu <= jitu && vitu <= tipu) {
				vitu += a[i];
			}
		}
		
		if (vitu == jitu && vitu == tipu && jitu == tipu) {
			System.out.println("Love-e Pap Pap-e Polti");
		}else {
			System.out.println("Happy Eid Day");
		}
	}
}
