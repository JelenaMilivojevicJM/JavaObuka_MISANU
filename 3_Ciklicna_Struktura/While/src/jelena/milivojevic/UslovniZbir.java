package jelena.milivojevic;

import java.util.Scanner;

public class UslovniZbir {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se učitavaju brojevi dok se ne učita broj 5. Naći zbir
		 * učitanih brojeva koji su deljivi sa 2 ili 7.
		 */
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		int suma = 0;
		while (a != 5) {
			if (a % 2 == 0 || a % 7 == 0)
				suma += a;
			System.out.println("Unesite vrednost za a:");
			a = ulaz.nextInt();
		}
		System.out.println("Zbir učitanih brojeva koji su deljivi sa 2 ili 7 je " + suma);
		ulaz.close();
	}

}
