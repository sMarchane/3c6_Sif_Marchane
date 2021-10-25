package tutoriel3_4;

import tutoriels.tutoriel3_4.Chercheur;
import tutoriels.tutoriel3_4.Tableau;

public class ChercheurNaif<C extends Comparable<C>> implements Chercheur<C>{

	@Override
	public int trouverIndicePourValeur(Tableau tableau, Comparable valeur) {
		int indice= -1;
		
		for (int i = 0; i < tableau.longueur(); i++) {
			if(tableau.obtenirValeur(i).compareTo(valeur) == 0) {
				indice = i;
				break;
			}
		}
		
		return indice;
	}

}
