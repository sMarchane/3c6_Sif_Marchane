package atelier3_3;

import tutoriels.atelier3_3.MonTableau;

public interface Tableau<C extends Comparable<C>> {

	boolean siVide();
	
	int longueur();
	C obtenirValeur(int indice);
	
	void modifierValeur(int indice, C nouvelleValeur);
	
	void ajouter(C nouvelleValeur);
	
	void retirer(int indice);
	
	void retirer(C valeur);
	
}
