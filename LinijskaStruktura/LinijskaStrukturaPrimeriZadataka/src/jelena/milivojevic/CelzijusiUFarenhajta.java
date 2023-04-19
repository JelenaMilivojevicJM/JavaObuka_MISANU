package jelena.milivojevic;

import java.util.Scanner;

public class CelzijusiUFarenhajta {

	public static void main(String[] args) {
		/*
		 * Napisati program za pretvaranje temperature iz skale Celzijusa u skalu
		 * Farenhajta.
		 */

		/*
		 * Tekstualni algoritam: 1. ulaz: učitati temperaturu u skali Celzijusa tc 2.
		 * obrada: izračunati temperaturu u skali Farenhajta tf = tc * 1.8 + 32 3.
		 * izlaz: ispisati vrednost temperature u skali Farenhajta
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite temperaturu u celzijusima: ");
		double tc = input.nextDouble();
		System.out.println("Temperatura u farenhajtima je: " + (tc * 1.8 + 32));

		input.close();
	}

}
