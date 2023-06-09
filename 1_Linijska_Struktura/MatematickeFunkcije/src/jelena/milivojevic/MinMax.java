package jelena.milivojevic;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za unete vrednosti a i b izračunava y prema
		 * formuli. Na izlazu štampati vrednost.
		 */
		/* Formula: y = + (1 - Math.min(a, b)) / (1 + Math.max(a, b)) */
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.max(a, b)));
		input.close();
	}

}
