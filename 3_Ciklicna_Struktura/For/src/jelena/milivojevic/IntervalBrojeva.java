package jelena.milivojevic;

public class IntervalBrojeva {

	public static void main(String[] args) {
		/*
		 * Napisati niz naredbi kojim se izračunava kvadrata prirodnih brojeva od 15 do
		 * 25
		 */
		// Deklarisanje promenljivih
		int i;

		// Obrada podataka
		for (i = 15; i <= 25; i++) {
			System.out.println("Kvadrat broja " + i + " je " + (int) (Math.pow(i, 2)));
		}

	}

}
