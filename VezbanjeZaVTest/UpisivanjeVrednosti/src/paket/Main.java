package paket;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Throwable {
		// Osnovne UI operacije
		// PODATKE CITAMO SA TASTATURE:

		// Streamo-vi - Tokovi podataka
		/*
		 * Najcesce klase: DataInputStream i FileOutputStream Za UI operacije Java
		 * koristi tokove odnsono STreamove. Streamovi omogucuju rad sa podacima. Oni
		 * obezbedjuju nacin za rad sa podacima koji se primaju i salju.
		 *
		 * 
		 * 1. KORAK : Uvodi se Klasa koja omogucuje da sepoveze tastatura sa Streamom
		 * iliti Tokom. To je kalsa DataInputStream
		 */
		// Kreiranje objekta klase DataInputStream
		// Kao parametar unosi se ulazna vrednost sa konzole koju korisnik unese
		DataInputStream dis = new DataInputStream(System.in);

		// 2.Korak - Povezivanja fajla klasom FileOutPutStream
		// da bismo se povezali - fizicki potrebna je klasa FileOutPutStream

		FileOutputStream fos = new FileOutputStream("rezultat.txt");

		// 3.Korak: read za ucitavanje znakova
		// Pisemo korisniku poruku
		System.out.println("Unesite string. Unose prekinite unosom karaktera $");
		// metoda read(); ucitava karaktera sa tatasrute i upisuje u fajl
		// mi taj unos prvo citamo i to citanje se vrsi dok ese ne unese odgovajaruci
		// znak

		// Metoda write{} sluzi za

		char ch;

		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}
		fos.close();

	}

}
