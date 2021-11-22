package atelier4_4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ManipulateurDeFichierEfficace extends ManipulateurDeFichierAbstrait{

	@Override
	public void modifierFichier(int indice, double nouvelleValeur, String nomFichier) throws IOException {
		
		RandomAccessFile raf= new RandomAccessFile(nomFichier, "rw");
		String ligne = "02.00" + System.lineSeparator();
		int octet = ligne.getBytes().length;
		int octetPre = octet*indice;
		
		raf.seek(octetPre);
		raf.write(formaterDouble(nouvelleValeur).getBytes());

		raf.close();
	}

}
