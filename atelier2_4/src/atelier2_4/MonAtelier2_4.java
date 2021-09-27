package atelier2_4;

import tutoriels.atelier2_4.Atelier2_4;
import tutoriels.atelier2_4.Dormeur;

public class MonAtelier2_4 extends Atelier2_4{

	public static void main(String[] args) {
		new MonAtelier2_4().valider();
	}
	@Override
	public Dormeur creerBouledogue() {
		return new Bouledogue();
	}

	@Override
	public Dormeur creerChatGouttiere() {
		return new ChatGouttiere();
	}

	@Override
	public Dormeur creerChatPersan() {
		return new ChatPersan();
	}

	@Override
	public Dormeur creerShihtzu() {
		return new Shihtzu();
	}

}
