package paket_svi;

public class AlgoritmiSortiranja {

	static void bubbleRastuce(int[] niz) {

		int n = niz.length;
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {

				if (niz[i] > niz[j]) {
					temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

	static void bubbleOpadajuce(int[] niz) {

		int n = niz.length;
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (niz[i] <= niz[j]) {

					temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static void sortirajeSelectionRastuce(int[] niz) {

		for (int i = 0; i < niz.length - 1; i++) {

			int indeks = i;

			for (int j = i + 1; j < niz.length; j++) {

				if (niz[j] < niz[indeks]) {

					indeks = j;
				}
			}

			int manjiBroj = niz[indeks];
			niz[indeks] = niz[i];
			niz[i] = manjiBroj;
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static void sortirajeSelectionOpadajuce(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			int indeks = i;
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] > niz[indeks]) {
					indeks = j;
				}
			}
			int najveciBroj = niz[indeks];
			niz[indeks] = niz[i];
			niz[i] = najveciBroj;
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static void mergeSortRastuce(int[] niz, int n) {

		if (n < 2) {

			return;
		}

		int sredina = n / 2;

		int[] l = new int[sredina];

		int[] d = new int[n - sredina];

		for (int i = 0; i < sredina; i++) {
			l[i] = niz[i];
		}

		for (int i = sredina; i < n; i++) {
			d[i - sredina] = niz[i];
		}

		mergeSortRastuce(l, sredina);

		mergeSortRastuce(d, n - sredina);

		merge(niz, l, d, sredina, n - sredina);

	}

	public static void merge(int[] niz, int[] l, int[] d, int levo, int desno) {

		int i = 0, j = 0, k = 0;

		while (i < levo && j < desno) {

			if (l[i] <= d[j]) {

				niz[k++] = l[i++];
			} else {

				niz[k++] = d[j++];
			}
		}

		while (i < levo) {
			niz[k++] = l[i++];
		}

		while (j < desno) {
			niz[k++] = d[j++];
		}
	}

	public static void sortirajHeap(int niz[]) {
		int n = niz.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			proveri(niz, n, i);

		for (int i = n - 1; i >= 0; i--) {

			int temp = niz[0];
			niz[0] = niz[i];
			niz[i] = temp;

			proveri(niz, i, 0);
		}
	}

	public static void proveri(int niz[], int n, int i) {

		int najveci = i;
		int l = 2 * i + 1;
		int d = 2 * i + 2;

		if (l < n && niz[l] > niz[najveci])
			najveci = l;

		if (d < n && niz[d] > niz[najveci])
			najveci = d;

		if (najveci != i) {
			int zamena = niz[i];
			niz[i] = niz[najveci];
			niz[najveci] = zamena;

			proveri(niz, n, najveci);
		}
	}

	public static void insertionSort(int[] niz) {

		for (int i = 1; i < niz.length; i++) {

			int j = i;

			while (j > 0 && niz[j - 1] > niz[j]) {

				int temp = niz[j];
				niz[j] = niz[j - 1];
				niz[j - 1] = temp;

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

		System.out.println("\nBubble Rastuće: ");
		bubbleRastuce(niz);

		System.out.println("\nBubble opadajuće: ");
		bubbleOpadajuce(niz);

		System.out.println("\nSelection Rastuće: ");
		sortirajeSelectionRastuce(niz);

		System.out.println("\nSelection Opadajuće: ");
		sortirajeSelectionOpadajuce(niz);

		System.out.println("\nMerge Sortiranje: ");
		mergeSortRastuce(niz, niz.length);

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println("\nHeap Sortiranje: ");
		sortirajHeap(niz);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		System.out.println("\nInsertion Sortiranje: ");
		insertionSort(niz);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		/*
		 * Dodatna objašnjenja razlika među algoritmima sortiranja: Za velike skupove
		 * podataka, Merge Sort i Heap Sort su najbolji izbor jer imaju vremensku
		 * složenost O(n log n) u svim slučajevima (najgore, prosečno i najbolje
		 * prosečno vreme).To znači da će vreme potrebno za sortiranje niza rasti
		 * logaritamski s povećanjem veličine niza, što je znatno brže od algoritama
		 * poput Bubble Sort, Selection Sort i Insertion Sort koji imaju vremensku
		 * složenost O(n^2). Za male skupove podataka, Insertion Sort je često najbolji
		 * izbor jer ima jednostavnu implementaciju i dobro se ponaša na malim skupovima
		 * podataka. Iako ima vremensku složenost O(n^2) u najgorem i prosečnom slučaju,
		 * to nije veliki problem za male skupove podataka. Takođe, Insertion Sort ima
		 * vremensku složenost O(n) u najboljem slučaju (kada je ulazni niz već
		 * sortiran), što ga čini brzim za delomično sortirane podatke.
		 * Generealno,stručnjaci tvrde da su Merge Sort i Heap Sort su najbrži jer imaju
		 * vremensku složenost O(n log n) u svim slučajevima (najgore, prosečno i
		 * najbolje). Oba algoritma su optimalna i imaju istu vremensku složenost.
		 * Takođe Bubble Sort se smatra najsporijim od navedenih algoritama sortiranja
		 * jer ima vremensku složenost O(n^2) u najgorem i prosečnom slučaju. To znači
		 * da će vreme potrebno za sortiranje niza rasti kvadratno s povećanjem veličine
		 * niza. Bubble Sort, Selection Sort i Insertion Sort su najjednostavniji za
		 * implementaciju jer imaju jednostavne algoritme i ne zahtevaju dodatne
		 * podatkovne strukture ili rekurziju. Međutim, oni su manje efikasni od
		 * složenijih algoritama poput Merge Sort i Heap Sort. Zaključno svemu, izbor
		 * algoritma zavisi od veličine niza koji treba sortirati, tipova i vrste
		 * podataka koji se sortiraju, resursa koji su na raspolaganju i vremenske
		 * složenosti.
		 */
	}

}
