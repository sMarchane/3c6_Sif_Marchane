package tutoriel3_2;

public interface Tableau<C extends Comparable<C>> {

	C obtenirValeur(int index);
	
	void modifierValeur(int index, C nouvelleValeur);
	
	C valeurMinimale();
}
