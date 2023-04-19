package jelena.milivojevic;

import java.util.Scanner;

public class Proizvod {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava vrednost izraza za uneto k. 𝑃 = 𝑘 𝑘 +
		 * 1 … 2𝑘 − 1 2𝑘.
		 */
		Scanner ulaz = new Scanner(System.in);
		int k;
		double p = 1;
		System.out.println("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		int i = k;
		while (i <= (2 * k))
			p *= i++;
		System.out.println("Proizvod je " + p);
		ulaz.close();
	}

}
