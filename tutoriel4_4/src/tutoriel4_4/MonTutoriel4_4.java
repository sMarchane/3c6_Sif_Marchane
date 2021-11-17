package tutoriel4_4;

import tutoriels.fichiers.ManipulateurDeFichier;
import tutoriels.tutoriel4_4.Tutoriel4_4;

public class MonTutoriel4_4 extends Tutoriel4_4{

	public static void main(String[] args) {
		new MonTutoriel4_4().valider();
	}
	
	@Override
	public ManipulateurDeFichier fournirManipulateurNaif() {
		
		return new ManipulateurDeFichierNaif();
	}

}
