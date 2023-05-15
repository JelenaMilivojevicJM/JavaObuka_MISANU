package jelena.milivojevic;

import java.util.Scanner;

public class BrojSabiraka {

	public static void main(String[] args) {
		/* Napisati program koji sabira zadati broj sabiraka. */
		// Deklaracija promenljivih
		double a, b, zbir = 0d;

		Scanner ulaz = new Scanner(System.in);

		// 1. Unos podataka
		System.out.println("Unesite prvi broj: ");
		a = ulaz.nextDouble();
		System.out.println("Unesite poslednji broj: ");
		b = ulaz.nextDouble();

		// 2. Obrada podataka primenom for petlje
		for (double i = a; i <= b; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			double j = ulaz.nextDouble();
			zbir += j;
		}
		System.out.println("Zbir ovih brojeva je " + zbir);
		ulaz.close(); // Zatvaranje skenera kako bi se izbeglo "curenje" podataka
	}

}
