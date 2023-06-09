package jelena.milivojevic;

import java.util.Scanner;

public class SinusKosinus {

	public static void main(String[] args) {
		/*
		 * Napisati program za izračunavanje sinusa i kosinusa ugla zadatog u
		 * radijanima.
		 */
		/*
		 * Tekstualni algoritam 1. ulaz: učitati vrednost ugla u radijanima 2. obrada:
		 * izračunati sin i cos ugla 3. izlaz: ispisati vrednost sinusa i kosinusa
		 * zadatog ugla
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost ugla u radijanima: ");
		double x = input.nextDouble();
		System.out.println("Sinus zadatog ugla je: " + Math.sin(x));
		System.out.print("Kosinus zadatog ugla je: " + Math.cos(x));

		input.close();
	}

}
