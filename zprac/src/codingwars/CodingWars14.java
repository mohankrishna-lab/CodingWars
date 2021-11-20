package codingwars;

public class CodingWars14 {

	public static void main(String[] args) {
		int[] a = {25, 100};
		System.out.println(Tickets(a));
	}

	  public static String Tickets(int[] peopleInLine)
	  {
			/*
			 * int initialCost = 0; int cost = 0; if (peopleInLine[0] != 25) { return "NO";
			 * } for (int i = 0; i < peopleInLine.length; i++) { if (i == 0 &&
			 * peopleInLine[i] == 25) { cost += 25; initialCost = cost; }else { int
			 * remaining = 0; remaining = peopleInLine[i] - 25; //initialCost +=
			 * peopleInLine[i]; if (remaining == 0 || remaining <= cost) { if
			 * (peopleInLine[i] > 25) { cost = initialCost - peopleInLine[i]; }else { cost =
			 * initialCost + peopleInLine[i]; } initialCost = cost; }else { return "NO"; } }
			 * } return "YES";
			 */
//		  int cost = 0;
//		  if (peopleInLine[0] != 25) {
//			  return "NO";
//		  }
//		  for (int i = 0; i < peopleInLine.length; i++) {
//			  if (i == 0 && peopleInLine[0] == 25) {
//				  cost = 25;
//				  System.out.println(cost);
//			  }else {
//				  if (peopleInLine[i] == 25) {
//					  cost += 25;
//				  }else {
//					  int a = peopleInLine[i] - 25;
//					  cost = cost + 25;
//					  cost = cost - a;
//					  if (!(cost >= 25)) {
//						  return "NO";
//					  }
//				  }
//			  }
//		  }
//		  if (cost >= 25)
//			  return "YES";
//		  else 
//			  return "NO";
		  
		  
		  int remaining = 0;
		  for(int i=0;i<peopleInLine.length;i++) {
			  int current_change_required = peopleInLine[i]-25;
			  if(current_change_required>remaining) {
				  return "NO";
			  }
			  remaining = remaining-current_change_required+25;
			  
		  }
		  
		  return "YES";
	  }
}