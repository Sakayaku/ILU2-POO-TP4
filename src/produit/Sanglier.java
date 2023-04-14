package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	public Sanglier(int poids, Gaulois chasseur) {
		this.poids=poids;
		this.chasseur=chasseur;
		super.nom="sanglier";
	}
	@Override
	public String description() {
		return (nom+" de "+poids+" kg chassé par "+chasseur.getNom()+".");
	}
	@Override
	public double calculerPrix(int prixProduit) {
		return (prixProduit*poids)/1000;
	}
}
