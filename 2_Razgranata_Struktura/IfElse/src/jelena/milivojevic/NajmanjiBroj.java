package jelena.milivojevic;

import java.util.Scanner;

public class NajmanjiBroj {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se od tri učitana broja a, b i c nalazi najmanji broj.
		 */
		// Deklarisanje promenljivih
		double a, b, c, min;

		// Unos podataka
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi vrednost a: ");
		a = input.nextDouble();
		System.out.println("Unesi vrednost a: ");
		b = input.nextDouble();
		System.out.println("Unesi vrednost a: ");
		c = input.nextDouble();

		// Izracunavanje
		min = a;

		// Slucaj kada se unesu iste cifre za a,b i c
		if (min == b && min == c)
			System.out.println("Nema najmanjeg broja jer su svi uneti brojevi isti!");
		else {
			if (min > b)
				min = b;
			if (min > c)
				min = c;
			// Stampanje rezultata
			System.out.println("Najmanji broj je: " + min);
		}
		input.close();
	}

}
