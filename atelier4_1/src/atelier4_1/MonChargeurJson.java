package atelier4_1;

import atelier4_1.MaChaineJson;
import atelier4_1.MonBooleenJson;
import atelier4_1.MonNombreJson;
import atelier4_1.MonNullJson;
import tutoriels.atelier4_1.ChargeurJson;
import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJson;
import tutoriels.json.ObjetJson;
import tutoriels.json.ValeurJson;

public class MonChargeurJson implements ChargeurJson{

	private String resteDuTexteJson;
	@Override
	public ListeJson chargerListe(String texteJson) throws ErreurDeChargement {
		ListeJson listeJson = new MaListeJson();
		
		resteDuTexteJson = listeJson.chargerEtRetournerResteDuTexte(texteJson);
		
		return listeJson;
	}

	@Override
	public ObjetJson chargerObjet(String texteJson) throws ErreurDeChargement {
		
		ObjetJson object = new MonObjetJson();
		
		resteDuTexteJson = object.chargerEtRetournerResteDuTexte(texteJson);
		
		
		
		return object;
	}

	@Override
	public ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement {
		
		ValeurJson[] valeursPossibles = new ValeurJson[] {new MonNullJson(), new MonBooleenJson(), new MaChaineJson(), new MonNombreJson()};
		
		ValeurJson valeurChargee = null;
		
		for (ValeurJson valeurPossible : valeursPossibles) {
			
			try {
				resteDuTexteJson = valeurPossible.chargerEtRetournerResteDuTexte(texteJson);
				valeurChargee = valeurPossible;
				break;
			}catch (ErreurDeChargement e) {
				
			}
		}
		if (valeurChargee == null) {
			throw new ErreurDeChargement("Impossible de charger une valeur au début de " + texteJson);
			
		}		
		
		
		return valeurChargee;
	}

	@Override
	public String resteDuTexteJson() {
		
		return resteDuTexteJson;
	}

}
