package paket;

public class Main {

	public static void main(String[] args) {
		// Celobrojni niz

		// Kreiranje niza
		/*
		 * Broj u [ ] pokazuje KOLIKO ukupno elemenata sadrzi ovaj niz. Dakle na 5
		 * pozicija elemenata.
		 */
		int brojevi[] = new int[5];

		// Dodeljivanje elemenata nizu i dodela vrednosti tom elementu
		brojevi[0] = 5;
		brojevi[1] = 10;
		brojevi[2] = 15;
		brojevi[3] = 20;
		brojevi[4] = 25;

		// Stampanje svakog elementa pojedinacno, prema njegovoj poziciji

		/*
		 * Prilikom stampanja: -Pisemo IME NIZA iz kojeg stampamo element, - Navodimo u
		 * [ ] POZICIJU elementa koji zelimo da odstampamo, znaci njegov redni broj u
		 * tom nizu.
		 */
		System.out.println(brojevi[0]);

		System.out.println(brojevi[1]);

		System.out.println(brojevi[2]);

		System.out.println(brojevi[3]);

		System.out.println(brojevi[4]);

	}

}
