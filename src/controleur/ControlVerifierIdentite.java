package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		
		 Gaulois habitant = village.trouverHabitant(nomVendeur);
		 return habitant != null;
		 	
		 //fin complétion
	}
}
