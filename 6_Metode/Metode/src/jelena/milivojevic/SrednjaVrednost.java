package jelena.milivojevic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SrednjaVrednost {
	static void stampajNiz(int n, double niz[]) {
		System.out.println("Uneti elementi niza su: ");
		for (int i = 0; i < n; i++)
			System.out.println(niz[i] + "\t");
	}

	static double srednjaVrednost(int n, double niz[]) {
		double sr = 0;
		for (int i = 0; i < n; i++)
			sr += niz[i];
		return sr / n;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati metodu za štampanje i izračunavanje srednje vrednosti niza od n
		 * elemenata. U glavnom programu odštampati vrednost niza i izračunati srednju
		 * vrednost.
		 */
		double[] niz = new double[10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite dimenziju niza: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = Double.parseDouble(ulaz.readLine());
		}
		stampajNiz(n, niz);
		System.out.println("\nSrednja vrednost niza je " + srednjaVrednost(n, niz));
	}

}
