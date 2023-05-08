package paket_MS;

public class Merge_Sort {
	/*
	 * Merge sort je sortiranje spajanjem sortiranih nizova. 
	 * To je jedna od najefikasnijih tehnika sortiranja koji se zasniva na
	 * paradigmi "podeli pa vladaj". Algoritam Merge sort-a je "podeli pa vladaj"
	 * algoritam, gde prvo delimo problem na podprobleme. Kada su rešenja za
	 * podprobleme spremna, kombinujemo ih zajedno da bismo dobili konačno rešenje
	 * problema. Merge sort ima vremensku složenost O(n*log(n)), što ga čini
	 * idealnim za sortiranje većih nizova. Merge sort se može koristiti sa
	 * povezanim listama bez zauzimanja dodatnog prostora. Takođe, Merge sort se
	 * koristi kada struktura podataka ne podržava nasumični pristup, jer radi sa
	 * čistim sekvencijalnim pristupom (napredni iteratori, umesto iteratora
	 * nasumičnog pristupa). Osnovne prednosti Merge srotiranja: 1.Stabilnost: znači da će elementi sa istim
	 * ključem zadržati svoj relativni redosled nakon sortiranja. 2.Efikasnost: Merge
	 * sort je efikasan algoritam sortiranja sa složenošću O(n*log(n)) u najboljem,
	 * prosečnom i najgorem slučaju.
	 */

	// MERGE SORIRANJE PRIMER:
	/*
	 * Možemo implementirati ovaj algoritam koristeći rekurziju, jer se bavimo
	 * podproblemima umesto glavnim problemom. Možemo opisati algoritam kao proces
	 * od 2 koraka: 1.Podeli: U ovom koraku delimo ulazni niz na 2 polovine. Ovaj
	 * korak se izvodi rekurzivno za sve polovine niza dok više ne postoje polovine
	 * niza koje treba podeliti. 2. Vladaj: U ovom koraku sortiramo i spajamo
	 * podeljene nizove od dna do vrha i dobijamo sortirani niz.
	 */

	public static void mergeSortRastuce(int[] niz, int n) {
		/*
		 * Proveravamo da li je dužina niza manja od 2. Osnovni uslov proverava da li je
		 * dužina niza 1 i samo će se vratiti. Za ostale slučajeve izvršavaće se
		 * rekurzivni poziv.*/
		if (n < 2) {
			// Ako je dužina niza manja od 2, završava se funkcija
			return;
		}
		// Računa sredinu niza
		int sredina = n / 2;
		// Kreira se novi niz l dužine sredine
		int[] l = new int[sredina];
		// Kreira se novi niz d dužine n - sredina
		int[] d = new int[n - sredina];

		// Kopira prvu polovinu ulaznog niza u niz l
		for (int i = 0; i < sredina; i++) {
			l[i] = niz[i];
		}
		// Kopira drugu polovinu ulaznog niza u niz d
		for (int i = sredina; i < n; i++) {
			d[i - sredina] = niz[i];
		}
		// Rekurzivno poziva mergeSort za prvu polovinu ulaznog niza
		mergeSortRastuce(l, sredina);
		// Rekurzivno poziva mergeSort za drugu polovinu ulaznog niza
		mergeSortRastuce(d, n - sredina);

		// Spaja dva sortirana podniza u jedan sortirani niz
		merge(niz, l, d, sredina, n - sredina);

	}

	public static void merge(int[] niz, int[] l, int[] d, int levo, int desno) {

		// Inicijalizacija indeksa za tri niza
		int i = 0, j = 0, k = 0;
		// Dok ima elemenata u oba podniza
		while (i < levo && j < desno) {
			/*
			 * Ispitivanje uslova da li je element iz prvog podniza manji ili jednak
			 * elementu iz drugog podniza
			 */
			if (l[i] <= d[j]) {
				// Dodaje se element iz prvog podniza u rezultujući niz
				niz[k++] = l[i++];
			} else {
				// Ako nije, dodaje se element iz drugog podniza u rezultujući niz
				niz[k++] = d[j++];
			}
		}
		// Kopira preostale elemente iz prvog podniza u rezultujući niz (ako ih ima)
		while (i < levo) {
			niz[k++] = l[i++];
		}
		// Kopira preostale elemente iz drugog podniza u rezultujući niz (ako ih ima)
		while (j < desno) {
			niz[k++] = d[j++];
		}
	}

	public static void main(String[] args) {
		// Deklaracija i Inicijalizacija početnog niza
		int niz[] = { 2, 5, 7, 8, 1, 3, 6, 4, 9 };
		System.out.println("Niz pre sortiranja: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println("\nNiz nakon Merge sortiranja: ");
		// Poziva se mergeSort metoda za sortiranje niza
		mergeSortRastuce(niz, niz.length);
		// Ispisuje se sortirani niz
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

}
