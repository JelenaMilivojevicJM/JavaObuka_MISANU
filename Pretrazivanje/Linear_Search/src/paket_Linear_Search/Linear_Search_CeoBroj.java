package paket_Linear_Search;

public class Linear_Search_CeoBroj {
	/*
	 * Linearna pretraga je definisana kao sekvencijalni algoritam pretrage koji
	 * počinje na jednom kraju i prolazi kroz svaki element liste dok se ne pronađe
	 * željeni element, u suprotnom pretraga se nastavlja do kraja skupa podataka.
	 * To je je način pronalaženja ciljne vrednosti unutar kolekcije podataka.
	 * Koristi se za pretragu ključnog elementa iz više elemenata. Najprikladniji je
	 * za male i nesortirane skupove podataka.
	 */
	/*
	 * 1.Vremenska složenost:Vremenska složenost Linear Search-a je O(n) jer u
	 * najgorem slučaju mora da proveri svaki element u nizu.
	 */
	/*
	 * 2.Uslov sortiranja:Linear Search ne zahteva da niz bude sortiran pre
	 * pretrage.
	 */
	/*
	 * 3.Način pretrage:Linear Search proverava svaki element niza redom dok ne
	 * pronađe željeni element.
	 */

	// Metoda koja obavlja ovu vrstu pretrage
	// Metoda prima niz celih brojeva i ključ kao ulazni parametar
	public static int linearSearch(int[] niz, int kljuc) {

		// for petlja koja prolazi kroz niz
		for (int i = 0; i < niz.length; i++) {
			// Provera da li je trenutni element jednak ključu
			if (niz[i] == kljuc) {
				// ako jeste, vraća indeks elementa
				return i;
			}
		}
		// Ako ključ nije pronađen u nizu, vraća -1
		return -1;
	}

	// Glavna metoda programa
	public static void main(String[] args) {

		// Definisanje niza celih brojeva
		int[] niz = { 11, 25, 34, 46, 52 };
		System.out.println("Niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		// Definisanje ključa koji se traži u nizu
		int kljuc = 34;

		// Pozivanje metode linearSearch sa nizom i ključem kao ulazom
		int result = linearSearch(niz, kljuc);

		// Proverava uslova da li je rezultat jednak -1
		if (result == -1) {
			// Ako jeste, ispisuje poruku da element nije pronađen
			System.out.println("\nElement koji ima vrednost 34 nije pronađen");

			// Inače ispisuje poruku da je element pronađen na određenom indeksu
		} else {
			System.out.println("\nElement koji ima vrednost 34 je pronađen na indeksu: " + result);
		}
	}
}
