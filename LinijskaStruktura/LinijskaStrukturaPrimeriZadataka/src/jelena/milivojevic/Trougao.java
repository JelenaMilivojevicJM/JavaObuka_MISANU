package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class Trougao {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Trougao je zadat dužinama stranica a, b i c. Sastaviti algoritam i napisati
		 * program za izračunavanje: poluprečnika opisanog kruga,poluprečnika upisanog
		 * kruga,rastojanja između centra opisanog i upisanog kruga
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati stranice trougla a, b i c 2. obrada:
		 * izračunati poluprečnike opisanog i upisanog kruga i rastojanje između centra
		 * opisanog i upisanog kruga 3. izlaz: ispisati vrednosti poluprečnika opisanog
		 * i upisanog kruga i rastojanja između centra opisanog i upisanog kruga
		 */
		// a, b, c - stranice trougla
		// s - poluobim trougla
		// p - površina trougla
		// R - poluprečnik opisanog kruga
		// r - poluprečnik upisanog kruga
		// d - rastojanje izmedju centra opisanog i upisanog kruga
		double a, b, c, s, p, R, r, d;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka
		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());
		// Izračunavanje vrednosti
		s = (a + b + c) / 2;
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		R = a * b * c / (4 * p);
		r = a * b * c / (2 * R * s);
		d = Math.sqrt(R * (R - 2 * r));
		// Štampanje rezultata
		System.out.println("R = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d));

	}

}
