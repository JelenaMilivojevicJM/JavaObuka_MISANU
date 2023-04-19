package jelena.milivojevic;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/*
		 * Napisati naredbu case kojom se na osnovu brojnih ocena 5, 4, 3, 2, 1 ispisuju
		 * opisne Ocene “odlican”, “vrlo dobar”, “dobar”, “dovoljan”, “nedovoljan”.
		 */
		int ocena;

		// Unos podataka
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite ocenu: ");
		ocena = sc.nextInt();
		sc.close();

		// Obrada podataka
		switch (ocena) {
		case 5:
			System.out.println("Odlican.");
			break;
		case 4:
			System.out.println("Vrlo dobar.");
			break;
		case 3:
			System.out.println("Dobar.");
			break;
		case 2:
			System.out.println("Dovoljan.");
			break;
		case 1:
			System.out.println("Nedovoljan");
			break;
		default:
			System.out.println("Pogresan unos.");

		}
	}

}
