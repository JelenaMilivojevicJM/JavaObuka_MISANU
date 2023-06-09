package jelena.milivojevic;

public class ProizvodSkalarom {

	public static void main(String[] args) {
		/*
		 * Učitati dva dvodimenzionalnog niza, a zatim izračunati proizvod matrice
		 * skalarom
		 */
		// Deklaracija, inicijalizacija i stampanje dve matrica:
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		System.out.println("Niz A:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Niz B:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// SABIRANJE MATRICA:
		// Potrebna je 3.matrica kao rezultat
		int c[][] = new int[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];

			}
		}
		System.out.println("Niz C:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		// MNOZENJE SKALAROM:
		// Potrebna je 4.matrica kao rezultat
		System.out.println("C pomnozena skalarom: ");
		int skalar = 4;
		int proizvod[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				proizvod[i][j] = c[i][j] * skalar;
			}
		}
		for (int i = 0; i < proizvod.length; i++) {
			for (int j = 0; j < proizvod.length; j++) {
				System.out.print(proizvod[i][j] + " ");
			}
			System.out.println();
		}
	}

}
