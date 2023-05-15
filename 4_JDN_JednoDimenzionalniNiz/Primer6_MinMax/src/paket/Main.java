package paket;

public class Main {

	public static void main(String[] args) {
		int niz[] = { 15, 62, 34, 47, 25 };

		// Stampanje niza:
		System.out.print("Niz: ");
		for (int i : niz) {
			System.out.print(i + " ");
		}

		// MAX: inicijalizujemo vrednoscu prvog elementa u nizu
		int max = niz[0];
		for (int i = 0; i < 5; i++) {

			if (niz[i] > max) {
				max = niz[i];
			}
		}
		System.out.println("\nNajveci broj niza je: " + max);

		// MIN:inicijalizujemo vrednoscu prvog elementa u nizu

		int min = niz[0];

		for (int i = 0; i < 5; i++) {

			if (niz[i] < min) {
				min = niz[i];
			}
		}
		System.out.println("Najmanji broj niza je: " + min);
	}

}
