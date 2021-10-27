package examen3;
import java.util.Random;


public class MelangeurNaif<C extends Comparable<C>> implements Melangeur<C>{

	private Random alea = new Random();
	@Override
	public Liste<C> melanger(Liste<C> entree) {
		Liste<C> res = new Liste<C>();
		int borne = 10;
		
		alea.nextInt(borne);
		while (entree.siVide() == false) {
			C nouvelleListe = entree.obtenirValeur(nouvelleListe);
			res.ajouter(nouvelleListe);
		}
		return res;
	}
}