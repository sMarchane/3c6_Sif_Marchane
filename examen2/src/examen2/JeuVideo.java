package examen2;


public abstract class JeuVideo implements Formateur{

	private double heuresJouees;
	
	protected abstract String titreDuJeu();
	protected abstract String typeDeJeu();
	
	
	public void jouer(double nombreHeures) {
		
	}
	public String transformerEnNomDeMethode(String texte) {
		return texte;
	}

	public JeuVideo(double heuresJouees) {
		this.heuresJouees = heuresJouees;
	}
	@Override
	public String formater() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("On a joué ");
		builder.append(heuresJouees);
		builder.append(" heures à ");
		builder.append(titreDuJeu());
		builder.append(". Il s'agit d'un ");
		builder.append(typeDeJeu());
		return builder.toString();
	}
	@Override
	public String titreCommeNomDeMethode() {

		
		return titreDuJeu().replaceAll("\\s+", "");
		
	}

}
