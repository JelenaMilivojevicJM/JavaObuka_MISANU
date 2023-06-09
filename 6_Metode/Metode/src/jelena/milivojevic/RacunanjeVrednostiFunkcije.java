package jelena.milivojevic;

import java.text.DecimalFormat;

public class RacunanjeVrednostiFunkcije {
	// Definisanje funkcija f i g
	static double f(double x) {
		return 2 * x - Math.log(x);
	}

	static double g(double x) {
		return Math.tan(x / 2.) + Math.abs(x);
	}

	public static void main(String[] args) {
		/*
		 * Sastaviti algoritam i napisati program za tabeliranje vrednosti funkcije
		 * 
		 * y = f(2g(f(x))),
		 * 
		 * za x = 0.1(0.1)0.9, ako je
		 * 
		 * f(x) = 2x - ln(x), g(x) = tg(x/2) + |x|;
		 * 
		 * Napomena: Za izračunavanje funkcija f i g koristiti metode.
		 */
		DecimalFormat df = new DecimalFormat("###,##0.00"); // Deklarisanje promenljivih x i y
		double x, y; // Štampanje zaglavlja
		System.out.println("\tX\tY");
		for (x = 0.1; x <= 0.9; x += 0.1) { // Poziv funkcija f i g
			y = f(2 * g(f(x))); // Štampanje izlaznog rezultata
			System.out.println("\t" + df.format(x) + "\t" + df.format(y));
		}

	}

}
