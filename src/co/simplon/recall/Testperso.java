package co.simplon.recall;

import java.util.ArrayList;
import java.util.List;

public class Testperso {

	public static void main(String[] args) {
		//String[] test = { "john", "david", "omar", "fred", "idris", "angela" };
		System.out.println(checkSiTuPeuxAcheter(20));

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
}