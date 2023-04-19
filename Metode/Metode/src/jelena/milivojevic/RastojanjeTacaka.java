package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class RastojanjeTacaka {
	// Definisanje funkcije rastojanje
	static double rastojanje(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Rastojanje između dve tačke u ravni određeno je relacijom d = Math.sqrt(x1 -
		 * x2)2 + (y1 - y2)2 gde su (x1, y1) i (x2, y2) koordinate prve i druge tačke,
		 * respektivno. Koristeći ovu formulu sastaviti algoritam i napisati program
		 * kojim se izračunava rastojanje od koordinatnog početka svake od N tačaka čije
		 * se koordinate redom učitavaju. Relaciju kojom se određuje rastojanje između
		 * dve tačke u ravni definisati metodom.
		 */
		double[] x = new double[100];
		double[] y = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");

		// Unos broja tačaka
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos koordinata tačke
		System.out.println("Unesite vrednosti koordinata tačke: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". tačka ");
			System.out.print("x = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y = ");
			y[i] = Double.parseDouble(ulaz.readLine());
		} // Štampanje zaglavlja
		System.out.println("\tR.BR.\tX\tY\tRastojanje");

		// Štampanje rezultata
		for (int i = 1; i <= n; i++)
			System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(y[i]) + "\t"
					+ df.format(rastojanje(0, 0, x[i], y[i])));
	}

}
