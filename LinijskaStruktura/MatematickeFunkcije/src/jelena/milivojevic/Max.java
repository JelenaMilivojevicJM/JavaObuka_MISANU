package jelena.milivojevic;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za unete vrednosti a i b izračunava y prema formuli
		 * y = 5 + max(a*a, b*b).
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		double b = input.nextDouble();

		System.out.println("y = " + (5 + Math.max(a * a, b * b)));

		input.close();
	}

}
