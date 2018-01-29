package co.simplon.recall;

import java.lang.reflect.Array;
import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=0; i<array.length; i++) {
			//ou if (array[i].charAt(0) == 'a') {
			if (array[i].startsWith("a")) {
				result.add(array[i]);
			}
		}
		return result;
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

	public static String[] removeNullElements(String array[]) {
		
		int nbreElementNull = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				nbreElementNull = nbreElementNull + 1; // ou nbreElementNull ++; ou nbreElementNul += 1;
			}
		}
		
		String[] result = new String[array.length - nbreElementNull];
		int j = 0;		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				result[j] = array[i];
				j++;
			}
		}
		
		return result;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		
		String[] result = new String [array.length];
		
		for(int i = 0; i<array.length; i++) {
			
			String mot = array[i];
			StringBuffer motInverse = new StringBuffer();
			
			for (int j = mot.length() - 1; j >= 0; j--) {
				
				motInverse.append(mot.charAt(j));
				result[i] = motInverse.toString();
			}
		}
		
		return result;

	}

	public static String[] reverseOrderInArray(String array[]) {
		
		String[] result = new String[array.length];
		
		for (int i = 0; i < array.length; i++) {
			result[array.length-1 - i] = array[i];
		}
		
		return result;
	}

	public static String[][] everyPossiblePair(String array[]) {
		
//		String[][] result = new String[array.length][array.length - 1];
//	
//		
//		//result[][] = {{3,1}, {3, 2}, {1, 2}};
//		
//		//result = {{"Daenerys","Jon"}, {"Daenerys", "Tyrion"}, {"Jon", "Tyrion"}};
//		
//		
////		for( int i = 0; i< array.length; i++){
////			   for( int j = 0; j<array.length - 1; j++){
////			      result[i][j] = {{array[array.length-1], },{array[i]}};
////			   }
////		}
//		return result;
	
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		
		//ArrayList<String> resultat = new ArrayList<String>();			}
		
		
		
		return null;
	}

	public static String getFirstHalf(String string) {
		
		int half = 0;
		
		if(string.length() %2 == 0) {
			half = string.length() / 2;
		}
		else {
			half = (string.length() / 2) + 1;
		}
		
		string = string.substring(0, half);
		
		return string;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		
//		int result = 0;
//		String reverseWord = new String();
//		
//		String [] words = text.split("'");
//		
//		for (int i = 0; i < words.length-1; i++) {
//			
//			String word = words[i];
//		
//			for (int j = word.length()-1; j<= 0;  j--) {
//				reverseWord += word.charAt(j);  
//			}
//			
//			if(word == reverseWord) {
//				result++;
//			}
//		}
//		
//		return result;
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		
		String[] words = text.split(" ");
		String shortWord = words[0];
		
		for (int i = 0; i<words.length; i++) {
			if(shortWord.length() > words[i].length()) {	
				shortWord = words[i];
			}
		}	
		
		return shortWord;
	}

	public static String longestWord(String text) {
		
		text = text.replaceAll("[,.]", "");
		String[] words = text.split(" ");
		String longWord = words[0];
		
		for (int i = 0; i<words.length; i++) {
			if(longWord.length() < words[i].length()) {	
				longWord = words[i];
			}
		}	
		
		return longWord;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		
//		String[] caractSpec = {"!", "?", "@", "*"};
//		
////		for(int i = 0; i < string.length(); i++) {
//			if(string.contains(caractSpec)) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
		return false;
	}
	
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		
		long resultat = number1 + number2;
		
		return resultat;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		
		long resultat = number1 + number2 + number3;
		
		return resultat;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		int[] result = new int[array.length - 3];
		
		for(int i = 3; i<array.length; i++) {
			result[i-3] = array[i];
		}
		return result;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		
//		int nbreElementThanSix = 0;
//		for(int i = 0; i < array.length; i++) {
//			if(array[i].equals("1")/*("1 | 2 | 3 | 4 | 5 | 6")*/ || array[i].equals("2") || array[i].equals("3") || array[i].equals("4") || array[i].equals("5") || array[i].equals("6")) {
//				nbreElementThanSix ++; //= nbreElementThanSix + 1; ou nbreElementNull ++; ou nbreElementNul += 1;
//			}
//		}
//		
//		String[] result = new String[nbreElementThanSix];
//		int j = 0;		
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i].equals("1")/*("1 | 2 | 3 | 4 | 5 | 6")*/ || array[i].equals("2") || array[i].equals("3") || array[i].equals("4") || array[i].equals("5") || array[i].equals("6")) {
//				result[j] = array[i];
//				j++;
//			}
//		}
//		
//		Set<String> monSet = new LinkedHashSet<String>();
//		monSet.add(result[j++]);
//		
//		String[] result2 = new String[nbreElementThanSix](monSet);
//		
//		return result2;
//		return result; //NE PAS PRENDRE ELEMENTS EN DOUBLE !!!
//		
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		
		number = Math.round(number);
		return (int)number;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int convertToCelsius(int temperature) {
		
		double t = (double)temperature;
		double degresCelcius = ((t - 32)* 5) / 9;
		
		return (int)Math.round(degresCelcius);
	}
	
	public static boolean checkIfPair(int number) {
		
		if (number %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		
		if (number1 %2 == 0 && number2 %2 == 0 && number3 %2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		
		if ((number1 + number2 + number3) %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		
		int test = 0;
		for (int i = 0; i < array.length ; i++) {
			if (array[i] %2 == 0) {
				test++;
			}
		}
		
		if (test == array.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] %2 == 0) {
				resultat.add(array[i]);
			}
		}
		
		return resultat;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		
		ArrayList<Integer> resultatTsPairs = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] %2 == 0) {
				resultatTsPairs.add(array[i]);
			}
		}

		Set<Integer> monSet = new LinkedHashSet<Integer>(); // Ordre de sortie respecté contrairement à TreeSet ou hashSet (http://blog.paumard.org/cours/java-api/chap01-api-collection-set.html)
		monSet.addAll(resultatTsPairs);
		
		ArrayList<Integer> resultatUniquePairs = new ArrayList<Integer>(monSet);
		
		return resultatUniquePairs;

	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean reponse = false;
		
		int cote1 = number1 * number1;
		int cote2 = number2 * number2;
		int cote3 = number3 * number3;
		
		if(cote1 + cote2 == cote3 || cote2 + cote3 == cote1 || cote1 + cote3 == cote2) {
			reponse = true;
		}
		
		return reponse;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		if ((prix <= 22) && (prix %2 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		
		double prixTotal = prix- (prix * pourcentDeRemise / 100);
				
		if ( prixTotal <= 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		
		if (number1 %7 == 0 || number2 %7 == 0 || (number1 + number2) %7 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		if ((number1 %7 == 0 || number2 %7 == 0) && (number1 + number2) %7 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if ((number1 < number2 && number2 < number3) || (number1 > number2 && number2 > number3)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		
//		ArrayList<Integer> result = new ArrayList<Integer>();
//		
//		int j = 0;
//		
//		for(int i = 1; i < array.length - 1; i++) {
//			result[j] = array[i];
//			j++;
//		}
//		
//		return result;
		
		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		
		int nbreElementRetire = 2;
		int[] result = new int[array.length - nbreElementRetire];
		int j = 0;
		
		for(int i = 1; i < array.length - 1; i++) {
			result[j] = array[i];
			j++;
		}
		
		return result;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length ; i++) {
			int indice = i;
			if (indice %2==0) {
				result.add(array[i]);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		
//		ArrayList<Integer> resultat = new ArrayList<Integer>();
//		Collections.reverse(array);
//		return resultat;
		return null;

	}
	
	public static int[] reverseOrderInt(int array[]) {
		
//		List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size() ; i++) {
			if (list.get(i) %2==0) {
				result.add(list.get(i));
			}
		}
		
		return result;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size() ; i++) {
			int indice = i;
			if (indice %2==0) {
				result.add(list.get(i));
			}
		}
		
		return result;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		
		if (word.startsWith("a") || word.startsWith("A")) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		
		if (word.matches("[a|e|i|o|u|y|A|E|I|O|U|Y].*")) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		
		if (word.endsWith("s") || word.endsWith("S")) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public static String findShortestWord(String[] array ) {
		
		int tailleMot = array[0].length();
		int indice = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i].length() < tailleMot) {
				indice = i;
				tailleMot = array[i].length();
			}
		}
		return array[indice];
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
//		//String result = "";
//		
//		char beginning = array.charAt(0);
//	    char end = array.charAt(array.length() - 1);
//	    char beginning2 = beginning;
//		
////		array.replace(beginning, end);
////		array.replace(end, beginning);
//	    array.toCharArray();
//	    beginning = end;
//	    end = beginning2;
//	    
//		
//		return array;
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
//		int[] result = new int[array.length];
//		
//		int j = 0;
//		
//		for(int i = 0 ; i < array.length ; i++) {
//			result[j] = array[i];
//			j++;
//		}
//		
//		int premierElement = result[0];
//		//int j = array.length - 1;
//		int dernierElement = result[result.length - 1];
//		int elementProvisoire = premierElement;
//		
//		for(int i = 0; i < result.length ; i++) {
//			//elementProvisoire = premierElement;
//			premierElement = dernierElement;
//			dernierElement = elementProvisoire;
//			//System.out.println(result[0]);
//		}
		int[] result = new int[array.length];
		int premierElement = array[0];
		//int j = array.length - 1;
		int dernierElement = array[array.length - 1];
		//int elementProvisoire = premierElement;
		int j = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			result[j] = array[i];
			j++;
		}
//		premierElement = dernierElement;
//		dernierElement = elementProvisoire;
		result[0] = dernierElement;
		result[result.length - 1] = premierElement;
		
		return result;
	}

}
