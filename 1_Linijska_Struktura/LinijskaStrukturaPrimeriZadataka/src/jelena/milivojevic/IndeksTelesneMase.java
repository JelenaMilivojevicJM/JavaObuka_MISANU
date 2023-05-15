package jelena.milivojevic;

import java.util.Scanner;

public class IndeksTelesneMase {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za unetu visinu i masu izračunava indeks telesne mase
		 * BMI = m[kg]/(h[m])2
		 */
		// Ulaz:
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite visinu osobe: ");
		double visina = input.nextDouble();
		System.out.print("Unesite masu osobe: ");
		double masa = input.nextDouble();
		// Obrada + Izlaz:
		System.out.println("Indekstelesne mase BMI = " + masa / Math.pow(visina, 2));
		input.close();
	}

}
