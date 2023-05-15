package jelena.milivojevic;

//Import klase Scanner
import java.util.Scanner;

public class BrojGodinaScanner {

	public static void main(String[] args) {
		/*
		 * Napisati program primenom klase Scanner koji zahteva da se unesu ime i broj
		 * godina (integer) a potom da se ispišu uneti podaci na ekranu.
		 */

		// Kreiranje objekta klase koji kao parametar koristi Sistemski ulaz za
		// ucitavanje
		Scanner ulaz = new Scanner(System.in);

		// Ispis poruke korisniku da unese podatke
		System.out.println("Unesite ime: ");
		String userName = ulaz.nextLine();
		System.out.println("Unesite broj godina: ");
		int brojGodina = ulaz.nextInt();

		// Izlaz:
		System.out.println("Ime: " + userName + "\n" + "Broj godina: " + brojGodina);

		// Zatvaranje
		ulaz.close();
	}

}
