package jelena.milivojevic;

import java.util.Scanner;

public class Faktorijel2 {

	public static void main(String[] args) {
		/*
		 * Napisati naredbe kojima se za dato n izračunava faktorijel prirodnog broja n:
		 * fakt = n! = 1*2*3*...*n.
		 */
		// Deklarisanje podataka
		int n;
		int faktorijel = 1;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj za koji izracunavamo faktorijel: ");

		// Unos podataka
		n = ulaz.nextInt();

		// Obrada podataka
		for (int i = 2; i <= n; i++) {
			faktorijel *= i;
		}
		System.out.println("Faktorijel prirodnog broja je " + n + " je " + faktorijel);
		ulaz.close();
	}

}
