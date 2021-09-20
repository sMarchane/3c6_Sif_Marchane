package atelier2_3;

import tutoriels.atelier2_3.Accepteur;
import tutoriels.atelier2_3.Formateur;
import tutoriels.atelier2_3.animaux.Animal;
import tutoriels.atelier2_3.animaux.Chat;
import tutoriels.atelier2_3.animaux.Chien;
import tutoriels.atelier2_3.animaux.Dalmatien;

public class MonFormateur implements Formateur{

	@Override
	public String formater(Animal animal) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Je suis un ");
		if (animal instanceof Chat) {
			builder.append("chat");
			if (((Chat)animal).nombreOiseauxAttrapes()>=6) {
				builder.append(" et je suis un bon chasseur.");
			}else {
				builder.append(", mais je suis un mauvais chasseur.");
			}

		}
		if (animal instanceof Chien) {
			builder.append("chien");
			if (animal instanceof Dalmatien) {
				builder.append(" et j'ai ");
				builder.append(((Dalmatien)animal).getNombreDeTaches());
				builder.append(" taches.");
			}else {
				builder.append(", mais je n'ai pas de taches.");
			}
		}
		return builder.toString();
	}

}
