package jelena.milivojevic;

import java.util.Scanner;

public class Kvadar {

	public static void main(String[] args) {
		/*
		 * Sastaviti algoritam i napisati program kojim se na osnovu unetih stranica
		 * kvadra izračunava površina i zapremina. Na izlazu štampati površinu i
		 * zapreminu kvadra.
		 */
		// Deklarisanje promenljivih
		double a, b, c, p, v;

		// Unos podataka
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice a: ");
		a = ulaz.nextDouble();
		System.out.println("Unesite vrednost stranice b: ");
		b = ulaz.nextDouble();
		System.out.println("Unesite vrednost stranice c: ");
		c = ulaz.nextDouble();

		// Izračunavanje površine i zapremine kvadra

		p = 2 * ((a * b) + (a * c) + (b * c));
		v = a * b * c;

		// Štampanje vrednosti zapremine i površine kvadra

		System.out.println("Površina kvadra je: " + p + "\nZapremina kvadra je: " + v);
		ulaz.close();
	}

}
