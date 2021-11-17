package tutoriel4_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tutoriels.fichiers.ManipulateurDeFichier;

public abstract class ManipulateurDeFichierAbstrait  implements ManipulateurDeFichier{

	@Override
	public void ecrireFichier(List<Double> valeurs, String nomFichier) throws IOException {
		File fichier = new File(nomFichier);
		OutputStream out = new FileOutputStream(fichier);
		
		for (int i = 0; i < valeurs.size(); i++) {
			out.write(formaterDouble(valeurs.get(i)).getBytes());
			out.write(System.lineSeparator().getBytes());
		}
		out.close();
	}

	@Override
	public String formaterDouble(double valeur) {
		
		return String.format("%05.2f", valeur);
	}

	@Override
	public List<Double> lireFichier(String nomFichier) throws IOException {
		List<Double> listeValeurs = new ArrayList<>();
		File fichier = new File(nomFichier);
		InputStream in = new FileInputStream(fichier);
		Scanner scanner = new Scanner(in);
		
		while (scanner.hasNext()) {
			listeValeurs.add(scanner.nextDouble());
			
		}
		scanner.close();
		
		return listeValeurs;
	}

}
