package co.simplon.recall;

public class Testperso {

	public static void main(String[] args) {
		// int[] arrayIn = { 2, 3, 2, 0, 4, 11, 6, 8 };
		// System.out.println(swapFirstandLastElement(arrayIn));
		System.out.println(numberOfPalindromeWord("kayak,noon, khaleesi, hodor,racecar,ana,tattarrattat,"));
	}

	public static int numberOfPalindromeWord(String text) {
		
		int result = 0;
		String reverseWord = new String();
		
		String [] words = text.split(",");
		
		for (int i = 0; i < words.length-1; i++) {
			
			String word = words[i];
		
			for (int j = word.length()-1; j<= 0;  j--) {
				reverseWord += word.charAt(j);  
			}
			
			if(word == reverseWord) {
				result++;
			}
		}
		
		return result;
	}
}

// public static int fonction() {
//
// int result = 0;
// int premierElement = 1;
// int dernierElement = 2;
// int elementProvisoire = premierElement;
// //System.out.println(premierElement);
//
// premierElement = dernierElement;
// dernierElement = elementProvisoire;
//
// System.out.println(premierElement);
// System.out.println(dernierElement);
//
//
// return result;
// }
// }

// public static int[] swapFirstandLastElement(int[] array ) {
//
// System.out.println(array[0]);
// int[] result = new int[array.length];
// int premierElement = array[0];
// //int j = array.length - 1;
// int dernierElement = array.length - 1;
// int elementProvisoire;
// int j = 0;
//
// for(int i = 0 ; i < array.length; i++) {
// result[j] = array[i];
// elementProvisoire = premierElement;
// premierElement = dernierElement;
// dernierElement = elementProvisoire;
// //System.out.println(result[0]);
// }
//
// return result;
// }
// }


//TEST QUI NE MARCHE PAS :
//public static void main(String[] args) {
//	int[] arrayIn = { 2, 3, 2, 0, 4, 11, 6, 8 };
//	// System.out.println(swapFirstandLastElement(arrayIn));
//	System.out.println(allElementsExceptFirstThree(arrayIn));
//}
//
//public static int[] allElementsExceptFirstThree(int array[]) {
//	int[] result = new int[array.length - 3];
//	
//	for(int i = 3; i<array.length; i++) {
//		result[i] = array[i];
//	}
//	return result;
//}
//}