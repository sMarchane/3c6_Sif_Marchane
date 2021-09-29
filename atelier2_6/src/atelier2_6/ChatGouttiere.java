package atelier2_6;

public class ChatGouttiere extends Chat{

	
	public ChatGouttiere(int heuresTotalesDeSommeil, int nombreOiseauxAttrapes) {
		super(heuresTotalesDeSommeil, nombreOiseauxAttrapes);
		
	}

	@Override
	protected String nomAnimal() {
		return "chat de gouttière";
	}
}
