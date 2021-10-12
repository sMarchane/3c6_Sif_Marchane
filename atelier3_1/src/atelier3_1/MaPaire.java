package atelier3_1;

public class MaPaire implements Paire{

	private Comparable droite;
	private Comparable gauche;
	
	public MaPaire(Comparable valeurUn, Comparable valeurDeux) {
		
		this.gauche = valeurUn;
		this.droite = valeurDeux;
	}
	@Override
	public Comparable obtenirGauche() {
		return gauche;
	}

	@Override
	public Comparable obtenirDroite() {
		return droite;
	}

	@Override
	public void modifierGauche(Comparable nouvelleGauche) {
		gauche = nouvelleGauche;
		
	}

	@Override
	public void modifierDroite(Comparable nouvelleDroite) {
		droite = nouvelleDroite;
		
	}

	@Override
	public Comparable obtenirPlusPetit() {
		Comparable plusPetit = null;
		
		if(gauche.compareTo(droite) > 0) {
			plusPetit = droite;
		}else {
			plusPetit = gauche;
		}
		return plusPetit;
	}

}
