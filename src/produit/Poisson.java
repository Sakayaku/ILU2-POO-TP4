package produit;

public class Poisson extends Produit{
	private String date;
	public Poisson(String date) {
		this.date=date;
		super.nom="poisson";
	}
	@Override
	public String description() {
		return (nom+" pêché "+date+".");
	}
	@Override
	public double calculerPrix(int prixProduit) {
		return prixProduit;
	}
	
}
