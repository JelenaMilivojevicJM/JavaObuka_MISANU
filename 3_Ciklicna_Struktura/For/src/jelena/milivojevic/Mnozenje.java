package jelena.milivojevic;

import java.util.Scanner;

public class Mnozenje {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za date prirodne brojeve m i n, izračunava: S =
		 * n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)
		 */
		/* Unos podataka */
		int n, m, s = 1;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za m: ");
		m = ulaz.nextInt();
		ulaz.close();

		/* Obrada podataka */
		for (int i = 1; i <= m; i++) {
			s *= n + i * m;
		}

		/* Ispisivanje izlaznog rezultata za S */
		System.out.println("Vrednost za S je: " + (n * s));
	}

}
