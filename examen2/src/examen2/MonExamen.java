package examen2;

import tutoriels.examen_gr1.Accepteur;
import tutoriels.examen_gr1.Examen2Gr1;

public class MonExamen extends Examen2Gr1{

	public static void main(String[] args) {
		new MonExamen().valider();
	}
	@Override
	public Object creerDoom(double heuresJouees) {
		return new Doom(heuresJouees);
	}

	@Override
	public Object creerLeagueOfLegends(double heuresJouees, int nombreDeJoueursParEquipe) {
		return new LeagueOfLegends(heuresJouees, nombreDeJoueursParEquipe);
	}

	@Override
	public Object creerStarCraft(double heuresJouees) {
		return new StarCraft(heuresJouees);
	}

	@Override
	public Object creerValorant(double heuresJouees, int nombreDeJoueursParEquipe) {
		return new Valorant(heuresJouees, nombreDeJoueursParEquipe);
	}

	@Override
	public Accepteur fournirAccepteur() {
		return new MonAccepteur();
	}

}
