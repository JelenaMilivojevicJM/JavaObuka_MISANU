package paket_input;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Input {

	public static void main(String[] args) throws Throwable {
		// UPISIVANJE VREDNOSTI U FILE
		// Osnovne UI operacije - za operacije upisa i ispisa podataka u fajlove koriste
		// se Streamovi.
		// Streamovi su tokovi podataka koji omogucavajau rad sa podacima kji se primaju
		// iz faja i salju u fajl.
		/*
		 * Najcesce klase: DataInputStream i FileOutputStream Za UI operacije Java
		 * koristi tokove odnsono STreamove. Streamovi omogucuju rad sa podacima. Oni
		 * obezbedjuju nacin za rad sa podacima koji se primaju i salju. /*
		 * 
		 * 
		 * 
		 * /*1. KORAK : Omoguciti ucitavanje preko konzove - Uvodi se Klasa koja
		 * omogucuje da sepoveze tastatura sa Streamom iliti Tokom. To je kalsa
		 * DataInputStream
		 */
		// Kreiranje objekta klase DataInputStream
		// Kao parametar unosi se ulazna vrednost sa konzole koju korisnik unese
		DataInputStream dis = new DataInputStream(System.in);
		// Unosimo vrednosti u fajl preko konzole
		// Sve dok ne unesemo odredjeni znak

		/*
		 * 2.KORAK: Omoguciti POVEZIVANJE klase SA FAJLOM - Takodje preko klase koja je
		 * zaduzena za to. Povezivanja fajla klasom FileOutPutStream da bismo se
		 * povezali - fizicki potrebna je klasa FileOutPutStream Kao stvarni argument
		 * navodime ime fajla u obliku .txt
		 */

		FileOutputStream fos = new FileOutputStream("NoviFajl.txt");

		/*
		 * 3.KORAK: Ucitavanje i Upis Koristeci metode read(); i write(); ucitavamo
		 * znakove sa konzole i njih upisujemo u fajl Pisemo korisniku poruku //metoda
		 * read(); ucitava karaktera sa tatasrute i upisuje u fajl //mi taj unos prvo
		 * citamo i to citanje se vrsi dok ese ne unese odgovajaruci znak metoda
		 * write(); fizicki upisuje unete podatke u fajl. na kraju moramo zatvoriti
		 * fileOutputStream objekat
		 */

		System.out.println("Unesite string. Unose prekinite unosom karaktera $");

		char karakter;

		while ((karakter = (char) dis.read()) != '$') {
			fos.write(karakter);
		}
		fos.close();
	}
}
