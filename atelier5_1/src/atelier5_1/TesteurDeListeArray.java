package atelier5_1;

import tutoriels.liste.ListeJava;

public class TesteurDeListeArray extends TesteurDeListeAbstrait {

	@Override
	public ListeJava<Character> nouvelleListe() {
		
		return new ListeJavaArray<>(Character.class);
	}

}
