package codingwars;

public class CodingWars2 {
	public static void main(String[] args) {
		int num = 535534531;
		print(num);
	}
	
	public static void print(int num) {
		String s = "";
		String str = "";
		if (num == 0)
		{
			s += 0;
		}
		int num1 = num;
		while(num1 > 0) {
			s = s + num1 % 10;
			num1 /= 10;
		}
		
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		
		System.out.println(Integer.parseInt(str));
	}
}
