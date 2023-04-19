package domaciZadatak4;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");
		// Ulaz:
		// Ucitavanje vrednosti promenljivih x,a,y
		double x = 1;
		double a = 0.1;
		double y = 0.5;
		double z = 1;

		// Obrada:
		// Štampanje zaglavlja
		System.out.println("\tR.BR.\tx\ta\ty\tz");
		// Racunanje vrednosti za x
		
		for (double i = 1; i <= 4; i++) {
			x = i;
			// Racunanje vrednosti za a
			for (double j = 0.1; j <= 0.5; j += 0.1) {
				a = j;
				// Racunanje vrednosti za y
				for (double t = 0.5; t <= 0.2; t -= 0.05) {
					y = t;
				}
			}
			// Racunanje vrednosti za z
		z = (Math.pow((x + a + y) / (x - y), 2)) - (x / (x + a));
			// Izlaz:
			// Stampanje rezultata:
System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t" + df.format(z));

		}

	}

}
