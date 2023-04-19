package jelena.milivojevic;

import java.io.*;

public class RealniKorenJednacine {
	public static void korenJednacine(double x0, double eps) {
		int i = 0;

		// Štampanje zaglavlja
		System.out.println("I         X(I)           F(X(I))");
		System.out.println("------------------------------------");

		double x1 = Math.cos(x0) - 0.15;

		System.out.println(i + "\t" + x0 + "\t" + x1);

		while (Math.abs(x1 - x0) > eps) {
			i++;
			x0 = x1;
			x1 = Math.cos(x0) - 0.15;

			// Štampanje rezultata
			System.out.println(i + "\t" + x0 + "\t" + x1);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati metodu za izračunavanje realnog korena jednačine f(x) = x - cosx +
		 * 0,15 = 0, sa greškom e <= 10-5 upotrebom iterativne formule x0 = 0.65, xi+1 =
		 * cosxi - 0,15, (i = 0,1...).
		 */
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za x0: ");
		double x0 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za eps: ");
		double eps = Double.parseDouble(ulaz.readLine());

		korenJednacine(x0, eps);
	}

}
