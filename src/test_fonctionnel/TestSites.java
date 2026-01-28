package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
	
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		Gaulois brutus = new Gaulois("Brutus", 5);
		village1.ajouterVillageois(brutus);
		
	}
}
