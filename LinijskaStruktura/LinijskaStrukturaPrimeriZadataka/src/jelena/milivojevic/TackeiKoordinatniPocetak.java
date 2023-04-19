package jelena.milivojevic;

import java.util.Scanner;

public class TackeiKoordinatniPocetak {

	public static void main(String[] args) {
		/*
		 * Učitati koordinate dve tačke M1(x1,y1) i M2(x2, y2) i izračunati pojedinačnu
		 * udaljenost tačaka od koordinatnog početka. Opis rešenja: Udaljenost tačke od
		 * koordinatnog početka je po Pitagori kvadratni koren sume kvadrata veličina
		 * kateta. Za tačku M1(x1, y1) udaljenost od koordinatnog početka je hipotenuza
		 * a12 = x12 + y12 odnosno kvadratni koren iz sume kvadrata. Na isti način se
		 * računa i udaljenost tačke M2(x2, y2), hipotenuza a22 = x22 + y22 odnosno
		 * kvadratni koren iz sume kvadrata kateta.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati koordinate tačaka x1, y1, x2, y2 2.
		 * obrada: izračunati a1 i a2; 3. izlaz: ispisati vrednosti a1 i a2
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koordinate prve tačke: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double a1 = Math.sqrt(x1 * x1 + y1 * y1);
		System.out.println("Unesite koordinate druge tačke: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double a2 = Math.sqrt(x2 * x2 + y2 * y2);
		System.out.println("Rastojanje prve tačke (" + x1 + "," + y1 + ") od koordinatnog početka je " + a1);
		System.out.println("Rastojanje druge tačke (" + x2 + "," + y2 + ") od koordinatnog početka je " + a2);

		input.close();

	}

}
