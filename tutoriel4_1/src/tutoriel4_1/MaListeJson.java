package tutoriel4_1;

import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJava;
import tutoriels.json.ListeJson;
import tutoriels.json.MaListeJava;
import tutoriels.json.MonChargeurJson;
import tutoriels.json.ValeurJson;

public class MaListeJson extends ListeJson{

	
	private static final char OUVERTURE = '[';
	private static final char SEPARATEUR = ',';
	private static final char FERMETURE = ']';
	
	private ListeJava<ValeurJson> valeurs = new MaListeJava(ValeurJson.class);
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		String resteDuTexte = texteJson;
		MonChargeurJson chargeur = new MonChargeurJson();
		
		resteDuTexte = retirerCaractere(resteDuTexte, OUVERTURE);
		
		while(true) {
			
			ValeurJson valeurJson = chargeur.chargerValeur(resteDuTexte);
			listeJava().ajouter(valeurJson);
			
			resteDuTexte = chargeur.resteDuTexteJson();
			
			try {
				resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEUR);
			}catch (ErreurDeChargement e) {
				break;
			}
		}
		resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);
		
		return resteDuTexte;
	}

	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement{
		if(!(texteJson.charAt(0) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.substring(1);
	}

	@Override
	public ListeJava listeJava() {
		
		return valeurs;
	}

}
