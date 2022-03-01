package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingWars9 {

	public static void main(String[] args) {
		Arrays.stream(dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})).forEach(System.out::println);
	}

    public static String[] dirReduc(String[] arr) {
        List<String> finalDirections = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
        	String presentDirection = arr[i];
        	boolean flag = true;
        	if (arr.length - 1 == i) {
        		if (finalDirections.size() > 0) {
        			String lastElement = finalDirections.get(finalDirections.size() - 1);
        			if (presentDirection.equals("SOUTH") && lastElement.equals("NORTH") ||
        				presentDirection.equals("NORTH") && lastElement.equals("SOUTH") ||
        				presentDirection.equals("EAST") && lastElement.equals("WEST") ||
        				presentDirection.equals("WEST") && lastElement.equals("EAST")) {
        				finalDirections.remove(finalDirections.size() - 1);
        				flag = false;
        			} else {
        				finalDirections.add(presentDirection);
        				flag = false;
        			}
        		}
        		if (flag) {
        			finalDirections.add(presentDirection);
        		}
        		break;
        	}
        	String nextDirection = arr[i + 1];
        	if (presentDirection.equals("SOUTH") && nextDirection.equals("NORTH") ||
        		presentDirection.equals("NORTH") && nextDirection.equals("SOUTH") ||
        		presentDirection.equals("EAST") && nextDirection.equals("WEST") ||
        		presentDirection.equals("WEST") && nextDirection.equals("EAST")) {
        		i++;
        	} else {
        		boolean flagCheck = true;
        		if (finalDirections.size() > 0) {
        			String lastElement = finalDirections.get(finalDirections.size() - 1);
        			if (presentDirection.equals("SOUTH") && lastElement.equals("NORTH") ||
        				presentDirection.equals("NORTH") && lastElement.equals("SOUTH") ||
        				presentDirection.equals("EAST") && lastElement.equals("WEST") ||
        				presentDirection.equals("WEST") && lastElement.equals("EAST")) {
        				finalDirections.remove(finalDirections.size() - 1);
        				flagCheck = false;
        			}
        		}
        		if (flagCheck) {
        			finalDirections.add(presentDirection);
        		}
        	}
        }
        
        return finalDirections.toArray(new String[0]);
    }
}
