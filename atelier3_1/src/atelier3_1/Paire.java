package atelier3_1;

public interface Paire {

	Comparable obtenirGauche();
	Comparable obtenirDroite();
	
	void modifierGauche(Comparable nouvelleGauche);
	void modifierDroite(Comparable nouvelleDroite);
	
	Comparable obtenirPlusPetit();
}
