package atelier2_5;

public abstract class Animal implements Dormeur, Formateur{

	private int heuresTotalesDeSommeil = 0;
	
	protected abstract String typeDeCri();
	
	protected abstract int heuresMinimalesDeSommeil();
	
	protected abstract String nomAnimal();
	@Override
	public String formater() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bonjour, je suis un ");
		builder.append(nomAnimal());
		builder.append(" et mon type de cri est le ");
		builder.append(typeDeCri());
		builder.append(". Depuis le début du programme, j'ai dormi un total de ");
		builder.append(heuresTotalesDeSommeil);
		builder.append(" heures. ");
		builder.append("D'ailleurs, quand je dors c'est au minimum ");
		builder.append(heuresMinimalesDeSommeil());
		builder.append(" heures.");
		return builder.toString();
	}

	@Override
	public void dormir(int heures) {
		if (heures > heuresMinimalesDeSommeil()) {
			heuresTotalesDeSommeil += heures;
		}else {
			heuresTotalesDeSommeil += heuresMinimalesDeSommeil();
		}
		
	}

	
}
