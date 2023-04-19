package jelena.milivojevic;

import java.util.Scanner;

public class SviParni {

	public static void main(String[] args) {
		/*
		 * Učitati elemente dvodimenzionalnog niza, a zatim ispisati sve parne elemente
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

		// Ispisati parne elemente niza

		System.out.println("Parni elementi niza:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
