package controleur;

import villagegaulois.Village;
import villagegaulois.Etal;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer
	
	public boolean verifIdentVendeur(String nomVendeur) {
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
		
		//On pourra s'en servir pour le verif ident de l'acheteur 
	}
	
	public Etal trouverEtalVendeur(String nomVendeur) {
		return controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
	}
	
	public String[] donnerListeVendeurs() {
		return village.donnerEtatMarche();
	}
	
	public void diminuerQuantiteProduit(int nombreDiminution, String nomVendeur) {
		village.diminerQuantiteProduit(nombreDiminution, nomVendeur);
	}
}
