package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class LageroviPolinomi {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se izračunavaju i štampaju vrednosti prvih 10
		 * Lagerovih polinoma korišćenjem rekurentnih formula.Za učitanu vrednost promenljive x Štampati redni broj
		 * polinoma i njegovu vrednost
		 */
		double[] lagerovPolinom = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Unesite vrednost za x: ");
		double x = Double.parseDouble(ulaz.readLine());

		lagerovPolinom[0] = 1;
		lagerovPolinom[1] = 1 - x;

		for (int n = 1; n <= 9; n++)
			lagerovPolinom[n + 1] = (2 * n - 1 - x) * lagerovPolinom[n] - n * n * lagerovPolinom[n - 1];

		for (int n = 0; n <= 9; n++)
			System.out.println("L(" + n + ") = " + df.format(lagerovPolinom[n]));
	}

}
