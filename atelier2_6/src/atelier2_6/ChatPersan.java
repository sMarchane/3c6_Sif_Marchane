package atelier2_6;

public class ChatPersan extends Chat{

	public ChatPersan(int heuresTotalesDeSommeil, int nombreOiseauxAttrapes) {
		super(heuresTotalesDeSommeil, nombreOiseauxAttrapes);
	}
	@Override
	protected int heuresMinimalesDeSommeil() {
		return 5;
	}
	@Override
	protected String nomAnimal() {
		return "joli chat persan";
	}
	private String rendreJoli(String mot) {
		return mot = "joli";
		
	}
	@Override
	protected String typeDeCri() {
		return "joli miaulement";
	}
}
