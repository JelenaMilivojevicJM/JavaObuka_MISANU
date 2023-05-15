package jelena.milivojevic;

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se utvrđuje da li je godina prestupna ili nije. Na
		 * primer, 1972. godina je prestupna. Rešenje: Godina je prestupna ako je
		 * deljiva sa 4(svaka četvrta godina je prestupna) i nije deljiva sa 100(svaka
		 * 100 godina nije prestupna) ili je deljiva sa 400 (svaka 400. godina je
		 * prestupna).
		 */
		/* Deklarisanje promenljivih */
		int godina;
		Scanner sc = new Scanner(System.in);

		/* Unos podataka */
		System.out.println("Unesite godinu: ");
		godina = sc.nextInt();

		/* Obrada podatka */
		if (godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
			System.out.println("Uneta godina " + godina + " je prestupna.");
		} else {
			System.out.println("Uneta godina " + godina + " nije prestupna.");
		}

		sc.close();
	}

}
