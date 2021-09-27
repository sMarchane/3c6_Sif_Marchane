package atelier2_5;

public abstract class Chien extends Animal{

	@Override
	protected int heuresMinimalesDeSommeil() {
		return 2;
	}

	@Override
	protected String typeDeCri() {
		return "jappement";
	}
	
}
