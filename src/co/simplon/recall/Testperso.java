package co.simplon.recall;

public class Testperso {

	public static void main(String[] args) {
		System.out.println(checkCase1(100, 30));

	}

	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		
		boolean deQuoiPayer = true;
		
		double prixTotal = prix- (prix * pourcentDeRemise / 100);
				
		if ( prixTotal <= 100) {
			return deQuoiPayer;
		}
		else {
			return false;
		}
	}
}