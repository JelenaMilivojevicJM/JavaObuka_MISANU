package jelena.milivojevic;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava vrednost sume S = 2 / k + 2 / (k+1) + 2
		 * / (k+2) + ... + 2 / (k + n)
		 */
		Scanner ulaz = new Scanner(System.in);
		int n, k;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		int i = 0;
		do {
			s = s + 2 / (double) (k + i);
			++i;
		} while (i <= n);
		System.out.println("(do-while) Suma je " + s);
		ulaz.close();
	}

}
