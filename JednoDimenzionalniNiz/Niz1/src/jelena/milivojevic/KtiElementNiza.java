package jelena.milivojevic;

import java.io.*;

public class KtiElementNiza {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se određuju k-ti elementi nizova na osnovu zadatih
		 * vrednosti a[0] i b[0] i ako važi: a[i]= a[i-1]+b[i-1],b[i]=a[i-1]*b[i-1], za
		 * i =1,2,3...
		 */
		int[] a = new int[100];
		int[] b = new int[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za k: ");
		int k = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite vrednost za a[0]: ");
		a[0] = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za b[0]: ");
		b[0] = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= k; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1] * b[i - 1];
		}

		System.out.println("a[" + k + "] = " + a[k] + "\t b[" + k + "] = " + b[k]);
	}

}
