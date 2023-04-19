package jelena.milivojevic;

import java.io.*;

public class MaxElementIndeks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se određuje maksimalni element i njegov redni broj u
		 * celobrojnom vektoru X od N elemenata.
		 */
		int[] x = new int[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj elemenata n niza x:");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}

		int imax = 1, max = x[1];
		for (int i = 2; i <= n; i++)
			if (x[i] > max) {
				imax = i;
				max = x[i];
			}
		System.out.println("Indeks maksimalnog elementa ( " + max + " ) je " + imax);

	}

}
