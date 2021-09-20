package atelier2_3;

import tutoriels.atelier2_3.Accepteur;
import tutoriels.atelier2_3.Atelier2_3;
import tutoriels.atelier2_3.Formateur;

public class MonAtelier2_3 extends Atelier2_3{

	public static void main(String[] args) {
		new MonAtelier2_3().valider();
	}
	@Override
	public Accepteur fournirAccepteur() {
		return new MonAccepteur();
	}

	@Override
	public Formateur fournirFormateur() {
		return new MonFormateur();
	}

}
