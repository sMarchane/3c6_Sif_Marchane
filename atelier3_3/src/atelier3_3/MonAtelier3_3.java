package atelier3_3;

import tutoriels.atelier3_3.Atelier3_3;
import tutoriels.atelier3_3.Trieur;

public class MonAtelier3_3 extends Atelier3_3{

	public static void main(String[] args) {
		new MonAtelier3_3().valider();
	}
	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurNaif() {
		
		return new TrieurNaif<C>();
	}

}
