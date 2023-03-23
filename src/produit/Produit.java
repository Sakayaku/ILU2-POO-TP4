package produit;

public abstract class Produit {
	private String nom;
	public enum UNITE {litre, gramme, kilogramme, centilitre, millilitre, pièce};
	public String getNom() {
		return nom;
	}
	public abstract String description();
	
}
