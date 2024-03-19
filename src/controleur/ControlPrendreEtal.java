package controleur;

import villagegaulois.Village;

import personnages.Gaulois; //Ajouté

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
		//debut modif
		if(village.rechercherEtalVide()==true) {
			return true;
		}
		//fin modif
		return false;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		//TODO a completer
		//debut modif
		//System.out.println(" on est dans Controlprendre etal methode prendre etal \n");
		Gaulois gauloisVendeur = village.trouverHabitant(nomVendeur);
		int numeroEtal = village.installerVendeur(gauloisVendeur, produit, nbProduit);
		//fin modif
		//int numeroEtal = -1; 
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		//modif
		if(controlVerifierIdentite.verifierIdentite(nomVendeur)==true) {
			return true;
		}
		//fin modif
		return false;
	}
}
