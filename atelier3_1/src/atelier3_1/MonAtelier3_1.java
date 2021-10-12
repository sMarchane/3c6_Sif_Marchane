package atelier3_1;

import tutoriels.atelier3_1.Animal;
import tutoriels.atelier3_1.Atelier3_1;
import tutoriels.atelier3_1.Planteur;

public class MonAtelier3_1 extends Atelier3_1{

	public static void main(String[] args) {
		new MonAtelier3_1().valider();
	}
	
	@Override
	public Object creerPaireAnimaux(Animal gauche, Animal droite) {
		return new MaPaire(gauche, droite);
	}

	@Override
	public Object creerPaireChaines(String gauche, String droite) {
		return new MaPaire(gauche, droite);
	}

	@Override
	public Object creerPaireEntiers(int gauche, int droite) {
		return new MaPaire(gauche, droite);
	}

	@Override
	public Planteur fournirPlanteur() {
		return new MonPlanteur();
	}

}
