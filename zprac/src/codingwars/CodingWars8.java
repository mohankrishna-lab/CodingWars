package codingwars;

public class CodingWars8 {
	public static void main(String[] args) {
		String s1 = "world";
		String s2 = "d3";
		System.out.println(solution(s1, s2));
	}
	
	public static boolean solution(String s1, String s2) {
		if (s1.endsWith(s2)) 
			return true;
		return false;
	}
}
