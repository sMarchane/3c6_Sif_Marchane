package examen4;

import tutoriels.gr1gr2.EcrireDansFichier;
import tutoriels.gr1gr2.ModificateurDeFichier;
import tutoriels.json.MonObjetJson;
import tutoriels.json.ValeurJson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MonModificateurDeFichier implements ModificateurDeFichier{

	@Override
	public EcrireDansFichier modifierObjet(MonObjetJson objetDejaEcrit, String cle, ValeurJson nouvelleValeur) {
		
		
		int decalage = 0;
		String aEcrire = "";
		/*int tailleOuverture = "\" { \"".length();
		int tailleClé = "\"6 \"".getBytes().length;*/
		
		File fichier = new File(cle);
		OutputStream out = new FileOutputStream(fichier);
		for (int i = 0; i < decalage; i++) {
			out.write(formaterDouble(decalage.get(i)).getBytes());
			out.write(System.lineSeparator().getBytes());
		}
		
		aEcrire = "\"" + cle + "\":" + nouvelleValeur;
		
		return new EcrireDansFichier(decalage, aEcrire);
	}

}
