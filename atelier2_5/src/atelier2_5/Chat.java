package atelier2_5;

public abstract class Chat extends Animal{

	@Override
	protected int heuresMinimalesDeSommeil() {
		return 3;
	}
	@Override
	protected String typeDeCri() {
		return "miaulement";
	}
}
