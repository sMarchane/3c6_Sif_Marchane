package atelier2_5;

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
	@Override
	protected String typeDeCri() {
		return "joli miaulement";
	}
}
