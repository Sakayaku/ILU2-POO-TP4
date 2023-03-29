package produit;

public class Poisson extends Produit{
	private String date;
	private String nom="poisson";
	public Poisson(String date) {
		this.date=date;
	}
	@Override
	public String description() {
		return null;
	}
	
}
