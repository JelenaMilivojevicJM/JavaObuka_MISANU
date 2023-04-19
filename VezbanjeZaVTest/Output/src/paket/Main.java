package paket;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// Kao argument stavljamo naziv fajla odakle citamo podatke. A fajl moramo imeti
		// unapred

		FileInputStream fis = new FileInputStream("NoviFajl.txt");

		System.out.println("Sadrzaj fajla: ");
		// Metoda koja ce citati i rposledjivati vrednost
		/*
		 * Metoda read() iz klase file.inputstream Ona cita jedan po jean bite iz
		 * datiteke i vraca ga kao celobrojnu vrednost Kadas tigne do kraja, vraca
		 * vrednost -1
		 */

		int ch;
		while ((ch = fis.read()) != -1) {
			System.out.println((char) ch);
		}
		fis.close();
	}

}
