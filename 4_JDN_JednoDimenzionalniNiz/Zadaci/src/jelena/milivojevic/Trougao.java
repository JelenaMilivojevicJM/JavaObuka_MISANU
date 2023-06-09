package jelena.milivojevic;

import java.io.*;

public class Trougao {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Tri pozitivna broja x, y, z predstavljaju stranice trougla ako zadovoljavaju
		 * uslove:
		 * 
		 * x + y > z i |x - y| < z.
		 * 
		 * Sastaviti algoritam i napisati program kojim se za svaku od n trojki brojeva
		 * (ai, bi, ci, i = 1, ..., n) ispituje da li predstavlja stranice trougla.
		 * Štampati ai, bi, ci i odgovor “da” (ukoliko čine trougao) ili ”ne” (ukoliko
		 * ne čine trougao).
		 */
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podatka n
		System.out.println("Unesite broj trojki stranica n: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos stranica trougla
		System.out.println("Unesite stranice trougla a, b, c: ");
		for (int i = 1; i <= n; i++) {
			System.out.println("Moguće stranice " + i + ". trougla: ");
			System.out.print("a = ");
			a[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("b = ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("c = ");
			c[i] = Double.parseDouble(ulaz.readLine());
		}

		// Štampanje zaglavlja
		System.out.println("\ta\tb\tc\todgovor ");

		// Štampanje rezultata
		for (int i = 1; i <= n; i++) {
			if (a[i] + b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i])
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "da");
			else
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "ne");
		}

	}

}
