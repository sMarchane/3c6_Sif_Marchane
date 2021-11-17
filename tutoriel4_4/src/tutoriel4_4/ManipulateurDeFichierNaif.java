package tutoriel4_4;

import java.io.IOException;
import java.util.List;

public class ManipulateurDeFichierNaif extends ManipulateurDeFichierAbstrait{

	@Override
	public void modifierFichier(int indice, double nouvelleValeur, String nomFichier) throws IOException {
		
		List<Double> valeurs = lireFichier(nomFichier);
		valeurs.set(indice, nouvelleValeur);
		
		ecrireFichier(valeurs, nomFichier);
	}

}
