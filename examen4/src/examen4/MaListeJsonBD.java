package examen4;

import tutoriels.json.ChargeurJson;
import tutoriels.json.MaListeJson;
import tutoriels.json.ValeurJson;

public class MaListeJsonBD extends MaListeJson{

	public MaListeJsonBD(ChargeurJson chargeurJson) {
		super(chargeurJson);
	}

	@Override
	public int nombreDeCaracteresAvant(int indiceElement) {
		int nombreDeCaracteresAvant = 0;
		
		for (int i = indiceElement; i < valeurJava().longueur(); i++) {
			
			if (valeurJava() != null) {
				
				valeurJava().obtenirValeur(indiceElement);
			}
			
			ValeurJson.nombreDeCaracteres(nombreDeCaracteresAvant);
			
		}		
		return nombreDeCaracteresAvant;
		
	}
}
