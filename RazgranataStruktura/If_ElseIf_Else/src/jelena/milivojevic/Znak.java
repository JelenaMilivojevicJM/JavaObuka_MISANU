package jelena.milivojevic;

import java.util.Scanner;

public class Znak {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se utvrđuje da li je uneti znak malo ili veliko slovo,
		 * cifra ili specijalni znak.
		 */
		Scanner sc = new Scanner(System.in);
		char x;

		/* Unos podataka */
		System.out.println("Unesite x: ");
		x = sc.next().charAt(0);

		/* Obrada podataka */

		if (x >= 'a' && x <= 'z')
			System.out.println("Uneti karakter " + x + " je malo slovo.");
		else if (x >= 'A' && x <= 'Z')
			System.out.println("Uneti karakter " + x + " je veliko slovo.");
		else if (x >= '0' && x <= '9')
			System.out.println("Uneti karakter " + x + " je broj.");

		else
			System.out.println("Uneti karakter " + x + " je specijalni znak.");

		sc.close();
	}

}
