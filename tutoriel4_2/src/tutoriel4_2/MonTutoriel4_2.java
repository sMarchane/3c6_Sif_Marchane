package tutoriel4_2;

import tutoriels.tutoriel4_2.Chercheur;
import tutoriels.tutoriel4_2.Tutoriel4_2;

public class MonTutoriel4_2 extends Tutoriel4_2{

	public static void main(String[] args) {
		new MonTutoriel4_2().valider();
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
