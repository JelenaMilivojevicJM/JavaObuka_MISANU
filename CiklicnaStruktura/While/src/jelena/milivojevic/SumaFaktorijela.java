package jelena.milivojevic;

import java.util.Scanner;

public class SumaFaktorijela {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se za uneto n izračunava vrednost sume faktorijela
		 * parnih brojeva do n , 𝑆 = 2! + 4! + 6!+. . . +𝑛!.
		 */
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		int p = 1, s = 0;
		int i = 1;
		while (i <= n) {
			p *= i;
			if (i % 2 == 0)
				s += p;
			i++;
		}
		System.out.println("Suma s = " + s);
		ulaz.close();
	}

}
