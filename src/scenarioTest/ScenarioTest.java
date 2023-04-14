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
	Gaulois asterix = new Gaulois("Astérix", 6);
	
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
	marche[0].installerVendeur(asterix, sangliersAsterix, 10);
	marche[1].installerVendeur(obelix, sangliersObelix, 8);
	marche[2].installerVendeur(ordralfabetix, poissons, 7);
	System.out.println("ETAT MARCHE");
	for (int i=0;i<marche.length;i++) {
		System.out.println(marche[i].etatEtal());
	}
	int nbSanglierVoulu=3;
	int nbSanglierTrouve=0;
	int compteur=0;
	int etalVisite=0;
	while ((compteur<nbSanglierVoulu && nbSanglierTrouve!=nbSanglierVoulu) || etalVisite<marche.length) {
		int nbSanglier=marche[compteur].contientProduit("sanglier", (nbSanglierVoulu-nbSanglierTrouve));
		if (nbSanglier!=0) {
			System.out.println("A l'étal "+compteur+" je paye "+marche[compteur].acheterProduit(nbSanglier)+" sous.");
		}
		nbSanglierTrouve+=nbSanglier;
		etalVisite+=1;
		compteur+=1;
	}
	System.out.println("Je voulais "+nbSanglierVoulu+" sanglier, j'en ai acheté "+nbSanglierVoulu);
	System.out.println("ETAT MARCHE");
	for (int i=0;i<marche.length;i++) {
		System.out.println(marche[i].etatEtal());
	}
	}
	
}
