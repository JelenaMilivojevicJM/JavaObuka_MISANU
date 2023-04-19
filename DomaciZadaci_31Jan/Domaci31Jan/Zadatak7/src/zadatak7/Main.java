package zadatak7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * TEKST ZADATKA: 7. Programski kreirati fajl i upisati tekst: Ja sam programer!
		 */

		/*
		 * 1.Korak: Povezivanje sa stream-on i omogucavanje unosenja preko konzole. Kao
		 * parametar konstruktora unosi se vrednost iz sistemskog ulaza sa konzole koju
		 * korisnik unese
		 */
		DataInputStream dis = new DataInputStream(System.in);

		/* 2.Korak: Kreiranje fajla i Povezivanje sa Fajlom */
		FileOutputStream fos = new FileOutputStream("NoviFajl.txt");

		/*
		 * 3.Korak: Ucitavanje sa konzole i Upis u File preko metoda read(); i write();
		 */
		System.out.println("Unesite zeljeni tekstualni sadrzaj. Za prekid unosa unesite karakter $");

		/*
		 * Posto iz unetog stringa ucitava karakter po karakter, kreiramo promenljivu
		 * tog tipa
		 */
		char karakter;

		// Pozivamo metodu read() iz klase objekta dis
		while ((karakter = (char) dis.read()) != '$') {
			// pozivamo metodu write(); iz klase objekta fos
			fos.write(karakter);
			// u nas novi fajl ucitavamo i ispisujemo karakter po karakter
		}
		fos.close();
		// Nakon sto smo izasli iz while petlje zatvaramo objekat fos cime naznacavamo
		// da smo zavrsili sa ucitavanjem

		/*
		 * U korenu foldera naseg workspace-a kreiran je fajl sa zeljenim texom. Potvrdu
		 * postojanja novog fajla sa zeljenim textualnim sadrzajem mozemo propveriti
		 * pomocu objekta klase FileInputStream
		 */
		// 1.Korak: Ucitavanje sadrzaja iz novokreiranog fajla:
		FileInputStream fis = new FileInputStream("NoviFajl.txt");

		// 2.Korak: Pozivanje metode read(); iz kalse Fileinputstream za citanje IZ
		// FAJLA i upis ovde u konzolu
		System.out.println("Sadrzaj Fajla: " + fis);
		/*
		 * Posto iz fajla u konzolu ucitava bit po bit, kreiramo promenljivu celobrojnog
		 * tipa a zatim vrsimo konverziju u tip char
		 */
		int vrednost;
		while ((vrednost = fis.read()) != -1) {
			System.out.print((char) vrednost+" ");
		}
		fis.close();
	}

}
