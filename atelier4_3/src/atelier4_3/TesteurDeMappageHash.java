package atelier4_3;

import java.util.HashMap;
import java.util.Map;

public class TesteurDeMappageHash extends TesteurDeMappageAbstrait  {

	@Override
	public void accederAuClesDansOrdre(Map<String, Integer> map, int nombreOperations) {
		
		HashMap<String, Integer> sorted = new HashMap<>();
		sorted.putAll(map);
	}

	@Override
	public Map<String, Integer> nouveauMap() {
		
		
		return new HashMap<>();
	}

	
}
