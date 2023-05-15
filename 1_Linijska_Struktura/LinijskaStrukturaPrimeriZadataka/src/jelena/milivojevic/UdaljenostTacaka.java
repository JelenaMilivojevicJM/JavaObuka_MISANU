package jelena.milivojevic;

import java.util.Scanner;

public class UdaljenostTacaka {

	public static void main(String[] args) {
		/*
		 * Učitati koordinate dve tačke M1(x1,y1) i M2(x2, y2) i izračunati njihovu
		 * međusobnu udaljenost. Opis rešenja: Posmatra se trougao koji formiraju tačke
		 * M1(x1,y1), hipotenuza je duž između ovih tačaka. Katete su Δx = x2- x1, druga
		 * kateta trougla je Δy = y2- y1. Na osnovu Pitagorine teoreme hipotenuza se
		 * računa: hipotenuza d2 = (x2- x1)2 + (y2- y1)2 odnosno kvadratni koren iz sume
		 * kvadrata.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati koordinate tačaka x1, y1, x2, y2 2.
		 * obrada: izračunati rastojanje d 3. izlaz: ispisati vrednost rastojanja d
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koordinate tačke M: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Unesite koordinate tačke N: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("Rastojanje između tačaka M (" + x1 + "," + y1 + ") i N (" + x2 + "," + y2 + ") je " + d);

		input.close();

	}

}
