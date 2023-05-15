package jelena.milivojevic;

import java.util.Scanner;

public class ParanNeparan {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se unosi prirodan broj a i ako je neparan ispisuje
		 * njegova recipročna vrednost, a ako je paran ispisuje kvadrat njegovog
		 * prethodnika.
		 */
		Scanner input = new Scanner(System.in);
		int a;
		double y;
		// Ulaz
		System.out.println("Unesite vrednost broja a: ");
		a = input.nextInt();
		// Obrada
		if (a % 2 != 0)
			y = (double) 1 / a;
		else
			y = (a - 1) * (a - 1);

		// Izlaz:
		System.out.println("y je " + y);

		input.close();

	}

}
