package atelier3_1;

import tutoriels.atelier3_1.Planteur;

public class MonPlanteur implements Planteur{

	@Override
	public boolean planter() {
		MaPaire nouvellePaire = new MaPaire(1, "");
		nouvellePaire.obtenirPlusPetit();
		
		return false;
	}

}
