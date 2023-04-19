package jelena.milivojevic;

import java.util.Scanner;

public class DrugaKolona {

	public static void main(String[] args) {
		/*
		 * Učitati elemente dvodimenzionalnog niza, a zatim ispisati sve elemente druge
		 * kolone
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		// b) Ispisati elemente druge kolone

		System.out.println("Elementi druge kolone: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1) {
					System.out.print(niz[i][j] + " ");
				}
			}

		}
		sc.close();
	}

}
