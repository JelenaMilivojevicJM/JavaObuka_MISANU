package paket_Binary_Search;

public class Binary_Search_String {

	// Metoda binarySearch koja prima sortirani niz stringova i ključ kao ulazne
	// parametre
	public static int binarySearch(String[] niz, String key) {

		// definisanje promenljive pocetak koja predstavlja početak pretraživačkog
		// intervala
		int pocetak = 0;

		// definisanje promenljive kraj koja predstavlja kraj pretraživačkog intervala
		int kraj = niz.length - 1;

		// while petlja koja se izvršava dok je pocetak manje ili jednako kraj
		while (pocetak <= kraj) {

			// izračunavanje srednjeg indeksa
			int sredina = pocetak + (kraj - pocetak) / 2;

			if (niz[sredina].compareTo(key) == 0) { // proverava da li je element na srednjem indeksu jednak ključu
													// koristeći metodu compareTo
				return sredina; // ako jeste, vraća indeks elementa

				// inače proverava da li je element na srednjem indeksu manji od ključa
				// koristeći metodu compareTo
			} else if (niz[sredina].compareTo(key) < 0) {
				// ako jeste, ažurira promenljivu pocetak tako što joj dodeljuje vrednost
				// sredina + 1
				pocetak = sredina + 1;

				// inače ažurira promenljivu kraj tako što joj dodeljuje vrednost sredina - 1
			} else {
				kraj = sredina - 1;

			}
		}
		// ako ključ nije pronađen u nizu, vraća -1
		return -1;
	}

	// Glavna metoda programa
	public static void main(String[] args) {
		String[] niz = { "Jabuka", "Kruska", "Breskva", "Banana", "Kajsija" };
		System.out.println("Niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		// definisanje ključa koji se traži u nizu
		String kljuc = "Breskva";

		// pozivanje metode binarySearch sa nizom i ključem kao ulazom
		int rezultat = binarySearch(niz, kljuc);

		// proveravanje da li je rezultat jednak -1
		if (rezultat == -1) {
			// ako jeste, ispisuje poruku da element nije pronađen
			System.out.println("\nElement koji ima vrednost Breskva nije pronađen");
		} else {
			// inače ispisuje poruku da je element pronađen na određenom indeksu
			System.out.println("\nElement koji ima vrednost Breskva je pronađen na indeksu: " + rezultat);
		}
	}
}
