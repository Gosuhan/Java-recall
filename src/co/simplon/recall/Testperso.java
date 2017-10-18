package co.simplon.recall;

import java.util.ArrayList;
import java.util.List;

public class Testperso {

	public static void main(String[] args) {
		String[] test = { "john", "david", "omar", "fred", null, "idris", "angela" };
		System.out.println(selectElementsStartingWithVowel(test));

	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=0; i<array.length; i++) {
			
			if (array[i] == null) {}
			//if (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'e' || array[i].charAt(0) == 'i' || array[i].charAt(0) == 'o' || array[i].charAt(0) == 'u' || array[i].charAt(0) == 'y') {
			else if (array[i].matches("[a|e|i|o|u|y].*")) {	
				result.add(array[i]);
			}
		}
		
		return result;
	}
}