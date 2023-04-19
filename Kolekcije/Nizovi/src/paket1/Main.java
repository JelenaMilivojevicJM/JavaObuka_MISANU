package paket1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] brojevi = new int[5];

		// Popunjavanje niza
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println("Unesite broj: ");
			brojevi[i] = sc.nextInt();

			// Proveravanje da li je niz napunjen
			if ((i + 1) == brojevi.length) {
				System.out.println("Niz je napunjen!");
			}
		}

		// Stampanje elemenata niza
		System.out.println("Elementi niza su: ");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println(brojevi[i]);
		}
	}

}
