package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		
		return village.rechercherEtalVide();
		
		//fin complétion
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		//TODO a completer
		
		Gaulois vendeur = village.trouverHabitant(nomVendeur);
		int numeroEtal = village.installerVendeur(vendeur, produit, nbProduit);
		return numeroEtal;
		
		//fin complétion 
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
		
		//fin complétion
	}
}
