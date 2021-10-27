package examen3;

import tutoriels.examen_gr2.Examen3Gr2;
import tutoriels.gr1gr2.Melangeur;
import tutoriels.gr1gr2.Tableau;

public class MonExamen3 extends Examen3Gr2{

	public static void main(String[] args) {
		new MonExamen3().valider();
	}
	@Override
	protected Object creerSommet(int valeur) {
		return new MonGraphe<>();
	}

	@Override
	protected Tableau<String> creerTableauChaines() {
		
		return new MonTableau<String>();
	}

	@Override
	protected Tableau<Double> creerTableauDoubles() {
		return new MonTableau<Double>();
	}

	@Override
	protected Tableau<Integer> creerTableauEntiers() {
		return new MonTableau<Integer>();
	}

	@Override
	public Object fournirGraphe() {
		return new MonGraphe<>();
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurEfficace() {
		return new MelangeurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurNaif() {
		return new MelangeurNaif<C>();
	}

}
