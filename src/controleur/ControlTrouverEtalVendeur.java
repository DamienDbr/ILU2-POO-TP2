package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;
import personnages.Gaulois;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		//TODO a completer
		Gaulois vendeur = village.trouverHabitant(nomVendeur);
		if(vendeur!=null) {
			Etal etal;
			etal = village.rechercherEtal(vendeur);
			return etal;
		}
		return null;
	}
	
	//A tenter
	//public Etal trouverEtalVendeurAvecNomProduit
}
