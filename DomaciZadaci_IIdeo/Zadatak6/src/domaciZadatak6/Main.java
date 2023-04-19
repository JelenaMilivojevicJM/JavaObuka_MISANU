package domaciZadatak6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ulaz:
		// Ucitavanje vrednosti za n
		DecimalFormat df = new DecimalFormat("#.###");
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost za n : ");
		double n = sc.nextDouble();
		// Deklaracija i Incijalizacija promeljive p
		double p = 1;

		// Obrada: Izračunavanje vrednosti proizvoda
		for (double i = 2; i <= n; i++) {

			p = p * (1 - (1 / (i + 1)));

		}
		// Izlaz: Stampanje izlaznog rezultata
		System.out.println("Za n = " + n + ", dobijena vrednost proizvoda je " + df.format(p));

		sc.close();
	}

}
