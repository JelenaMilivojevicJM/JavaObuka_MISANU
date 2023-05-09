package paket_Binary_Search;

public class Binary_Search_CeoBroj {
	/*
	 * Binary Search je algoritam pretrage koji pronalazi poziciju ciljne vrednosti
	 * unutar sortiranog niza. Radi tako što ponavljano deli pretraživački interval
	 * na pola. Ako je vrednost pretraživačkog ključa manja od stavke u sredini
	 * intervala, algoritam sužava interval na donju polovinu. U suprotnom, sužava
	 * ga na gornju polovinu. Ponavljano proverava dok se vrednost ne pronađe ili
	 * interval ne bude prazan. Binarno pretraživanje je brz algoritam za pretragu
	 * sa složenošću vremena izvršavanja od O(log n). Da bi ovaj algoritam ispravno
	 * funkcionisao, prikupljanje podataka treba da bude u sortiranom obliku, i zato
	 * je ovo je efikasniji algoritam .
	 */
	/*
	 * 1.Vremenska složenost: Binary Search-a je O(log n) jer ponavljano deli
	 * pretraživački interval na pola. To znači da je Binary Search efikasniji od
	 * Linear Search-a za velike skupove podataka.
	 */
	/*
	 * 2.Uslov sortiranja:Binary Search zahteva da niz bude sortiran pre pretrage.
	 */
	/*
	 * 3.Način pretrage:Binary Search ponavljano deli pretraživački interval na pola
	 * i sužava ga na donju ili gornju polovinu u zavisnosti od toga da li je ključ
	 * manji ili veći od elementa u sredini intervala
	 */

	// Metoda binarySearch koja prima sortirani niz celih brojeva i ključ kao ulazne
	// parametre
	public static int binarySearch(int[] niz, int kljuc) {
		// definisanje promenljive koja predstavlja početak pretraživačkog intervala
		int pocetak = 0;

		// definisanje promenljive koja predstavlja kraj pretraživačkog intervala
		int kraj = niz.length - 1;

		// while petlja koja se izvršava dok je pocetak manje ili jednako kraj
		while (pocetak <= kraj) {
			// izračunavanje srednjeg indeksa
			int sredina = pocetak + (kraj - pocetak) / 2;

			// proverava da li je element na srednjem indeksu jednak zadatom ključu
			if (niz[sredina] == kljuc) {
				// ako jeste, vraća indeks elementa
				return sredina;
			} else if (niz[sredina] < kljuc) {
				// inače proverava da li je element na srednjem indeksu manji od ključa
				pocetak = sredina + 1;
				// ako jeste, ažurira promenljivu pocetak tako što joj dodeljuje vrednost
				// sredina + 1
			} else {
				// inače ažurira promenljivu krajt tako što joj dodeljuje vrednost sredina - 1
				kraj = sredina - 1;
			}
		}
		// ako ključ nije pronađen u nizu, vraća -1
		return -1;
	}

	// Glavna metoda programa
	public static void main(String[] args) {
		// definisanje sortiranog niza celih brojeva
		int[] niz = { 15, 26, 38, 47, 95 };
		System.out.println("Niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		// definisanje ključa koji se traži u nizu
		int kljuc = 47;

		// pozivanje metode binarySearch sa nizom i ključem kao ulazom
		int rezultat = binarySearch(niz, kljuc);

		// provera da li je rezultat jednak -1
		if (rezultat == -1) {
			// ako jeste, ispisuje poruku da element nije pronađen
			System.out.println("\nElement koji ima vrednost 47 nije pronađen");
		} else {
			// inače ispisuje poruku da je element pronađen na određenom indeksu
			System.out.println("\nElement koji ima vrednost 47 je pronađen na indeksu: " + rezultat);
		}
	}
}