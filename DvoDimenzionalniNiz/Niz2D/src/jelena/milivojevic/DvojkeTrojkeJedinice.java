package jelena.milivojevic;

public class DvojkeTrojkeJedinice {

	public static void main(String[] args) {
		/*
		 * NA GLAVNOJ DIJAGONALI SVE JEDINICE, ELEMENTI GORENJE TRUGAONE MATRICE IMAJU
		 * VREDNOST 2, A ELEMENTI DONJE TROUGAONE MATRICE VREDNOST 3.
		 */
		// Ulaz:
		int niz[][] = new int[5][5];

		// Obrada:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == j) {

					niz[i][j] = 1;

				} else if (i < j) {

					niz[i][j] = 2;

				} else {

					niz[i][j] = 3;
				}
			}
		}

		// Stampanje:
		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {

				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
