package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
//import villagegauloisold.Etal;
import villagegaulois.IVillage;
import villagegauloisold.DepenseMarchand;

public class Scenario {

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village
		IVillage village = new IVillage() {
			private IEtal[] marche = new IEtal[24]; 
			private int nbEtalOccupes = 0;
			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				if (nbEtalOccupes < marche.length) {
					  marche[nbEtalOccupes] = etal;
					  nbEtalOccupes++;
					  etal.installerVendeur(vendeur, produit, prix);
					  return true;
				}
					return false;
			}

			@Override
			public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee) {
				int i=0;
				int nbDepense=0;
				DepenseMarchand[] depenseMarchands = new DepenseMarchand[marche.length];
				while ((i < nbEtalOccupes && quantiteSouhaitee > 0)) {
					int quantiteDisponible = marche[i].contientProduit(produit, quantiteSouhaitee);
					if (quantiteDisponible>0) {
						double prixPaye=marche[i].acheterProduit(quantiteDisponible);
						quantiteSouhaitee-=quantiteDisponible;
						depenseMarchands[nbDepense]=new DepenseMarchand(marche[i].getVendeur(), quantiteDisponible, produit, prixPaye);
						nbDepense++;
					}
					i++;
				}
				return depenseMarchands;
			}
			@Override
			public String toString() {
				StringBuilder chaine = new StringBuilder();
				for (int i=0;i<nbEtalOccupes;i++) {
					chaine.append(marche[i].etatEtal());
				}
				return chaine.toString();
			}
			
		};
		// fin
		
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
