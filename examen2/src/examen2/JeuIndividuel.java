package examen2;

public abstract class JeuIndividuel extends JeuVideo{

	public JeuIndividuel(double heuresJouees) {
		super(heuresJouees);
	}

	@Override
	public String typeDeJeu() {
		return "jeu individuel";
	}


}
