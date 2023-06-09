package jelena.milivojevic;

import java.util.Scanner;

public class SekundeUMinuteISate {

	public static void main(String[] args) {
		/*
		 * Putovanje traje n sekundi. Napisati program za izračunavanje koliko je to
		 * sati, minuta i sekundi.
		 */

		/*
		 * Opis prvog rešenja: Sat ima 3600 sekundi. Deljenjem vremena u sekundama sa
		 * 3600 dobijamo sate sat = n / 3600. Ostatak sekundi (sek1) se deli sa 60 i
		 * dobijamo minute, a ostatak deljenja sek1 sa 60 su sekunde.
		 */

		/*
		 * Opis drugog rešenja: Odnos sati, minuta i sekundi je 1 h = 60 min; 1 min = 60
		 * s. Posle učitavanja vrednosti u sekundama izvodi se: I varijanta -
		 * izračunavanje pretvaranje h = n / 3600; broj sati je ceo deo deljenja
		 * vrednosti sekundi sa 3600 ostatak u sekundama je n1 = n % 3600, od ukupnog
		 * broja sekundi za minute se uzima samo ceo deo deljenja sa 60 tj. m = n % 3600
		 * / 60; sekunde su od ukupnog broja sekundi ostatak deljenja sa 60 tj. s = n %
		 * 60;
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati broj sekundi n 2. obrada: izračunati
		 * sate, minute i sekunde h = n / 3600 // pretvaranje sekundi u sate m = n %
		 * 3600 / 60; // pretvaranje u minute s = n % 60; // ostatak deljenja – sekunde
		 * 3. izlaz: ispisati sate, minute i sekunde
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Proteklo sekundi: ");
		int n = input.nextInt();
		int sat = n / 3600;
		int sek1 = n % 3600;
		int min = sek1 / 60;
		int sek = sek1 % 60;
		System.out.println("proteklo sati: " + sat);
		System.out.println("minuta: " + min);
		System.out.println("sekundi: " + sek);

		input.close();
	}

}
