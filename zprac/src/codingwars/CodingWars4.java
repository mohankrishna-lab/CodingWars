package codingwars;

public class CodingWars4 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 6; i <= 1000; i++) {
			/*
			 * if (seriesSum(i).equals(seriesSum(i))) { System.out.println("this will work "
			 * + i); }else { count++; }
			 */
			
			System.out.println(seriesSum1(i));
		}
		System.out.println(count);
	}
	
	
	public static String seriesSum(int n) {
    double num = 1;
    int j = 4;
    if (n == 0){
      String.valueOf(0.00);
    }else{
      for (int i = 1; i < n; i++){
        num += (double)1/j;
        j = j + 3;
      }
    }
    String s = String.valueOf(num);
    char[] ch = s.toCharArray();
    String ss  = "";
    for (int i = 0; i < ch.length; i++) {
		if (i == 3) {
			if (ch[4] > '5') {
				ss += ch[3] - 47;
			break;
			}else
				ss += ch[3] - 48;
			break;
		}
		ss += ch[i];
	}
    return ss;
	}
	
	 public static String seriesSum1(int n) {
		    
		    double sum = 0.0;
		    for (int i = 0; i < n; i++)
		      sum += 1.0 / (1 + 3 * i);
		    
		    return String.format("%.2f", sum);
		    
		  }
}
