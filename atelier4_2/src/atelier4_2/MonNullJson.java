package atelier4_2;

import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ValeurJson;

public class MonNullJson extends ValeurJson<Void>{

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		if (texteJson.startsWith("null")) {
			texteJson = texteJson.replace("null", "");
		}else {
			
			throw new ErreurDeChargement("Impossible de charger la valeur null au début de " + texteJson);
		}
		
		
		return texteJson;
	}

	@Override
	public Void valeurJava() {
		return null;
	}

}
