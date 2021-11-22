package examen4;

import java.util.Set;
import java.util.TreeSet;


public class TesteurDeSetVersionUn extends TesteurDeSetAbstrait {

	
	@Override
	public Set<String> nouveauSet() {
		
		return new TreeSet<>();
	}
	@Override
	public void accederValeursDansOrdre(Set<String> set) {
		
		
		for (int i = 0; i < set.size(); i++) {
			
			TreeSet<String> sorted = new TreeSet<>(); 
			sorted.addAll(set);
		}		
	}
}
