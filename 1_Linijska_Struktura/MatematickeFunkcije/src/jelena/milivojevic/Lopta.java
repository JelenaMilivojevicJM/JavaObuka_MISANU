package jelena.milivojevic;

import java.util.Scanner;

public class Lopta {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava površina i zapremina lopte na osnovu
		 * unetog poluprečnika.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati poluprečnik lopte r 2. obrada:
		 * izračunati površinu i zapreminu lopte P = 4 * r * r * π V = 4 * r * r * r * π
		 * / 3; 3. izlaz: ispisati vrednost površine i zapremine lopte
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost poluprečnika: ");
		double r = input.nextDouble();
		double P = Math.pow(r, 2) * Math.PI * 4;
		double V = Math.pow(r, 3) * Math.PI * 4.0 / 3;
		System.out.println("Površina lopte je:" + P);
		System.out.println("Zapremina lopte je: " + V);

		input.close();

	}

}
