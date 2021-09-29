package atelier2_6;

public abstract class Chat extends Animal{

	private int nombreOiseauxAttrapes = 0;
	public Chat(int heuresTotalesDeSommeil, int nombreOiseauxAttrapes) {
		super(heuresTotalesDeSommeil);
		
		this.nombreOiseauxAttrapes = nombreOiseauxAttrapes; 
	}
	@Override
	protected int heuresMinimalesDeSommeil() {
		return 3;
	}
	@Override
	protected String typeDeCri() {
		return "miaulement";
	}
	@Override
	public String formater() {
		return super.formater() + " J'ai aussi attrapé " + nombreOiseauxAttrapes + " oiseaux.";
		
	}
}
