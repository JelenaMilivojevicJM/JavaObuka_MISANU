package jelena.milivojevic;

import java.io.*;

public class NajveciBroj {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se od tri učitana broja a, b i c nalazi najveći broj.
		 */
		// Deklarisanje promenljivih
		double a, b, c, max;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.println("Unesite a: ");
		a = Double.parseDouble(input.readLine());
		System.out.println("Unesite b: ");
		b = Double.parseDouble(input.readLine());
		System.out.println("Unesite c: ");
		c = Double.parseDouble(input.readLine());

		// Izracunavanje
		max = a;
		// Slucaj kada su svi uneti brojevi isti
		if (max == b && max == c)
			System.out.println("Nema najveceg broja jer su svi brojevi isti!");

		else {
			if (max < b)
				max = b;
			if (max < c)
				max = c;
			// Stampanje najveceg broja od unetih
			System.out.println("Najveci broj je: " + max);
		}

	}

}
