package praksa;

import java.util.List;

public class Poruke implements UcitavanjePoruka {

	//Privatna polja klase
	private List<Karakter> primalac;
	private String sadrzaj;

	//Parametrizovani konstruktor
	Poruke(List<Karakter> primalac, String fileName) {
		this.primalac = primalac;
		this.sadrzaj = fileName;
	}

	// OBRADA 1:
	public void ispisiPrimaoce(List<Karakter> karakteri) {
		// Ispisivanje podataka o svim karakterima
		System.out.println("--------------------------------------------------");
		System.out.println("*Svi učesnici u konverzacijama*");
		System.out.println("Ime Prezime  -  Kuća ");
		/*
		 * Upotrebom for-each petlje prolazimo kroz sve karaktere i ispisujemo njihova
		 * imena i kuće kojima pripadaju
		 */
		for (Karakter karakter : karakteri) {
			// IZLAZ 1:
			System.out.println(karakter.getName() + " - " + karakter.getAllegiance());
		}
		System.out.println("--------------------------------------------------");
	}

	// OBRADA 2:
	public void ispisiPorukeDaenerys(List<String> porukeDaenerys) {
		/*
		 * Metoda za ispis svih poruka osobe Daenerys. Kao ulazni parametar ove metode
		 * yadajemo listu poruka koje smo kreirali u Main klasi
		 */
		System.out.println("*Sve poruke osobe Daenerys(iz njenog chat-a)*");

		// Koristeći se for-each petljom prolazimo kroz sve poruke i ispisujemo ih
		for (String pD : porukeDaenerys) {
			// IZLAZ 2:
			System.out.println(pD);
		}
		System.out.println("--------------------------------------------------");
	}

	// OBRADA 3:
	public void prebrojPoruke(List<Karakter> karakteri) {
		System.out.println("*Broj poslatih poruka svakog učesnika*");
		System.out.println("Učesnik : Ukupan broj poruka ");
		for (Karakter karakter : karakteri) {
			/*
			 * Kreiramo listu koja čuva prodatke o broju poruka svih učesnika konverzacija
			 * ponaosob. I za ovu operaciju koristimo Interface koji smo kreirali za
			 * učitavanje poruka.
			 */
			List<String> sveporuke = UcitavanjePoruka.loadMessages(karakter.getMessagesFile());
			// IZLAZ 3:
			// Ispisivanje broja poruka za svakog karaktera ponaosob
			System.out.println(karakter.getName() + " : " + sveporuke.size() + " poruka");
		}

		System.out.println("--------------------------------------------------");
	}	
}
