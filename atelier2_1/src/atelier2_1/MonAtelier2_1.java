package atelier2_1;

import tutoriels.atelier2_1.Accepteur;
import tutoriels.atelier2_1.Atelier2_1;
import tutoriels.atelier2_1.Formateur;

public class MonAtelier2_1 extends Atelier2_1{

	public static void main(String[] args) {
		new MonAtelier2_1().valider();
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
