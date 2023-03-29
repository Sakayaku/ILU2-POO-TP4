package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal {
	private Gaulois vendeur;
	private IProduit<Etal>[] tProduit;
	int nbProduit;
	int prixProduit;
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur=vendeur;
		this.prixProduit=prix;
		tProduit=new IProduit[nbProduit];
	}
}
