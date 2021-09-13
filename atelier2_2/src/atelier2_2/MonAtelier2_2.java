package atelier2_2;

import tutoriels.atelier2_2.Atelier2_2;

public class MonAtelier2_2 extends Atelier2_2{

	public static void main(String[] args) {
		new MonAtelier2_2().valider();
	}
	@Override
	public Object fournirBouledogue() {
		return new Bouledogue();
	}

	@Override
	public Object fournirChatGoutiere() {
		return new ChatGouttiere();
	}

	@Override
	public Object fournirChatPersan() {
		return new ChatPersan();
	}

	@Override
	public Object fournirDalamtien() {
		return new Dalmatien();
	}

	@Override
	public Object fournirShihtzu() {
		return new Shihtzu();
	}

}
