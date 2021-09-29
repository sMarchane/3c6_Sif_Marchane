package examen2;

public class Valorant extends JeuEquipe{


	public Valorant(double heuresJouees, int nombreDeJoueursParEquipe) {
		super(heuresJouees, nombreDeJoueursParEquipe);
		
	}

	@Override
	public String titreDuJeu() {
		return "Valorant";
	}

	public int nombreDeJoueursParEquipe() {
		return 8;
	}

}
