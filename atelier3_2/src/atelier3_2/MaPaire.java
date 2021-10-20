package atelier3_2;

public class MaPaire <C extends Comparable<C>>implements Paire<C>{

	private C droite;
	private C gauche;
	
	public MaPaire(C valeurUn, C valeurDeux) {
		
		this.gauche = valeurUn;
		this.droite = valeurDeux;
	}
	@Override
	public C obtenirGauche() {
		return gauche;
	}

	@Override
	public C obtenirDroite() {
		return droite;
	}

	@Override
	public void modifierGauche(C nouvelleGauche) {
		gauche = nouvelleGauche;
		
	}

	@Override
	public void modifierDroite(C nouvelleDroite) {
		droite = nouvelleDroite;
		
	}

	@Override
	public C obtenirPlusPetit() {
		C plusPetit = null;
		
		if(gauche.compareTo(droite) > 0) {
			plusPetit = droite;
		}else {
			plusPetit = gauche;
		}
		return plusPetit;
	}

}
