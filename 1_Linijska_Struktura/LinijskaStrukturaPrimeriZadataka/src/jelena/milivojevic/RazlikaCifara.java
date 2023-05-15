package jelena.milivojevic;

import java.util.Scanner;

public class RazlikaCifara {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se unosi dvocifreni broj i izračunava razlika cifara
		 * desetica i jedinica.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati dvocifreni broj a 2. obrada: izračunati
		 * cifru desetice i jedinice i razliku d = a / 10; // izdvajanje cifre desetica
		 * j = a % 10; // izdvajanje cifre jedinica r = d - j 3. izlaz: ispisati r
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite dvocifren broj: ");
		int a = input.nextInt();
		System.out.println("Dvocifren broj: " + a);
		int d, j, r;
		d = a / 10;
		j = a % 10;
		r = d - j;
		System.out.println("Razlika cifara je: " + r);

		input.close();
	}

}
