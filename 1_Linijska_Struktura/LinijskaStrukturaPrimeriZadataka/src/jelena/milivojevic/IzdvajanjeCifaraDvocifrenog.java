package jelena.milivojevic;

import java.util.Scanner;

public class IzdvajanjeCifaraDvocifrenog {

	public static void main(String[] args) {
		/*
		 * Napisati program za izdvajanje cifara dvocifrenog broja i ispisivanje unazad.
		 * Opis rešenja: Pri pretvaranju se koristi osobina pozicionog sistema.
		 * Dvocifren broj broj = d * 10 + j * 100 Ostatak deljenja dvocifrenog broja sa
		 * 10 (broj % 10) dobijamo jedinice broja (u ovom slučaju dvocifrenog).
		 * Celobrojnim deljenom sa 10 (broj / 10) dvocifrenog broja se dobija cifra
		 * desetica.
		 */

		/*
		 * Tekstualni algoritam: 1. ulaz: učitati dvocifreni broj a 2. obrada:
		 * izračunati cifru desetice i jedinice d = a / 10; // izdvajanje cifre desetica
		 * j = a % 10; // izdvajanje cifre jedinica 3. izlaz: ispisati a, d, j
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Cifre dvocifrenog broja ");
		System.out.println("Dvocifreni broj ");
		int a = input.nextInt();
		int d, j;
		d = a / 10;
		j = a % 10;
		System.out.println("broj = " + a + " " + "cifra jedinica = " + j + " " + "cifra desetica = " + d);
		input.close();

	}

}
