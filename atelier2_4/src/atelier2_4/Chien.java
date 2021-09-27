package atelier2_4;

public class Chien extends Animal{

	@Override
	protected int heuresMinimalesDeSommeil() {
		return 2;
	}

	@Override
	protected String typeDeCri() {
		return "jappement";
	}
}
