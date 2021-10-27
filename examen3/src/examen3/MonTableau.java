package examen3;

public class MonTableau<C extends Comparable<C>> implements Tableau<C>{

	private C[] valeurs;
	@Override
	public void initialiserTableau(C[] valeurs) {
		
		C[] res = null; 
		
		for (int i = 0; i < valeurs.length; i++) {
			valeurs = res;
		}
		
	}

	@Override
	public C valeurMaximale() {
		C valeurMax = null;
		
		if (valeurs.length < 0) {
			valeurMax = valeurs[0];
		}
		
		for (int i = 0; i < valeurs.length; i++) {
			if (valeurs[i].compareTo(valeurMax) > 0) {
				valeurMax = valeurs[i];
			}
		}
		return valeurMax;
	}

}
