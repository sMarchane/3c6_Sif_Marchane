package atelier2_6;

public abstract class Chien extends Animal{

	public Chien(int heuresTotalesDeSommeil) {
		super(heuresTotalesDeSommeil);
	}

	@Override
	protected int heuresMinimalesDeSommeil() {
		return 2;
	}

	@Override
	protected String typeDeCri() {
		return "jappement";
	}
	
}
