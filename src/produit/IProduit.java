package produit;

import villagegaulois.Etal;

public interface IProduit <P extends Etal>{
	String getNom();
	String description();
	private double calculerPrix(int prixProduit) {
		
	}

}