package examen4;

import java.util.List;
import java.util.Set;

import tutoriels.gr1gr2.TesteurDeSet;

public abstract class TesteurDeSetAbstrait implements TesteurDeSet{

	@Override
	public void ajouterPlusieursFoisMemesValeurs(Set<String> set, String[] valeurs, int nombreDeFois) {
		for (int i = 0; i < nombreDeFois; i++) {
			int indiceCle = valeurs.length;
			
			String cle = valeurs[indiceCle];
			
			set.add(cle);
		}
		
	}

	@Override
	public void ajouterPuisRetirerValeursPlusieursFois(Set<String> set, String[] valeurs, int nombreDeFois) {
		for (int i = 0; i < nombreDeFois; i++) {
			int indiceCle = valeurs.length;
			String cle = valeurs[indiceCle];
			
			set.add(cle);
			set.remove(cle);
		}

		
	}

	@Override
	public List<String> valeurs(Set<String> set) {
		
		return valeurs(set);
	}

}
