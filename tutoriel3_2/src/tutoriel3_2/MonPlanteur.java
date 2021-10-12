package tutoriel3_2;

import tutoriels.tutoriel3_2.Planteur;

public class MonPlanteur implements Planteur{

	@Override
	public boolean planter() {

		MonTableau<Integer> tableauEntier = new MonTableau<>(new Integer[]{1,2,3});
		//tableauEntier.modifierValeur(0, "asdf");
		return false;
	}

}
