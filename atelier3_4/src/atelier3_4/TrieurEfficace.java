package atelier3_4;

import tutoriels.atelier3_4.MonTableau;
import tutoriels.atelier3_4.Tableau;
import tutoriels.atelier3_4.Trieur;

public class TrieurEfficace<C extends Comparable<C>> implements Trieur<C>{

	//Test de commit et push
	@Override
	public Tableau<C> trier(Tableau<C> entree) {
		Tableau<C> resultat = new MonTableau<C>();
		
		if (entree.longueur() <= 1) {
			resultat = entree;
		}else {
			resultat = trier(entree);
			/*Tableau<C> gauche = sousTableau(entree, 0, entree.longueur()/2);
			Tableau<C> droite = sousTableau(entree, entree.longueur()/2 + 1, entree.longueur());
			gauche = trier(gauche);
			droite = trier(droite);
			resultat = fusionner(gauche, droite);*/
		}
		return resultat;
	}

	private Tableau<C> trierTableau(Tableau <C> entree){
		Tableau<C> resultat = new MonTableau<C>();
		
		int longueur = entree.longueur();
		
		int milieu = longueur/2;
		Tableau<C> gauche = sousTableau(entree, 0, milieu);
		Tableau<C> droite = sousTableau(entree, 0, milieu);
		gauche = trier(gauche);
		droite = trier(droite);
		resultat = fusionner(gauche, droite);
		return resultat;
		
	}
	public Tableau<C> fusionner(Tableau<C> gauche, Tableau<C> droite){
		Tableau<C> resultat = new MonTableau<C>();
		
		resultat = fusionTableau(gauche, droite);
		
		resultat = Element(gauche, droite);
		resultat = Element(droite, gauche);
		return resultat;
		/*Tableau<C> resultat = new MonTableau<C>();
		
		while (gauche.siVide() == false && droite.siVide() == false) {
			if (gauche.obtenirValeur(i).compareTo(droite.obtenirValeur(i)) < 1) {
				resultat = 
			}
			
		}*/
	}
	public Tableau<C> sousTableau(Tableau<C> entree, int indice, int fin){
		Tableau<C> resultat = new MonTableau<C>();
		
		for (int i = indice; i < fin; i++) {
			resultat.ajouter(entree.obtenirValeur(i));
		}
		return resultat;
	}
	private Tableau<C> fusionTableau(Tableau<C> gauche, Tableau<C> droite){
		Tableau<C> resultat = new MonTableau<C>();
		
		while (gauche.siVide() == false && droite.siVide() == false) {
			if (gauche.obtenirValeur(0).compareTo(droite.obtenirValeur(0)) < 1) {
				resultat = deplacerElement(gauche, resultat);
			}else {
				resultat = deplacerElement(droite, resultat);
			}
			
		}		
		return resultat;
	}
	private Tableau<C> deplacerElement(Tableau<C> entree, Tableau<C> fin){
		fin.ajouter(entree.obtenirValeur(entree.longueur()-1));
		entree.retirer(-1);
		
		return fin;
	}
	private Tableau<C> Element(Tableau<C> entree, Tableau<C> fin){
		while (entree.siVide() == false) {
			deplacerElement(entree, fin);
			
		}
		return fin;
	}
}
