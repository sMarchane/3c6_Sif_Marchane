package atelier4_4;

import tutoriels.atelier4_4.Atelier4_4;
import tutoriels.fichiers.ManipulateurDeFichier;

public class MonAtelier4_4 extends Atelier4_4{
	
	public static void main(String[] args) {
		new MonAtelier4_4().valider();
	}

	@Override
	public ManipulateurDeFichier fournirManipulateurEfficace() {
		
		return new ManipulateurDeFichierEfficace();
	}

	@Override
	public ManipulateurDeFichier fournirManipulateurNaif() {
		
		return new ManipulateurDeFichierNaif();
	}

}
