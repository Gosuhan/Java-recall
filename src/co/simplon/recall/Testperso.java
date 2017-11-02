package co.simplon.recall;

public class Testperso {

	public static void main(String[] args) {
		// int[] arrayIn = { 2, 3, 2, 0, 4, 11, 6, 8 };
		// System.out.println(swapFirstandLastElement(arrayIn));
		System.out.println(swapFirstandLastLetter("drago"));
	}

	public static String swapFirstandLastLetter(String array ) {
		
		//String result = "";
		char beginning = array.charAt(0);
	    char end = array.charAt(array.length() - 1);
	    char beginning2 = beginning;
		
//		array.replace(beginning, end);
//		array.replace(end, beginning);
	    array.toCharArray();
	    
		
		return array;
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