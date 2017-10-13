package co.simplon.recall;

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
			//if (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'e' || array[i].charAt(0) == 'i' || array[i].charAt(0) == 'o' || array[i].charAt(0) == 'u' || array[i].charAt(0) == 'y') {
			if (array[i].matches("[aeiouy].*")) {	
				result.add(array[i]);
			}
		}
		return result;
	}

	public static String[] removeNullElements(String array[]) {
		
		String[] result;
		
		for(int i=0; i<array.length; i++) {
			if (array[i] != null) {
				result.add(array[i]);
			}
		}
		return result;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		
		//ArrayList<String> resultat = new ArrayList<String>();			}
		
		
		
		return null;
	}

	public static String getFirstHalf(String string) {
		return null;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		return null;
	}

	public static String longestWord(String text) {
		return null;
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
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
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
		
		
		
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		return false;
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
		return false;
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		return false;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		return false;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		return false;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
