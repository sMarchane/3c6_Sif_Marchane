package examen3;

public interface Melangeur<C extends Comparable<C>> {

	Liste<C> melanger(Liste<C> entree);
}
