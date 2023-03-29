package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	private String nom="sanglier";
	public Sanglier(int poids, Gaulois chasseur) {
		this.poids=poids;
		this.chasseur=chasseur;
	}
	@Override
	public String description() {
		return null;
	}
}
