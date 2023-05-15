package jelena.milivojevic;

import java.util.Scanner;

public class DeljenjeNulom {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za unete vrednosti a i b izračunava z prema izrazu:
		 * a/b, ako je b>0; "Deljenje nulom", ako je b==0;
		 */
		Scanner input = new Scanner(System.in);
		// Ulaz
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		// Obrada
		if (b != 0)
			// Izlaz:
			System.out.println(a / b);
		else
			// Izlaz:
			System.out.println("Deljenje nulom");
		input.close();
	}

}
