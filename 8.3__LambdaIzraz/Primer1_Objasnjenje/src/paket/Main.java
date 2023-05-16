package paket;

public class Main {

	/*
	 * Lambda izraz: To je anonimna metoda, odnosno, metoda bez imena. Pošto nema
	 * vrednost nema naziv, može se kao vrednost dodeliti imenovanoj promenljivoj.
	 * Ta metoda se ne izvršava kao samostalna, nego IMPLEMENTIRA METODU koja je
	 * definisana u određenom funkcionalnom interfejsu. Ideja lambda izraza :
	 * Implementirati fuknciju, izvrsiti je koliko god puta je potrebno i na osnovu
	 * odlike da uvek ima iste ulazne vrednosti, dace uvek istu izlaznu vrednost.
	 * Odnosno da funkcija može da preuzme jednu vrednost i da generiše drugu
	 * vrednost, ne modifikujući ulaz. Zahvaljujući tome, bez obzira Koliko puta
	 * izvršite neku funkciju sa istim ulaznim podatkom, biće dodeljena ista
	 * povratna vrednost. Cilj Lambda izraza: Koliko god puta izvrsavali neku
	 * funkciju, na osnovu istih ulanznih vrednosti, dobijaju se iste izlazne
	 * vrednosti - Dakle, nema modifikacijhe u telu metode. Prednost: Kreiranje
	 * objekata sa poljima koja se mogu menjati kodom metoda može da bude podložno
	 * greškama.
	 */

	public static void main(String[] args) {
		// Ispitati da li je broj paran

		TestiraBroj paranBroj = (n) -> (n % 2) == 0;

		// Ispsitivanje

		if (paranBroj.testbr(10)) {
			System.out.println("Jeste paran broj");
		} else {
			System.out.println("Nije paran broj");
		}
	}

}
