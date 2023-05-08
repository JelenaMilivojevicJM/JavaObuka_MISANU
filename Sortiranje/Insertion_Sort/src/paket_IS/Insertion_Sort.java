package paket_IS;

public class Insertion_Sort {
	/*
	 * Insertion sort je jednostavan algoritam za sortiranje koji radi tako što
	 * gradi sortirani niz, jedan element po jedan. To je sortiranje umetanjem
	 * elemenata niza na odgovarajuća mesta. Insertion sort je jedan od
	 * najjednostavnijih algoritama sortiranja. On radi tako što prolazi kroz niz i
	 * za svaki element nalazi pravo mesto u sortiranom delu niza. Na taj način,
	 * element se ubacuje na pravo mesto u sortirani deo niza, čime se postepeno
	 * formira sortiran niz. Ovaj algoritam ima vremensku složenost O(n^2) i nije
	 * efikasan za velike nizove. Mnogo je manje efikasan na velikim listama od
	 * naprednijih algoritama kao što su quicksort, heapsort ili merge sort.
	 */

	// INSERTION SORT PRIMER:

	public static void insertionSort(int[] niz) {
		/*
		 * Ova metoda insertion sort-a prolazi kroz ulazni niz i za svaki element
		 * upoređuje ga sa elementima pre njega u sortiranom delu niza. Ako je trenutni
		 * element manji od prethodnog elementa, zamenjuje ih i nastavlja da upoređuje i
		 * zamenjuje dok trenutni element nije na svom ispravnom mestu u sortiranom delu
		 * niza.
		 */

		for (int i = 1; i < niz.length; i++) {
			/*
			 * For petlja koja se izvršava od i = 1 do i < niz.length. Petlja se izvršava za
			 * svaki element niza počevši od drugog elementa (jer je prvi element već
			 * sortiran sam po sebi).
			 */

			int j = i;
			/*
			 * Inicijalizacija varijable j na vrednost i. Varijabla j se koristi u
			 * sledećoj while petlji za iteraciju kroz sortirani deo niza.
			 */

			while (j > 0 && niz[j - 1] > niz[j]) {
				/*
				 * While petlja se izvršava dok je j > 0 i dok je element pre trenutnog elementa
				 * (niz[j - 1]) veći od trenutnog elementa (niz[j]). Ako je ovo true, znači da
				 * trenutni element nije na pravnom mestu u sortiranom delu niza i treba ga
				 * pomaknuti na levo.
				 */

				// Zamene mesta elemenata
				int temp = niz[j];
				niz[j] = niz[j - 1];
				niz[j - 1] = temp;
				// Dekrement svakim prolaskom kroz petlju za -1
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// Deklaracija i Inicijalizacija početnog niza
		int niz[] = { 2, 5, 7, 8, 1, 3, 6, 4, 9 };
		System.out.println("Niz pre sortiranja: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		System.out.println("\nNiz nakon Insertion sortiranja: ");
		insertionSort(niz);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}
