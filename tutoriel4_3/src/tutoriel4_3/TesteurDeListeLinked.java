package tutoriel4_3;

import java.util.LinkedList;
import java.util.List;

public class TesteurDeListeLinked extends TesteurDeListeAbstrait {

	@Override
	public List<Integer> nouvelleListe() {
		
		return new LinkedList<>();
	}

}
