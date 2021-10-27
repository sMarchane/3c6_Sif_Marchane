package examen3;

public interface Graphe<C extends Comparable<C>> {

	void insererSommet(int sommet);
	
	int sommetLePlusHaut(int plusHaut);
	int sommetLePlusBas(int plusBas);
}
