package domaciZadatak10paket;

import java.text.DecimalFormat;

public class Main {

	//Kreiranje metode za racunanje vrednosti funkcije
	public static double funkcija(double x, double y) {
		// Obrada u sporednoj metodi:
		double f;
		if (x < y)
			f = Math.exp(x) + Math.cos(3 * y);
		else if (x == y)
			f = Math.sin(x);
		else
			f = 1 + Math.sqrt(Math.abs(x * y));
		return f;
	}

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");

		// Obrada u glavnoj metodi:
		// Stampanje zaglavlja
		System.out.println("\tX\tY\tF(X, Y)");

		// Pozivanje metode  
		for (double x = 0.1; x <= 0.5; x += 0.1) {
			for (double y = 0.01; y <= 0.03; y += 0.01) {
				//Izlaz: Stampanje rezultata funkcije
				System.out.println("\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(funkcija(x, y)));
			}
		}
	}

}
