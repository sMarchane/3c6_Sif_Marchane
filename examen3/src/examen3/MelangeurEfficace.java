package examen3;

public class MelangeurEfficace<C extends Comparable<C>> implements Melangeur<C> {

	@Override
	public Liste<C> melanger(Liste<C> entree) {
		Liste<C> res = new Liste<C>();
		
		while (entree.siVide() == false) {
			C nouvelleListe = entree.obtenirValeur(nouvelleListe);
			res.ajouter(nouvelleListe);
		}
		return res;
	}

	private Liste<C> melangeur(Liste<C> entree){
		Liste<C> res = new Liste<C>();
		
		int taille = entree.longueur();
		
		int pivot = taille/2;
		
		Liste<C> gauche = sousTableau(entree, 0, pivot);
		Liste<C> droite = sousTableau(entree, 0, pivot);
		res = fusion(gauche, droite);
		
		return res;
	}
	
	private Liste<C> fusion(Liste<C> gauche, Liste<C> droite){
		Liste<C> res = new Liste<C>();
		
		res = fusionTableau(gauche, droite);
		res = Element(gauche, droite);
		res = Element(droite, gauche);
		return res;
	}
	private Liste<C> sousTableau(Liste<C> entree, int indice, int fin){
		Liste<C> res = new Liste<C>();
		
		for (int i = indice; i < fin; i++) {
			res.ajouter(entree.obtenirValeur(i));
		}
		return res;
	}
	private Liste<C> fusionTableau(Liste<C> gauche, Liste<C> droite){
		Liste<C> res = new Liste<C>();
		
		while (gauche.siVide() == false && droite.siVide() == false) {
			if (gauche.obtenirValeur(0).compareTo(droite.obtenirValeur(0)) < 1) {
				res = deplacerElement(gauche, res);
			}else {
				res = deplacerElement(droite, res);
			}
			
		}
		return res;
	}
	private Liste<C> deplacerElement(Liste<C> entree, Liste<C> fin){
		fin.ajouter(entree.obtenirValeur(entree.longueur()-1));
		entree.retirer(-1);
		return fin;
	}
	private Liste<C> Element(Liste<C> entree, Liste<C> fin){
		while (entree.siVide() == false) {
			deplacerElement(entree, fin);	
		}
		
		return fin;
	}
	
}
