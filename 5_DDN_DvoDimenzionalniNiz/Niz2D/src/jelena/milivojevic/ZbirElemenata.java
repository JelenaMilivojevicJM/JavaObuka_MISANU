package jelena.milivojevic;

import java.util.Scanner;

public class ZbirElemenata {

	public static void main(String[] args) {
		/* Učitati dva dvodimenzionalnog niza, a zatim izračunati zbir elemenata */
		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int nizA[][] = new int[red][kolona];
		int nizB[][] = new int[red][kolona];
		int nizC[][] = new int[red][kolona];

		System.out.println("Elementi dvodimenzionalnog niza A su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("nizA[" + i + ", " + j + "]" + " = ");
				nizA[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elementi dvodimenzionalnog niza B su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("nizB[" + i + ", " + j + "]" + " = ");
				nizB[i][j] = sc.nextInt();
			}
		}

		// Stampanje elementa dvodimenzionalnog niza A:
		System.out.println("Izgled niza A: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(nizA[i][j] + " ");
			}
			System.out.println();
		}

		// Stampanje elementa dvodimenzionalnog niza B:
		System.out.println("Izgled niza B: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(nizB[i][j] + " ");
			}
			System.out.println();
		}

		// a) Ispisati zbir elemenata nizova A i B
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				nizC[i][j] = nizA[i][j] + nizB[i][j];
			}
		}

		// Stampanje elementa dvodimenzionalnog niza C:
		System.out.println("Izgled niza C: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(nizC[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
