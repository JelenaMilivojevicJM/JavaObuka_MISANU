package jelena.milivojevic;

import java.util.Scanner;

public class VozackaDozvola {

	public static void main(String[] args) {
		/*
		 * Za unetu kategoriju vozačke dozvole, ispisati kojom vrstom vozila je moguće
		 * upravljati.
		 */
		char n;

		// 1. deo algoritma: Unos podataka
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite kategoriju: ");
		n = sc.nextLine().charAt(0);
		
		// 2. deo algoritma: Obrada podataka
		if (n == 'A' || n == 'a') {
			System.out.println("Mozete voziti Motor.");
		} else if (n == 'B' || n == 'b') {
			System.out.println("Mozete voziti Automobil.");
		} else if (n == 'C' || n == 'c') {
			System.out.println("Mozete voziti Auto i Kamion");
		} else if (n == 'D' || n == 'd') {
			System.out.println("Mozete voziti Autobus, Kamion i Auto.");
		} else if (n == 'E' || n == 'e') {
			System.out.println("Mozete voziti Auto, Kamion i Autobus.");
		} else {
			System.out.println("Neispravan unos!");
		}
		sc.close();

	}

}
