package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.IEtal;
import villagegaulois.Etal;
//import villagegauloisold.Etal;
//import villagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
	//IEtal[] etals = new IEtal[3]; 
	//Etal<Sanglier> etalSanglier = new Etal< >(); 
	//etals[0] = etalSanglier; 	
	//etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
	
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
	
	Etal[] marche =new Etal[3];
	Etal <Sanglier> etalSanglier1 = new Etal<>();
	Etal <Sanglier> etalSanglier2 = new Etal<>();
	Etal <Poisson> etalPoisson = new Etal<>();
	marche[0]=etalSanglier1;
	marche[1]=etalSanglier2;
	marche[2]=etalPoisson;
	marche[0].installerVendeur(obelix, sangliersObelix, 8);
	marche[1].installerVendeur(asterix, sangliersAsterix, 10);
	marche[2].installerVendeur(ordralfabetix, poissons, 7);
	}
	
}
