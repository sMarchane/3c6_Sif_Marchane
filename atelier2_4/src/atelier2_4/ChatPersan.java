package atelier2_4;

public class ChatPersan extends Chat{

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
	public String typeDeCri() {
		return "joli miaulement";
	}
}
