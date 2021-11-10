package atelier4_1;

import tutoriels.atelier4_1.Atelier4_1;
import tutoriels.atelier4_1.ChargeurJson;
import tutoriels.json.ObjetJson;

public class MonAtelier4_1 extends Atelier4_1{

	public static void main(String[] args) {
		new MonAtelier4_1().valider();
	}
	
	
	@Override
	public ChargeurJson fournirChargeurJson() {
		
		return new MonChargeurJson();
	}

	@Override
	public ObjetJson fournirObjetJson() {
		
		return new MonObjetJson();
	}

}
