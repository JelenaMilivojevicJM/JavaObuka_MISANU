package jelena.milivojevic;

public class GlavnaDijagonala {

	public static void main(String[] args) {
		int niz[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		// Elementi na glavnoj dijagonali:
		System.out.println("Glavna Dijagonala: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (i == j) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		// Elementi na glavnoj i iznad glavne
		System.out.println("Glavna i Iznad Glavne: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (i == j || i < j) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		// Elementi na glavnoj i ispod glavne
		System.out.println("Glavna i Ispod Glavne: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (i == j || i > j) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
