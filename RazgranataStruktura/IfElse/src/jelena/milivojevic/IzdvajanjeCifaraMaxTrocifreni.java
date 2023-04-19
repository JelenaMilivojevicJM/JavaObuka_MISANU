package jelena.milivojevic;

import java.util.Scanner;

public class IzdvajanjeCifaraMaxTrocifreni {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za uneti trocifreni broj dobija najveći mogući broj
		 * sastavljen od te tri cifre.
		 */
		Scanner input = new Scanner(System.in);
		// Ulaz:
		int broj, j, d, s, rezultat;
		System.out.print("Unesite trocifren broj:");
		broj = input.nextInt();
		// Obrada:
		j = broj % 10;
		d = (broj / 10);
		d = d % 10;
		s = broj / 100;
		if (j > d) {
			int t = j;
			j = d;
			d = t;
		}
		if (j > s) {
			int t = j;
			j = s;
			s = t;
		}
		if (d > s) {
			int t = d;
			d = s;
			s = t;
		}
		rezultat = s * 100 + d * 10 + j;
		// Izlaz:
		System.out.print("Rezultat: " + rezultat);
		input.close();
	}

}
