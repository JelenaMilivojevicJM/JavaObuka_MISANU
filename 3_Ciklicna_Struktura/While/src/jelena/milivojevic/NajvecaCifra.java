package jelena.milivojevic;

import java.util.Scanner;

public class NajvecaCifra {

	public static void main(String[] args) {
		/*
		 * Napisati program koji učitava pozitivan ceo broj i ispisuje najveću cifru tog
		 * broja.
		 */
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednostza a:");
		int a = ulaz.nextInt();
		int i = a;
		int cifra, max = 0;
		while (a != 0) {
			cifra = a % 10;
			if (cifra > max)
				max = cifra;
			a /= 10;
		}
		System.out.println("Najveća cifra unetog broja " + i + " je " + max);
		ulaz.close();
	}

}
