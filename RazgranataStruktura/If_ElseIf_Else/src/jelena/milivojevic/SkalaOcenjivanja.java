package jelena.milivojevic;

import java.util.Scanner;

public class SkalaOcenjivanja {

	public static void main(String[] args) {
		/*
		 * Napisati program koji predstavlja skalu ocenjivanja. od 0 do 49 - je ocena 1
		 * ; od 50 do 60 - je ocena 2; od 61 do 69 - je ocena 3; od 70 do 80 - je ocena
		 * 4 ; preko 81 je ocena 5.
		 */
		int bodovi;
		Scanner sc = new Scanner(System.in);

		/* Unos podataka */
		System.out.println("Unesite ocenu: ");
		bodovi = sc.nextInt();

		// Obrada i štampanje izlaznog rezultata
		if (bodovi < 0) {
			System.out.println("Nepravilan unos.");
		} else if (bodovi >= 0 && bodovi < 50) {
			System.out.println("Ocena je 1");
		} else if (bodovi >= 50 && bodovi < 60) {
			System.out.println("Ocena je 2");
		} else if (bodovi >= 61 && bodovi < 70) {
			System.out.println("Ocena je 3");
		} else if (bodovi >= 71 && bodovi < 80) {
			System.out.println("Ocena je 4");
		} else if (bodovi >= 81 && bodovi <= 100) {
			System.out.println("Ocena je 5");
		} else {
			System.out.println("Ne moze se osvojiti preko 100 bodova!");
		}
		sc.close();
	}

}
