package examen5;

import tutoriels.examen_gr2.ElementListeGaucheDroite;
import tutoriels.examen_gr2.ListeGaucheDroite;

public class MaListeGaucheDroite<V extends Object> extends ListeGaucheDroite<V> {

	private final int TAILLE_INITIAL = 100;
	private int indicePremierElement = 0;
	
	private V[] elements = nouveauTableau(TAILLE_INITIAL);
	
	
	public MaListeGaucheDroite(Class<V> typeValeur) {
		super(typeValeur);
		
	}

	@Override
	protected ElementListeGaucheDroite<V> atteindreElement(int indiceListe) {
		return null;
	}

	@Override
	protected void decalerVersLaGauche() {
		int position = 0;
		for (int i = indicePremierElement+position; i < indiceGauche(position); i++) {
			elements[i-1] = elements[i];
		}
		
	}

	@Override
	protected int indiceGauche(int indiceListe) {
		int position = -1;
		
		
		for (int i = indiceGauche(position); i > elements.length; i++) {
			if (elements[i].equals(indiceListe)) {
				position = indicePremierElement;
				break;
			}
			
		}
		
		return position;
	}

	@Override
	protected int indiceListeAPartirIndiceDroite(int indiceDroite) {
		int position = -1;
		
		
		for (int i = indiceGauche(position); i > elements.length; i++) {
			if (elements[i].equals(indiceDroite)) {
				position = indicePremierElement;
				break;
			}
			
		}
		return position;
	}

}
