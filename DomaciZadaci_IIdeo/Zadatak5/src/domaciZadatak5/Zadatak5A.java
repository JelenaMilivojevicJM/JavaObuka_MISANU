package domaciZadatak5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5A {

	public static void main(String[] args) {
		// Resenje a) While petlja:
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);

		// Ulaz: Ucitavanje vrednosti za n, a ,eps
		System.out.println("Unesite vrednostza n:");
		double n = sc.nextInt();
		System.out.println("Unesite vrednostza a:");
		double a = sc.nextInt();
		System.out.println("Unesite vrednostza epsilon:");
		double eps = sc.nextDouble();

		// Obrada:
		//Racunanje pocetnih vrednosti x0 i x1
		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		//Racunanje vrednosti x pomocu while petlje
		while (Math.abs(x1 - x0) > eps) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		}

		// Izlaz: Stampanje rezultata
		System.out.println("Za unete vrednosti: n = "+n+", a = "+a+", epsilon = "+eps+", dobijena vrednost x = " + df.format(x1));
		sc.close();

	}

}
