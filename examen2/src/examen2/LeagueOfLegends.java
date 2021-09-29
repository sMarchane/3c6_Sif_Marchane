package examen2;

public class LeagueOfLegends extends JeuEquipe{

	public LeagueOfLegends(double heuresJouees, int nombreDeJoueursParEquipe) {
		super(heuresJouees, nombreDeJoueursParEquipe);
		
	}

	@Override
	public String titreDuJeu() {
		return "League of legends";
	}
	public int nombreDeJoueursParEquipe() {
		return 4;
	}

}
