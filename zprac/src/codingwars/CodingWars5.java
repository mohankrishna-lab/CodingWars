package codingwars;

import zprac.Level;

public class CodingWars5 {
	public static void main(String[] args) {
		System.out.println(print("hi how are you"));	
	}
	
	public static String print(String phrase) {
		 String str = "";
		    if (phrase != null && !phrase.isEmpty()){
		      String[] s = phrase.split(" ");
		      for (String ss : s){
		        for (int i = 0; i < ss.length(); i++){
		          if (i == 0){
		        	  if (ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z') {
		        		  str += ss.charAt(i);
		        	  }else {
		        		  char ch = (char) (ss.charAt(0) - 32);
				            str = str + ch;
		        	  }    
		           }
		          else
		           str += ss.charAt(i);
		        }
		        str += " ";
		      }
		      
		      return str.trim();
		    }
				
				return null;
			}
}
