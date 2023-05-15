package jelena.milivojevic;

import java.util.Scanner;

public class SabiranjeiliMnozenje {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za unete vrednosti a i b izračunava z prema izrazu:
		 * a+b, ako je a parno, b neparno; a * b, za sve ostale slucajeve.
		 */
		Scanner input = new Scanner(System.in);
		// Ulaz
		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		int z;
		// Obrada
		if ((a % 2 != 0) && (b % 2 == 0))
			z = a + b;
		else
			z = a * b;
		// Izlaz:
		System.out.println("z = " + z);
		input.close();

	}

}
