package examen3;

public class Sommet<C extends Comparable<C>> implements Comparable<C>{

	private int hauteur;
	
	public Sommet(int hauteur) {
		
		this.hauteur = hauteur;
	}
	@Override
	public int compareTo(C o) {
		
		if (hauteur > compareTo(o)) {
			hauteur = 1;
		}else {
			hauteur = -1;
		}
		
		return hauteur;
	}

}
