package jelena.milivojevic;

import java.util.Scanner;

public class TackaUPravougaoniku {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se proverava da li je uneta tačka unutar
		 * pravougaonika.
		 */
		// Unos podataka
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite koordinatu x tačke: ");
		double x = input.nextDouble();
		System.out.print("Unesite koordinatu y tačke: ");
		double y = input.nextDouble();
		System.out.print("Unesite koordinatu x1 pravougaonika: ");
		double x1 = input.nextDouble();
		System.out.print("Unesite koordinatu x2 pravougaonika: ");
		double x2 = input.nextDouble();
		System.out.print("Unesite koordinatu y1 pravougaonika: ");
		double y1 = input.nextDouble();
		System.out.print("Unesite koordinatu y2 pravougaonika: ");
		double y2 = input.nextDouble();
		// Obrada:
		if ((x > x1) && (x < x2) && (y > y1) && (y < y2))
			// Izlaz:
			System.out.print("Tačka je unutar pravougaonika.");
		else
			// izlaz:
			System.out.print("Tačka nije unutar pravougaonika.");

		input.close();
	}

}
