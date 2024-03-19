package controleur;

import villagegaulois.Etal; //Mon ajout

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	
	//Ma modif 
	public boolean isVendeur(String nomVendeur) {
		Etal etalVendeur = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		if(etalVendeur!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	//fin modif
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		
		Etal etalVendeur = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		
		String[] donneesEtal = new String[5];
		donneesEtal = etalVendeur.etatEtal();
		return donneesEtal;
		
	}

}
