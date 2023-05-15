package jelena.milivojevic;

public class JediniceINule {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se formira matrica A reda NxN tako da se na glavnoj i
		 * sporednoj dijagonali nalaze jedinice, a svi ostali elementi matrice budu
		 * nule.Ulaz: N = 5
		 */
		int n = 5;
		int m = 5;

		int niz[][] = new int[n][m];

		// Obrada:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (i == j) {

					niz[i][j] = 1;

				} else if ((i + j) == niz.length - 1) {

					niz[i][j] = 1;

				} else {

					niz[i][j] = 0;
				}
			}
		}

		// Stampanje

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
