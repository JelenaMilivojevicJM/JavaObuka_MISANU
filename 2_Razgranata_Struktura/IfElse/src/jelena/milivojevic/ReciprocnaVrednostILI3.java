package jelena.milivojevic;

import java.util.Scanner;

public class ReciprocnaVrednostILI3 {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se od tri učitana broja a, b i c ispisuje recipročna
		 * vrednost najmanjeg broja, a ako je min = 0 ispisuje se 3.
		 */
		Scanner input = new Scanner(System.in);
		// Unos podataka
		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		System.out.print("Unesite vrednostza c: ");
		int c = input.nextInt();
		double r = 0;
		double min = a;

		// Obrada
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		// Izlaz 1:
		System.out.println("Najmanji broj je " + min);
		if (min == 0)
			r = 3;
		else
			r = 1 / min;
		// Izlaz 2:
		System.out.println("r = " + r);
		input.close();
	}

}
