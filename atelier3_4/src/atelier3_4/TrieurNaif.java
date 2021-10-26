package atelier3_4;

import tutoriels.atelier3_4.MonTableau;
import tutoriels.atelier3_4.Tableau;
import tutoriels.atelier3_4.Trieur;

public class TrieurNaif<C extends Comparable<C>> implements Trieur<C>{

	@Override
	public Tableau<C> trier(Tableau<C> entree) {
		
		Tableau<C> resultat = new MonTableau<C>();
		while (entree.siVide() == false) {
			C valeurMinimale = valeurMinimale(entree);
			
			entree.retirer(valeurMinimale);
			resultat.ajouter(valeurMinimale);
		}
		
			return resultat;
	}
	private C valeurMinimale(Tableau<C> tableau) {
		C valeurMinimale = null;
		
		if(tableau.longueur() > 0) {
			valeurMinimale = tableau.obtenirValeur(0);
		}
		for (int i = 1; i < tableau.longueur(); i++) {
			if(tableau.obtenirValeur(i).compareTo(valeurMinimale) < 0) {
				valeurMinimale = tableau.obtenirValeur(i);
			}
		}
		return valeurMinimale;
	}		
}
