package tutoriel3_2;

public class MonTableau <C extends Comparable<C>> implements Tableau<C>{
	private C[]valeurs;
	
	public MonTableau(C[]valeurs) {
		this.valeurs = valeurs;
	}

	@Override
	public C obtenirValeur(int index) {
		return valeurs[index];
	}

	@Override
	public void modifierValeur(int index, C nouvelleValeur) {
		valeurs[index] = nouvelleValeur;
		
	}

	@Override
	public C valeurMinimale() {
		C valeurMinimale = null;
		
		if(valeurs.length > 0) {
			valeurMinimale = valeurs[0];
		}
		
		for (int i = 0; i < valeurs.length; i++) {
			if (valeurs[i].compareTo(valeurMinimale) < 0) {
				valeurMinimale = valeurs[i];
			}
		}
		return valeurMinimale;
	}


	
}
