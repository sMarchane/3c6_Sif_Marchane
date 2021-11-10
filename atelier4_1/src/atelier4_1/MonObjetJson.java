package atelier4_1;

import tutoriels.json.Dictionnaire;
import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJava;
import tutoriels.json.MaListeJava;
import tutoriels.json.MonDictionnaire;
import tutoriels.json.ObjetJson;
import tutoriels.json.ValeurJson;

public class MonObjetJson extends ObjetJson{

	private static final char OUVERTURE = '{';
	private static final char SEPARATEUR = ',';
	private static final char SEPARATEURDECLE = ':';
	private static final char FERMETURE = '}';

	private Dictionnaire<ValeurJson> dico = new MonDictionnaire<>(ValeurJson.class);
	//private MonObjetJson valeurs = new MonObjetJson();
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		String resteDuTexte = texteJson;
		MonChargeurJson chargeur = new MonChargeurJson();
		
		resteDuTexte = retirerCaractere(resteDuTexte, OUVERTURE);
		
		while(true) {
			
			MaChaineJson valeur = new MaChaineJson();
			resteDuTexte = valeur.chargerEtRetournerResteDuTexte(resteDuTexte);
			resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEURDECLE);
			ValeurJson valeurDeux = chargeur.chargerValeur(resteDuTexte);
			dictionnaire().entreposerValeur(valeur.valeurJava(), valeurDeux);
			resteDuTexte = chargeur.resteDuTexteJson();
			
			
			
			
			try {
				resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEUR);
			}catch (ErreurDeChargement e) {
				break;
			}
		}
		resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);

		
		return null;
	}

	@Override
	public Dictionnaire<ValeurJson> dictionnaire() {
		
		return dico;
	}
	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement{
		if(!(texteJson.charAt(0) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.substring(1);
	}

}
