package atelier2_3;

import tutoriels.atelier2_3.Accepteur;
import tutoriels.atelier2_3.animaux.Animal;
import tutoriels.atelier2_3.animaux.Chat;
import tutoriels.atelier2_3.animaux.Chien;

public class MonAccepteur implements Accepteur{

	@Override
	public boolean accepterLesBonsChasseurs(Animal animal) {
		boolean accepter = false;
		
		if (animal instanceof Chat) {
			
			Chat chat = (Chat) animal;
			
			accepter = chat.nombreOiseauxAttrapes() > 6 ;
			
		}
		return accepter;
	}

	@Override
	public boolean accepterLesChats(Animal animal) {
		boolean accepter = false;
		if (animal instanceof Chat) {
			accepter = true;
		}
		
		return accepter;
	}

	@Override
	public boolean accepterLesJappeurs(Animal animal) {
		boolean accepter = false;
		if (animal instanceof Chien) {
			Chien chien = (Chien) animal;
			accepter = chien.typeDeCri() == "jappement";
		}
		
		return accepter;
	}

	
}
