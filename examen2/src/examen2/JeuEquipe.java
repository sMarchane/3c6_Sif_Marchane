package examen2;

public abstract class JeuEquipe extends JeuVideo{

	private int nombreDeJoueursParEquipe = 0;
	
	public void ajouterJoueurs(int nombre) {
		
	}
	
	public JeuEquipe(double heuresJouees, int nombreDeJoueursParEquipe) {
		super(heuresJouees);
		
		this.nombreDeJoueursParEquipe = nombreDeJoueursParEquipe;
	}

	@Override
	public String typeDeJeu() {
		return "jeu d'équipe";
	}

	@Override
	public String formater() {
		
		return super.formater() + " à " + nombreDeJoueursParEquipe + " joueurs";
		
	}
}
