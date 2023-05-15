package jelena.milivojevic;

import java.util.Scanner;

public class Oblasti {

	public static void main(String[] args) {
		/*
		 * Dato je N ≤ 100 tačaka u ravni koordinatama (x, y). Za svaku tačku ispitati
		 * da li pripada nekoj od oblasti 1, 2 ili 3. Na izlazu štampati redni broj
		 * tačke, njene koordinate i oznaku oblasti kojoj pripada (* ako ne pripada ni
		 * jednoj od zadatih oblasti). Jednačine kružnica su: K1 : (x-1)*(x-1)- y*y=1; i
		 * K2 : (x-2)*(x-2)- y*y=1;
		 */
		Scanner ulaz = new Scanner(System.in);

		double x[] = new double[100];
		double y[] = new double[100];
		char oblast[] = new char[100];

		System.out.println("Unesite broj tačaka n: ");
		int n = ulaz.nextInt();

		System.out.println("Unesite koordinate tačaka x i y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextDouble();
			System.out.print("y[" + i + "] = ");
			y[i] = ulaz.nextDouble();

			boolean k1 = Math.pow(x[i] - 1, 2) + Math.pow(y[i], 2) <= 1;
			boolean k2 = Math.pow(x[i] - 2, 2) + Math.pow(y[i], 2) <= 1;

			if (k1 && !k2)
				oblast[i] = '1';
			else if (k1 && k2)
				oblast[i] = '2';
			else if (!k1 && k2)
				oblast[i] = '3';
			else
				oblast[i] = '*';
		}

		System.out.println("R. BR.\tX\tY\tOBLAST");
		for (int i = 1; i <= n; i++)
			System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + oblast[i]);

		ulaz.close();
	}

}
