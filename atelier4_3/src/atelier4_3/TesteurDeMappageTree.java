package atelier4_3;

import java.util.Map;
import java.util.TreeMap;

public class TesteurDeMappageTree extends TesteurDeMappageAbstrait {

	@Override
	public void accederAuClesDansOrdre(Map<String, Integer> map, int nombreOperations) {
		
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(map);
	}

	@Override
	public Map<String, Integer> nouveauMap() {
		
		
		return new TreeMap<>();
	}

}
