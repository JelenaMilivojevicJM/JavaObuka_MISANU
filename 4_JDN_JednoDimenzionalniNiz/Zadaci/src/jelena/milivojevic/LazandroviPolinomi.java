package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class LazandroviPolinomi {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program za izračunavanje i štampanje vrednosti prvih 10 Lažandrovih
		 * polinoma korišćenjem rekurentnih formula, za učitanu vrednost promenljive x.
		 * Štampati redni broj polinoma i njegovu vrednos
		 */
		double[] lazandrovPolinom = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Unesite vrednost za x: ");
		double x = Double.parseDouble(ulaz.readLine());

		lazandrovPolinom[0] = 1;
		lazandrovPolinom[1] = x;

		for (int n = 1; n <= 9; n++)
			lazandrovPolinom[n + 1] = (2 * n + 1) * lazandrovPolinom[n] / (n + 1)
					- n * lazandrovPolinom[n - 1] / (n + 1);

		for (int n = 0; n <= 9; n++)
			System.out.println("L(" + n + ") = " + df.format(lazandrovPolinom[n]));
	}

}
