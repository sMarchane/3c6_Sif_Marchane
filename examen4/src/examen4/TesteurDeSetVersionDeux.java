package examen4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteurDeSetVersionDeux extends TesteurDeSetAbstrait {

	@Override
	public Set<String> nouveauSet() {
		
		return new HashSet<>();
	}
	@Override
	public void accederValeursDansOrdre(Set<String> set) {
		
		
		for (int i = 0; i < set.size(); i++) {
			
			HashSet<String> sorted = new HashSet<>(); 
			sorted.addAll(set);
			Collections.sort(sorted);
		}		
	}

}
