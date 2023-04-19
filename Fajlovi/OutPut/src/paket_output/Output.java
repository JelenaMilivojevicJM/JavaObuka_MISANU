package paket_output;

import java.io.FileInputStream;
import java.io.IOException;

public class Output {

	public static void main(String[] args) throws IOException {
		/*
		 * 1.KORAK: Za ucitavanje podataka iz nekog filea potrebna nam je takodje klasa
		 * koja je u java.io biblioteci u paketu streamova i koja sluzi za ucitavanja iz
		 * filea. To je klasa FileInputStream koristimo takodje objekat klase ime fajla
		 * ide kao argument konstruktora taj fajl je tipa txt a kreiramo ga u korenu
		 * naseg projekta
		 */

		FileInputStream fis = new FileInputStream("FilezaOutput.txt");
		System.out.println("Sadrzaj Fajla: " + fis);

		/*
		 * 2 KORAK: Ponovo nam je potrebna metoda koja ce citati - ali citati IZ FAJLA
		 * (za upis nam treba da cita iz tastature a ovde iz fajla) Zato je ona metoda
		 * read(); iz kalse Fileinputstream * Ona cita jedan po jean bite iz datiteke i
		 * vraca ga kao celobrojnu vrednost Kadas tigne do kraja, vraca vrednost -1
		 *
		 * Posto je rec o celobrojnoj vrednosti onda napravimo promenljivu tipa int
		 * Malopre smo ucitavali znak po znak a sada ucitava byte po byte. zato je int
		 * tipa
		 */

		int ch;
		while ((ch = fis.read()) != -1) {
			System.out.println((char) ch);
		}
		fis.close();
	}

}
