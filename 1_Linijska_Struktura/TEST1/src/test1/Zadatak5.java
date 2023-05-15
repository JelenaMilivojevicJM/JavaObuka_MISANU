package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5 {
	/*
	 * Zadatak 5
	 * 
	 * Trougao je zadat dužinama stranica a, b i c. Napisati program za
	 * izračunavanje:
	 */
	public static void main(String[] args) {
		// Ulaz - ucitati stranice a,b,c
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite stanicu a");
		double a = input.nextDouble();
		System.out.println("Unesite stranicu b ");
		double b = input.nextDouble();
		System.out.println("Unesite stranicu c");
		double c = input.nextDouble();

		// Obrada - racunati
		double s = (a + b + c) / 2;
		double povrsinaP = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		double pokR = (a * b * c) / (4 * povrsinaP);
		double r = (a * b * c) / (2 * pokR * s);

		// Izlaz - prikaz rezultata
		System.out.println("Poluprecnik Opisanog Kruga R iznosi: " + form.format(pokR));
		System.out.println("Poluprecnik Upisanog Kruga r iznosi: " + form.format(r));
		input.close();
	}

}
