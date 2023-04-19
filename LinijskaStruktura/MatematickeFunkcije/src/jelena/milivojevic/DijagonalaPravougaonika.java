package jelena.milivojevic;

import java.util.Scanner;

public class DijagonalaPravougaonika {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava dijagonala pravougaonika za unete
		 * stranice pravougaonika a i b.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati stranice pravougaonika a i b 2. obrada:
		 * izračunati dijagonalu pravougaonika 3. izlaz: ispisati vrednost dijagonale
		 * pravougaonika
		 */

		// ulaz:
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice pravougaonika a: ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice pravougaonika b: ");
		double b = input.nextDouble();
		// Obrada + Izlaz:
		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));
		input.close();
	}

}
