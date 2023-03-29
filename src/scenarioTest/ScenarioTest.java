package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
	IEtal[] etals = new IEtal[3]; 
	Etal<Sanglier> etalSanglier = new Etal< >(); 
	etals[0] = etalSanglier; 	
	etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);
	
	Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
	Gaulois obelix = new Gaulois("Obélix",20);
	Gaulois asterix = new Gaulois("Asterix", 6);
	
	Sanglier sanglier1 = new Sanglier(2000, obelix);
	Sanglier sanglier2 = new Sanglier(1500, obelix);
	Sanglier sanglier3 = new Sanglier(1000, asterix);
	Sanglier sanglier4 = new Sanglier(500, asterix);
	Sanglier[] sangliersObelix = {sanglier1, sanglier2};
	Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
	Poisson poisson1 = new Poisson("lundi");
	Poisson[] poissons = {poisson1};
	
	}
	
}
