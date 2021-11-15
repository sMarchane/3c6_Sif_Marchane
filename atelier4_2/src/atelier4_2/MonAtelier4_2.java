package atelier4_2;

import tutoriels.atelier4_2.Atelier4_2;
import tutoriels.generer_atelier4_2.solution.MonChargeurJson;
import tutoriels.json.ChargeurJson;

public class MonAtelier4_2 extends Atelier4_2{

	
	public static void main(String[] args) {
		new MonAtelier4_2().valider();
	}
	@Override
	public ChargeurJson fournirChargeurJson() {

		return new MonChargeurJson();
	}

}
