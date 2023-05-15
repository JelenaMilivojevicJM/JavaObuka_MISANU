package jelena.milivojevic;

import java.util.Scanner;

public class GaloniULitre {

	public static void main(String[] args) {
		/*
		 * Napisati program za pretvaranje galona u litre. Napomena: 1 galon = 4,54 l.
		 */

		/*
		 * Tekstualni algoritam: 1. ulaz: učitati količinu u galonima g 2. obrada:
		 * izračunati količinu u litrima l = g * 4.54 3. izlaz: ispisati vrednost
		 * količine u litrima
		 */
		// Ulaz:
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite zapreminu u galonima: ");
		double g = input.nextDouble();

		// Obrada + Izlaz:
		System.out.println("Zapremina u litrima je: " + (g * 4.54));

		input.close();
	}

}
