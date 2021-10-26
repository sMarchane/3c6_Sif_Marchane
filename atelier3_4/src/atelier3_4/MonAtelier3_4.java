package atelier3_4;

import tutoriels.atelier3_4.Atelier3_4;
import tutoriels.atelier3_4.Trieur;

public class MonAtelier3_4 extends Atelier3_4{

	public static void main(String[] args ){
		new MonAtelier3_4().valider();
	}
	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurEfficace() {
		return new TrieurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurNaif() {
		return new TrieurNaif<C>();
	}

}
