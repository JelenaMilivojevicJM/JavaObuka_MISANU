package jelena.milivojevic;

public class SumaKvadrataGlavnaDijagonala {

	public static void main(String[] args) {
		int niz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		int suma = 0;
		double kvadrat = 1;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {

				if (i == j) {

					kvadrat = Math.pow(niz[i][j], 2);
					suma += kvadrat;
				}
			}
		}
		System.out.println("Suma Kvadrata : " + suma);

	}

}
