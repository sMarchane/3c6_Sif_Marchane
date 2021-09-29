package atelier2_6;

import tutoriels.atelier2_6.Atelier2_6;

public class MonAtelier2_6 extends Atelier2_6{

	public static void main(String[] args) {
		(new MonAtelier2_6()).valider();
	}

	@Override
	public Object creerBouledogue(int heuresTotalesDeSommeil) {
		return new Bouledogue(heuresTotalesDeSommeil);
	}

	@Override
	public Object creerChatGouttiere(int heuresTotalesDeSommeil, int nombresOiseauxAttrapes) {
		return new ChatGouttiere(heuresTotalesDeSommeil, nombresOiseauxAttrapes);
	}

	@Override
	public Object creerChatPersan(int heuresTotalesDeSommeil, int nombresOiseauxAttrapes) {
		return new ChatPersan(heuresTotalesDeSommeil, nombresOiseauxAttrapes);
	}

	@Override
	public Object creerShihtzu(int heuresTotalesDeSommeil) {
		return new Shihtzu(heuresTotalesDeSommeil);
	}

}
