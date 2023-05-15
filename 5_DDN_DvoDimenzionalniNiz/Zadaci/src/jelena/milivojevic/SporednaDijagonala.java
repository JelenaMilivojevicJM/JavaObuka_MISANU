package jelena.milivojevic;

public class SporednaDijagonala {

	public static void main(String[] args) {
		int niz[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		// Elementi na sporednoj dijagonali:
		System.out.println("Sporedna Dijagonala: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if ((i + j) == niz.length - 1) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}

		// Elementi na sporednoj i iznad sporedne
		System.out.println("Sporedna i Iznad Sporedne: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if ((i + j) == niz.length - 1 || (i + j) < niz.length - 1) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		// Elementi na sporednoj i ispod sporedne
		System.out.println("Sporedna i Ispod Sporedne: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if ((i + j) == niz.length - 1 || (i + j) > niz.length - 1) {
					System.out.print(niz[i][j] + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
