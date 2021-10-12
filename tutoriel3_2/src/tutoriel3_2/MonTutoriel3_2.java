package tutoriel3_2;

import tutoriels.tutoriel3_2.Planteur;
import tutoriels.tutoriel3_2.Tutoriel3_2;
import tutoriels.tutoriel3_2.Vehicule;

public class MonTutoriel3_2 extends Tutoriel3_2{

	public static void main(String[] args) {
		new MonTutoriel3_2().valider();
	}
	@Override
	public Object creerTableauChaines(String[] chainesInitiales) {
		return new MonTableau<String>(chainesInitiales);
	}

	@Override
	public Object creerTableauEntiers(Integer[] entiersInitiaux) {
		return new MonTableau<Integer>(entiersInitiaux);
	}

	@Override
	public Object creerTableauVehicules(Vehicule[] vehiculesInitiaux) {
		return new MonTableau<Vehicule>(vehiculesInitiaux);
	}

	@Override
	public Planteur fournirPlanteur() {
		return new MonPlanteur();
	}

}
