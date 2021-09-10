package atelier2_1;

import tutoriels.atelier2_1.Accepteur;

public class MonAccepteur implements Accepteur{

	@Override
	public boolean accepter(String valeur) {
		
		int compteur = 0;
		boolean acc = false;
		
		char[] tab = new char[valeur.length()];
		for (int i = 0; i < valeur.length(); i++) {
			tab[i] = valeur.charAt(i);
			
		}
		char tab1 = tab[0];
		for (int j = 0; j < tab.length; j++) {
			if (tab.length > 0 && tab1 == tab[j]) {
				compteur = compteur + 1;
				acc = true;
			}else {
				acc = false;
			}
		}
		return acc;

	}
}
