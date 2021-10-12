package tutoriel3_1;

public interface Tableau {

	Comparable obtenirValeur(int index);
	
	void modifierValeur(int index, Comparable nouvelleValeur);
	
	Comparable valeurMinimale();
}
