package jelena.milivojevic;

import java.util.Scanner;

public class Februar {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje koliko mesec Februar ima dana na osnovu unete
		 * godine.
		 */
		/* Deklarisanje promenljivih */
		int godina;
		Scanner sc = new Scanner(System.in);

		/* Unos podataka */
		System.out.println("Unesite godinu: ");
		godina = sc.nextInt();

		/* Obrada podatka */
		if (godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
			System.out.println("Februar: 29 dana");
		} else {
			System.out.println("Februar: 28 dana");
		}

		sc.close();
	}

}
