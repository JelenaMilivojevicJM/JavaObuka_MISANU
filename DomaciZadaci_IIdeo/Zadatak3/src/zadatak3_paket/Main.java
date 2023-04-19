package zadatak3_paket;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		// Ulaz:
		// Ucitavanje vrednosti realnog broja x
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za x : ");
		double x = sc.nextDouble();

		// Obrada:
		// Racunanje vrednosti funkcije y(x)

		double y = 1;

		if (x < 5) {

			y = Math.pow((x - 3), 2);

		} else if (x >= 5 && x < 8) {

			y = x + 2;

		} else {

			y = x - 1;
		}

		// Izlaz:
		// Stampanje vrednosti
		System.out.println("Za uneto x = " + x + ", funckija y(x) = " + df.format(y));

		sc.close();
	}

}
