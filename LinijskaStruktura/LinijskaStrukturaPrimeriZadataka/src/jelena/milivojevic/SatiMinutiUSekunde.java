package jelena.milivojevic;

import java.util.Scanner;

public class SatiMinutiUSekunde {

	public static void main(String[] args) {
		/*
		 * Napisati program koji vreme učitano u satima, minutima i sekundama izračunava
		 * i pretvara u sekundama.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati sate, minute i sekunde 2. obrada:
		 * izračunati vreme u sekundama vreme = 3600 * s + 60 * m + s 3. izlaz: ispisati
		 * vrednost vremena u sekundama
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite sate: ");
		int s = input.nextInt();
		System.out.print("Unesite minute: ");
		int m = input.nextInt();
		System.out.print("Unesite sekunde: ");
		int sec = input.nextInt();
		System.out.print("Vreme izraženo u sekundama je: " + (s * 3600 + m * 60 + sec));

		input.close();
	}

}
