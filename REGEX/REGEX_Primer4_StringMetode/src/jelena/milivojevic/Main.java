package jelena.milivojevic;

import java.util.Scanner;

public class Main {
	// Primer upotrebe regulazrnih izraza kroz upotrebu metoda klase String:
	public static void main(String[] args) {
		/*
		 * Stringovi u Javi imaju ugrađenu podrsku za regularne izraze. Stringovi imaju
		 * četiri ugradjene metode za regularne izraze: matches(), split()),
		 * replaceFirst(),replaceAll().
		 * 
		 * Medjutim, treba napomenuti da metoda replace() NE podrzava regularne izraze.
		 * 
		 * Ove metode nisu optimizovane za performanse i zato se upravo i koriste klase
		 * Pattenr i Matcher koje jesu.
		 */

		/*
		 * Primer upotrebe korisnickog unosa uz primenu metode klase String, radi
		 * provere da li je ucenik auto skole uneo validno ime i validan broj godina:
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("*Deo formulara za ucenika auto skole* ");
		boolean tacnostIme;
		// Koristimo do-while petlju jer ocekujemo da barem jednom prodjemo kroz proveru
		do {

			/*
			 * Definisemo promenljivu kao obrazac je regex koji koristimo kao nase pravilo
			 * provere unetog imena. Ovako napisan obrazac prikazuje meta-karakternu
			 * proveru. (Meta-characters)doprinose provera stringa koji ne bi smeo da sadrzi
			 * znakove kao sto su !, @, # $. regexu. Kinkretno ovde,meta-znak \\w
			 * predstavlja dozvoljena slova a-z, A-Z, cifre 0-9 i donju crtu (_). Mi ga ovde
			 * koristimo radi provere imena. Odmah iza \\w je znak plus +,to znaci da ucenik mora da unese najmanje jedan znak u unapred
			 * definisanom obrazcu.
			 */
			String obrazacIme = "\\w+";
			System.out.print("Unesi ime: ");
			String ime = sc.nextLine();

			tacnostIme = ime.matches(obrazacIme);

			// Ako ne postoji poklapanje ispisuje sledecu poruku:
			if (!tacnostIme) {
				System.out.println("Pogresan unos imena! Tvoje ime ne sadrzi specijalne karaktere");
			}
		} while (!tacnostIme);
		// Dakle, sve dok ne unese validan izraz za ime
		System.out.println("Ime uneto.");

		boolean tacnostGodine;
		// Druga petlja za proveru godina:
		do {
			/*
			 * Definisemo promenljivu kao obrazac je regex koji koristimo kao nase pravilo
			 * provere broja godina. Ovako napizan obrazac prikazuje kvantifikatore.
			 * Kvantifikatori (Quantifiers) se koriste za odredjivanje broja pojavljivanja
			 * znakova u nekom regexu. Kinkretno ovde, u zagradi 2 je minimalni, a 2 je i
			 * maksimalni broj dozvoljenih cifara broja godina, odvojenih zarezom (,) bez
			 * razmaka između. Minimalni broj cifara je 2 jer ocekujemo da ucenik ima vise
			 * od 9 godina, mora biti punoletan, a svakako da nema vise od 99.
			 */

			String obrazacGodine = "\\d{2,2}";

			System.out.print("Unesi broj godina: ");
			String brojGod = sc.nextLine();

			/*
			 * Iako je broj godina zapravo cifra, mi je u sistem prihvatamo kao String tip,
			 * kako bismo mogli da koristimo Stringove metode provere regularnih izraza.
			 * Primena Stringove metode mathces() za proveru poklapanja obrazca za unetim
			 * iznosom
			 */
			tacnostGodine = brojGod.matches(obrazacGodine);

			// Ako ne postoji poklapanje ispisuje sledecu poruku:
			if (!tacnostGodine) {
				System.out.println("Pogresan unos broja godina!");
			}
		} while (!tacnostGodine);
		// Dakle, sve dok ne unese valizan broj godina
		System.out.println("Dobar unos broja godina. Hvala!");

		sc.close();
	}

}
