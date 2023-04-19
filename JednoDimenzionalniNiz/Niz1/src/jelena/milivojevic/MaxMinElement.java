package jelena.milivojevic;

import java.io.*;

public class MaxMinElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se određuje maksimalni i minimalni element u
		 * celobrojnom nizu X od N elemenata.
		 * 
		 * Objašnjenje: 1 2 3 4 <- indeksi elemenata niza; x = {3, 6, 2, 8} min = max =
		 * 3 = x[1]; I korak 6 > 3 max = 6; 6 < 3 min = 3; II korak 2 > 6 max = 6; 2 < 3
		 * min = 2; III korak 8 > 6 max = 8; 8 < 2 min = 2.
		 */

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Kreiranje celobrojnog niza x
		int[] x = new int[100];
		// Unos vrednosti promenljive n
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}
		// Određivanje minimalnog i maksimalnog elementa niza
		int min, max;
		min = max = x[1];

		for (int i = 2; i <= n; i++) {
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		// Štampanje rezultata
		System.out.println("Maksimalni element je " + max + "\nMinimalni element je " + min);
	}

}
