package jelena.milivojevic;

import java.util.Scanner;

public class DeljiviSaX {

	public static void main(String[] args) {
		/* U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3. */
		// Deklarisanje podataka
		int a, b;

		// Unos podataka
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj opsega intervala: ");
		a = ulaz.nextInt();
		System.out.println("Unesite poslednji broj opsega intervala: ");
		b = ulaz.nextInt();
		ulaz.close();

		// Obrada podataka
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
