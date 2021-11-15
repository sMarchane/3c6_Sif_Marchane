package atelier4_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ValeurJson;

public class MaChaineJson extends ValeurJson<String>{

	
	private static final String PATRON = "^\"([^\"]*)\"";
	private static final Pattern pattern = Pattern.compile(PATRON);
	private String valeur;
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		Matcher matcher = pattern.matcher(texteJson);
		
		if (matcher.find()) {
			valeur = matcher.group(1);
			
			texteJson = matcher.replaceFirst("");
		}else {
			throw new ErreurDeChargement("Impossible de charger une chaine pour " + texteJson);
		}
		
		
		
		return texteJson;
	}

	@Override
	public String valeurJava() {
		return valeur;
	}
	@Override
	public String toString() {
		return String.format("\"%s\"", super.toString());
	}

}
