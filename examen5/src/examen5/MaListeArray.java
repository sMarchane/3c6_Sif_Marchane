package examen5;

import tutoriels.examen_gr2.ListeArray;

public class MaListeArray<V extends Object> extends ListeArray<V>{

	
	private final int TAILLE_INITIAL = 100;
	private int indicePremierElement = 0;
	
	private V[] elements = nouveauTableau(TAILLE_INITIAL);
	
	public MaListeArray(Class<V> typeValeur) {
		super(typeValeur);
		
	}

	private void copier(V[] src, int debutSrc, int finSrc, V[] dst, int debutDst) {
		int decalage = debutDst - debutSrc;
		
		for (int i = debutSrc; i <= finSrc; i++) {
			dst[i+decalage] = src[i];
		}

	}
	@Override
	protected void decalerADroite(int indiceDebut, int indiceFin) {
		for (int i = indiceFin; i >= indiceDebut; i--) {
			elements[i+1] = elements[i];
		}
		
	}

	@Override
	protected boolean doitAgrandir() {
		int ancienneTaille = TAILLE_INITIAL;
		int nouvelleTaille = ancienneTaille * 2;
		
		V[] nouveauxElements = nouveauTableau(nouvelleTaille);
		int nouvelIndicePremierElement = nouvelleTaille - ancienneTaille;
		
		
		copier(elements, ancienneTaille, nouvelleTaille-1, nouveauxElements, 0);
		
		indicePremierElement = nouvelIndicePremierElement;
		elements = nouveauxElements;
		
		return false;
	}

	@Override
	protected int indiceListe(int indiceGrosTableau) {
		int position = -1;
		
		
		for (int i = indicePremierElement; i < elements.length; i++) {
			if (elements[i].equals(grosTableau)) {
				position = indicePremierElement;
				break;
			}
			
		}
		
		return position;
	}

	@Override
	public void insert(int indiceListe, V valeur) {
		if(indicePremierElement == elements.length) {
			doitAgrandir();
		}
		
	}

	@Override
	public void remove(int indiceListe) {
		for (int i = elements.length - 1; i > elements.length; i--) {
			elements[i] = elements[i-1];
		}
		
		
		
	}

	@Override
	public int size() {
		return elements.length;
	}

}
