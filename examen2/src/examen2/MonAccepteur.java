package examen2;

import tutoriels.examen_gr1.Accepteur;

public class MonAccepteur implements Accepteur{

	@Override
	public boolean accepterJeuIndividuel(Object jeu) {
		return false;
	}

	@Override
	public boolean accepterQuatreJoueursEtMoins(Object jeu) {
		return false;
	}

}
