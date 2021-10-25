package tutoriel3_4;

import tutoriels.tutoriel3_4.Chercheur;
import tutoriels.tutoriel3_4.Tutoriel3_4;

public class MonTutoriel3_4 extends Tutoriel3_4{

	public static void main(String[] args) {
		new MonTutoriel3_4().valider();
	}
	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurEfficace() {
		
		return new ChercheurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurNaif() {
		
		return new ChercheurNaif<C>();
	}

}
