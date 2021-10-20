package atelier3_2;

public interface Paire <C extends Comparable<C>>{

	C obtenirGauche();
	C obtenirDroite();
	
	void modifierGauche(C nouvelleGauche);
	void modifierDroite(C nouvelleDroite);
	
	C obtenirPlusPetit();
}
