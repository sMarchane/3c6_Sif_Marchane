package examen5;

import tutoriels.examen_gr2.Examen5Gr2;
import tutoriels.examen_gr2.ListeArray;
import tutoriels.liste.ListeJava;

public class MonExamen5 extends Examen5Gr2{

	public static void main(String[] args) {
		new MonExamen5().valider();
	}
	@Override
	public ListeJava<Character> fournirListeArray() {
		
		return new MaListeArray<Character>(Character.class);
		
	}

	@Override
	public ListeJava<Character> fournirListeGaucheDroite() {
		
		return new MaListeGaucheDroite<Character>(Character.class);
	}

}
