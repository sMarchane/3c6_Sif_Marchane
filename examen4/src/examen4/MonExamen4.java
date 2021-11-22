package examen4;

import tutoriels.examen_gr2.ChargeurJsonBD;
import tutoriels.examen_gr2.ChargeurJsonExpression;
import tutoriels.examen_gr2.Examen4Gr2;
import tutoriels.examen_gr2.ExpressionJson;
import tutoriels.gr1gr2.ModificateurDeFichier;
import tutoriels.gr1gr2.TesteurDeSet;
import tutoriels.json.MaListeJson;

public class MonExamen4 extends Examen4Gr2{

	public static void main(String[] args) {
		new MonExamen4().valider();
	}
	
	@Override
	public ExpressionJson fournirExpressionJson() {
		
		return new MonExpressionJson(new ChargeurJsonExpression(this));
	}

	@Override
	public MaListeJson fournirListeJsonBD() {
		
		return new MaListeJsonBD(new ChargeurJsonBD(this));
	}

	@Override
	public ModificateurDeFichier fournirModificateurDeFichier() {
		
		return new MonModificateurDeFichier();
	}

	@Override
	public TesteurDeSet fournirTesteurDeSetVersionDeux() {
		
		return new TesteurDeSetVersionDeux();
	}

	@Override
	public TesteurDeSet fournirTesteurDeSetVersionUn() {
		
		return new TesteurDeSetVersionUn();
	}

}
