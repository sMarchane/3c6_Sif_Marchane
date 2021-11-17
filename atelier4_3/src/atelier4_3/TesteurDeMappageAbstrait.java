package atelier4_3;

import java.util.Map;
import java.util.Random;

import tutoriels.atelier4_3.TesteurDeMappage;

public abstract class TesteurDeMappageAbstrait implements TesteurDeMappage{

	private static Random alea = new Random();
	@Override
	public void fairePlusieursAjoutsAleatoires(Map<String, Integer> map, String[] cles, int nombreOperations) {
		for (int i = 0; i < nombreOperations; i++) {
			
			int indicecle = alea.nextInt(cles.length);
			
			String cle = cles[indicecle];
			
			
			map.put(cle, 0);
		}
		
	}

	@Override
	public void fairePlusieursModificationsAleatoires(Map<String, Integer> map, String[] cles, int nombreOperations) {
		for (int i = 0; i < nombreOperations; i++) {
			
			int indicecle = alea.nextInt(cles.length);
			
			String cle = cles[indicecle];
			
			
			map.replace(cle, 0);
		}
		
	}

	@Override
	public void fairePlusieursRetraitsAleatoires(Map<String, Integer> map, String[] cles, int nombreOperations) {
		for (int i = 0; i < nombreOperations; i++) {
			
			int indicecle = alea.nextInt(cles.length);
			
			String cle = cles[indicecle];
			
			
			map.remove(cle, 0);
		}
	}

}
