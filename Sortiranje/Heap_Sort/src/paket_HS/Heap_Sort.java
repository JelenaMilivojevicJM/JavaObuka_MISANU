package paket_HS;

public class Heap_Sort {
	/*
	 * Heap sort je algoritam sortiranja zasnovan na binarnoj strukturi podataka
	 * Heap. Heap sort je sličan algoritmu Selection sort, gde prvo pronalazimo
	 * najmanji element i postavljamo ga na početak. Ponavljamo isti proces za
	 * preostale elemente. Ovo sortiranje, dakle, koristi strukturu podataka poznatu
	 * kao heap, koja omogućava brzo pronalaženje maksimalnog elementa u nizu. U
	 * prvom koraku se niz konstruiše u obliku heap-a, a zatim se vrši sortiranje
	 * tako što se uzima kao početni element heap-a (najveći element) i stavlja na kraj niza.
	 * Nakon toga se ponovo pravi heap od preostalog dela niza, i postupak se
	 * ponavlja sve dok se ne sortira ceo niz. Heap sort ima nekoliko prednosti: 1.
	 * Efikasnost: Heap sort je efikasan algoritam sortiranja sa složenošću
	 * O(n*log(n)) u najboljem, prosečnom i najgorem slučaju. 2.Pogodnost za spoljno
	 * sortiranje: Heap sort se široko koristi za spoljno sortiranje, gde nasumični
	 * pristup nije naefikasniji u odnosu na sekvencijalni pristup. Stručnjaci tvrde
	 * da su neke od mana Heap sortiranje te da nije stabilan(što znači da elementi sa istim ključem neće
	 * nužno zadržati svoj relativni redosled nakon sortiranja), ili to da može biti
	 * sporiji od drugih algoritama sortiranja (Quick sort i Merge sort).
	 */

	// HEAP SORTIRANJE PRIMER:

	public static void sortirajHeap(int niz[]) {
		int n = niz.length;
		// Kreira se max heap od ulaznog niza
		/*
		 * Prva for petlja prolazi kroz sve elemente niza od sredine do početka i poziva
		 * proveri() metodu za svaki element. Ova petlja služi da kreira max heap od
		 * ulaznog niza. Ova for petlja prolazi kroz sve elemente niza od kraja do
		 * početka. Indeks i se inicijalizuje na n - 1, gde je n dužina ulaznog niza.
		 * Indeks i se smanjuje za 1 u svakoj iteraciji petlje. Petlja se završava kada
		 * i postane manje od 0. U telu ove petlje se prvo menja mesto trenutnom početnom elementu
		 * sa krajem. Ovo se postiže tako što se prvo sačuva vrednost prvog elementa
		 * niza u promenljivoj temp. Zatim se prvi element niza postavlja na vrednost
		 * elementa na poziciji i. Na kraju, element na poziciji i se postavlja na
		 * vrednost promenljive temp. Nakon toga, poziva se metoda proveri() sa tri
		 * argumenta: ulazni niz, dužina smanjenog heap-a i i indeks elementa koji treba
		 * da bude heapified (u ovom slučaju je to prvi element). Ova metoda služi da
		 * održava max heap svojstvo.
		 */
		for (int i = n / 2 - 1; i >= 0; i--)
			proveri(niz, n, i);
		// Izvlači se element po element iz heap-a
		/*
		 * Druga for petlja prolazi kroz sve elemente niza od kraja do početka. U ovoj
		 * petlji se menja mesto trenutnom početnom sa krajem, a zatim se poziva proveri()
		 * metoda na smanjenom heap-u. Ova petlja služi da izvuče element po element iz
		 * heap-a.
		 */
		for (int i = n - 1; i >= 0; i--) {
			// Menja se mesto trenutnom početnom sa krajem
			int temp = niz[0];
			niz[0] = niz[i];
			niz[i] = temp;
			// Poziva se proveri()
			proveri(niz, i, 0);
		}
	}

	public static void proveri(int niz[], int n, int i) {
		/*
		 * Metoda proveri služi da održava max heap svojstvo. Ova metoda uzima tri
		 * argumenta: ulazni niz, dužinu niza n i indeks elementa i koji treba da bude
		 * heapified. U ovoj metodi se prvo inicijalizuje najveći element kao početni
		 * element niza. Zatim se proverava da li su levo ili desno vrednosti elemenata
		 * veće od trenutno najvećeg elementa. Ako je to slučaj, menja im se mesto. Ovaj
		 * proces se ponavlja rekurzivno dok se ne održi max heap svojstvo.
		 */
		int najveci = i; // Inicijalizuje se najveći kao početni
		int l = 2 * i + 1; // levo = 2*i + 1
		int d = 2 * i + 2; // desno = 2*i + 2

		// Ako je element levo veći od početnog
		if (l < n && niz[l] > niz[najveci])
			najveci = l;

		// Ako je element desno veći od trenutno najvećeg
		if (d < n && niz[d] > niz[najveci])
			najveci = d;

		// Ako najveći nije početni
		if (najveci != i) {
			int zamena = niz[i];
			niz[i] = niz[najveci];
			niz[najveci] = zamena;

			// Rekurzivno proveravanje
			proveri(niz, n, najveci);
		}
	}

	public static void main(String[] args) {
		// Deklaracija i Inicijalizacija početnog niza
		int niz[] = { 2, 5, 7, 8, 1, 3, 6, 4, 9 };
		System.out.println("Niz pre sortiranja: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		System.out.println("\nNiz nakon Heap sortiranja: ");
		sortirajHeap(niz);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

}
