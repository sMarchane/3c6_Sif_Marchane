package atelier2_5;

import tutoriels.atelier2_5.Atelier2_5;

public class MonAtelier2_5 extends Atelier2_5{

	public static void main(String[] args) {
		new MonAtelier2_5().valider();
	}

	@Override
	public Object creerBouledogue() {
		return new Bouledogue();
	}

	@Override
	public Object creerChatGouttiere() {
		return new ChatGouttiere();
	}

	@Override
	public Object creerChatPersan() {
		return new ChatPersan();
	}

	@Override
	public Object creerShihtzu() {
		return new Shihtzu();
	}
}
