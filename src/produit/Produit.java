package produit;

public abstract class Produit implements IProduit {
	private String nom;
	public enum UNITE {litre, gramme, kilogramme, centilitre, millilitre, pièce};
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public abstract String description();
	
}
