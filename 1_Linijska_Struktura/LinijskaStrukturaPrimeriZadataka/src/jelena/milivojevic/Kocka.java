package jelena.milivojevic;

import java.io.*;

public class Kocka {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati program kojim se na osnovu unete stranice
		 * kocke a izračunava površina i zapremina. Na izlazu štampati površinu i
		 * zapreminu kocke.
		 */
		/*
		 * Tekstualni algoritam 1. ulaz: učitati stranicu kocke a; 2. obrada: izračunati
		 * površinu i zapreminu kocke P = 6 * a * a V = a * a* a; 3. izlaz: ispisati
		 * vrednosti površine i zapremine.
		 */
		// a - stranica kocke
		// p - površina kocke
		// v - zapremina kocke
		double a, p, v;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos stranice kocke
		System.out.print("Unesite stranicu kocke a: ");
		a = Double.parseDouble(ulaz.readLine());
		// Izračunavanje površine i zapremine kocke
		p = 6 * a * a;
		v = Math.pow(a, 3);
		// Štampanje vrednosti površine i zapremine kocke
		System.out.println("Za unetu stranicu kocke a = " + a + " izračunata površina je " + p + " a zapremina " + v);
	}

}
