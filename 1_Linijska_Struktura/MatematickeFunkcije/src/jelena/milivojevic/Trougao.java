package jelena.milivojevic;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava obim i površina trougla na osnovu unetih
		 * stranica trougla.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati stranice trougla a, b i c 2. obrada:
		 * izračunati obim i površinu trougla O = a + b + c s = (a+b+c)/2 P =
		 * SQRT(s*(s-a)*(s-b)*(s-c)) 3. izlaz: ispisati vrednost obima i površine
		 * trougla
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite stranice trougla a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double O = a + b + c;
		System.out.println("Obim trougla je " + O);
		double s = O / 2;
		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.print("Površina trougla je " + P);

		input.close();
	}

}
