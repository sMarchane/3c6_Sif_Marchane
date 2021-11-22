package examen4;

import tutoriels.examen_gr2.ExpressionJava;
import tutoriels.examen_gr2.ExpressionJson;
import tutoriels.json.ChargeurJson;
import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJava;
import tutoriels.json.ValeurJson;

public class MonExpressionJson extends ExpressionJson{

	private static final char OUVERTURE = '[';
	private static final char SEPARATEUR = ',';
	private static final char FERMETURE = ']';
	private ExpressionJava<ValeurJson> valeurJava = new ExpressionJava<ValeurJson>();
	
	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement{
		if (!(texteJson.charAt(0) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.substring(1);
	}
	
	public MonExpressionJson(ChargeurJson chargeurJson) {
		super(chargeurJson);
	}
	
	public ExpressionJson chargerListe(String texteJson) throws ErreurDeChargement{
		
		ExpressionJson listeJson = new MonExpressionJson(chargeurJson());
		String resteDuTexteJson = listeJson.chargerEtRetournerResteDuTexte(texteJson);
		
		return listeJson;
	}
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		String resteDuTexte = texteJson;
		ChargeurJson chargeur = chargeurJson();
		
		resteDuTexte = retirerCaractere(resteDuTexte, OUVERTURE);
		
		while (true) {
			ValeurJson valeurJson = chargeur.chargerValeur(resteDuTexte);
			valeurJava().setValeurGauche(valeurJson);
			valeurJava().setValeurMilieu(valeurJson);
			valeurJava().setValeurDroite(valeurJson);
			
			resteDuTexte = chargeur.resteDuTexteJson();
			
			try {
				resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEUR);
			}catch (Exception e) {
				break;
			}
		}
		resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);
		
		return resteDuTexte;
	}

	@Override
	public ExpressionJava valeurJava() {
		return valeurJava;
	}

}
