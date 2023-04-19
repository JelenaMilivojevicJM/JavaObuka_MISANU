package jelena.milivojevic;

import java.util.Scanner;

public class RacunatiY {

	public static void main(String[] args) {
		double x, y;

		// Unos podataka
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za x: ");

		x = ulaz.nextDouble();

		// Obrada podataka

		if (x < 0) {
			y = 5;

		} else if (x >= 0 && x < 1) {
			y = x + 2;
		} else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
		} else {
			y = 2 * x;
		}

		// Štampanje rezultata
		System.out.println("Za uneto x = " + x + " vrednost funkcije y iznosi: " + y);

		ulaz.close();
	}

}
