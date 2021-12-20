package atelier5_1;

import atelier5_1.ListeJavaNaive;
import tutoriels.liste.ListeJava;

public class TesteurDeListeNaive extends TesteurDeListeAbstrait{

	//
	@Override
	public ListeJava<Character> nouvelleListe() {
		return new ListeJavaNaive<>(Character.class);
	}

}
