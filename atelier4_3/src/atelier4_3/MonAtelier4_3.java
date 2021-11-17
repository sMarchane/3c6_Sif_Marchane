package atelier4_3;

import tutoriels.atelier4_3.Atelier4_3;
import tutoriels.atelier4_3.TesteurDeMappage;

public class MonAtelier4_3 extends Atelier4_3{

	public static void main(String[] args) {
		new MonAtelier4_3().valider();
	}
	
	@Override
	public TesteurDeMappage fournirTesteurHash() {
		
		return new TesteurDeMappageHash();
	}

	@Override
	public TesteurDeMappage fournirTesteurTree() {
		
		return new TesteurDeMappageTree();
	}

}
