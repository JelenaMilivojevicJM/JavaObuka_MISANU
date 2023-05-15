package jelena.milivojevic;

import java.util.Scanner;

public class KoreniliKvadrat {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za unetu vrednost a ispisuje njegov koren, a ako je
		 * negativan njegov kvadrat.
		 */
		Scanner input = new Scanner(System.in);
		// Ulaz
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		double y;
		// Obrada
		if (a > 0)
			y = Math.sqrt(a);
		else
			y = a * a;

		// Izlaz:
		System.out.println("y = " + y);
		input.close();
	}

}
