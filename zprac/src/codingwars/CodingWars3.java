package codingwars;

public class CodingWars3 {
	public static void main(String[] args) {
		String s = "hi";
		print(s, "hello", "man");
		String[] names = {"Peter", "john", "mike"};
		System.out.println(whoLikesIt(names));
	}
	
	public static void print(String... s) {
		
	}
	
    public static String whoLikesIt(String... names) {
        //Do your magic here
      String s = "";
      
      if (names.length == 0){
        return "no one likes this";
      }else if (names.length == 1){
        return names[0] + " likes this";
      }else if (names.length == 2 || names.length == 3){
        for (int i = 0; i < names.length - 1; i++){
          s += names[i];
          if (names.length - 2 != i)
             s += ", ";
        } 
             s += " and ";
             s += names[names.length - 1];
             s += " like this"; 
      }else {
    	  s += names[0] + ", " + names[1] + " and ";
    	  s += names.length - 2;
    	  s += " others like this";
      }
      
      
        return s;
    }
}
