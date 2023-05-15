package jelena.milivojevic;

import java.util.Scanner;

public class NeparniIndeksKolona {

	public static void main(String[] args) {
		/*
		 * Učitati elemente dvodimenzionalnog niza, a zatim ispisati elemente sa
		 * neparnim indexima kolona
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

		// Ispisati elemente sa neparnim indeksima kolona

		System.out.println("Elementi sa neparnim indeksima kolona: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((j + 1) % 2 != 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
			System.out.println();

		}
		sc.close();
	}

}
