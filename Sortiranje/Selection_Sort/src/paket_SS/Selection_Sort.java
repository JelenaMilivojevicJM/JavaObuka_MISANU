package paket_SS;

public class Selection_Sort {
	/*
	 * Selection sort je algoritam sortiranja, koji, takođe prolazi kroz niz više
	 * puta. Pronalazi najmanji element u nizu i stavlja ga na početak. Zatim, taj
	 * deo niza se odvaja(odseče) i preostali deo niza se sortira na isti način,
	 * pronalazeći drugi najmanji element i stavljajući ga na drugo mesto. Moglo bi
	 * se reći da održava dva podniza za dati niz. Prvi podniz je već sortiran, a
	 * drugi podniz je nesortiran. Sa svakom iteracijom Selection sort-a, element se
	 * uzima iz nesortiranog podniza i premešta u sortirani podniz. Proces
	 * sortiranja se nastavlja dok se ne dođe do kraja niza. Stručnjaci tvrde da ovaj
	 * algoritam ima lošu vremensku složenost, ali je malo efikasniji od Bubble
	 * sorta. Takođe, i ova vrsta algoritma sortiranja može biti implementirana radi
	 * sprovođenja i rastućeg i opadajućeg redosleda sortiranja.
	 */

	// SELECTION SORTIRANJE PRIMER:

	// Metoda za sortiranje od manjeg ka većem broju
	public static void sortirajRastuce(int[] niz) {
		// For petljom prolazimo kroz sve elemente niza osim poslednjeg
		for (int i = 0; i < niz.length - 1; i++) {
			 // Postavljamo indeks na trenutnu poziciju
			int indeks = i;
			 // For petljom prolazimo kroz sve elemente niza nakon trenutne pozicije
			for (int j = i + 1; j < niz.length; j++) {
				// Ukoliko je element na poziciji j manji od elementa na poziciji indeks
				if (niz[j] < niz[indeks]) {
					 // Postavljamo indeks na poziciju j
					indeks = j;
				}
			}
			// Menjamo mesta elementima na pozicijama i i indeks
			int manjiBroj = niz[indeks];
			niz[indeks] = niz[i];
			niz[i] = manjiBroj;
		}
		// Ispisujemo sortirani niz
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	// Metoda za sortiranje od većeg ka manjem broju
	public static void sortirajOpadajuce(int[] niz) {
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

	public static void main(String[] args) {

		// Deklaracija i Inicijalizacija početnog niza
		int niz[] = { 2, 5, 7, 8, 1, 3, 6, 4, 9 };
		System.out.println("Niz pre sortiranja: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		System.out.println("\nNiz sortiran rastuće: ");
		sortirajRastuce(niz);

		System.out.println("\nNiz sortiran opadajuće: ");
		sortirajOpadajuce(niz);
	}

}