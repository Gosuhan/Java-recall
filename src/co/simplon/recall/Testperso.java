package co.simplon.recall;

import java.util.ArrayList;
import java.util.List;

public class Testperso {

	public static void main(String[] args) {
		//String[] test = { "john", "david", "omar", "fred", "idris", "angela" };
		System.out.println(checkCase2(6,8));

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
}