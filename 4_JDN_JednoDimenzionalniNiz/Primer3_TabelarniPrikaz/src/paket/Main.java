package paket;

public class Main {

	public static void main(String[] args) {
		// Stampanje zaglavlja
		System.out.println("R.Br: " + "\tElement:");

		// Kreiranje niza i dodela vrednosti

		int brojevi[] = { 5, 10, 15, 20, 25 };

		// For petlja
		for (int i = 0; i < brojevi.length; i++) {

			/*
			 * Kada ne znamo koliko tacno ima ukupno elemenata u nizu, onda koristimo kao
			 * limit DUZINU NIZA. Moze i na drugi nacin staviti ukupan broj elemenata kao
			 * l,imit petlje, Medjutim, to mozemo kod malog broja elemenata - kada znamo
			 * TACAN ukupan broj elemenata.for (int i = 0; i <= 5; i++){}
			 */
			// Stampanje izlaz - koji se ponavlja:
			System.out.println(i + "   \t" + brojevi[i]);
		}

	}

}
