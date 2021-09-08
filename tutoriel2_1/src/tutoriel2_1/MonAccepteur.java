package tutoriel2_1;

import tutoriels.tutoriel2_1.Accepteur;

public class MonAccepteur implements Accepteur{

//nouvelle classe.
	@Override
	public boolean accepter(int valeur) {
		
		return valeur >=10 && valeur <= 99;
	}

}
