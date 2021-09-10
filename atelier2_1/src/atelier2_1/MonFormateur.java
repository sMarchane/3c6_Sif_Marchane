package atelier2_1;

import tutoriels.atelier2_1.Formateur;

public class MonFormateur implements Formateur{

	@Override
	public String formater(String valeur) {
		
		char[] tab = new char[valeur.length()];
		for (int i = 0; i < valeur.length(); i++) {
			tab[i] = valeur.charAt(i);
			
		}
		valeur = Character.toString(tab[0]) + valeur.length();
		return valeur;
	}

}
