package jelena.milivojevic;

import java.io.*;

public class MathFunkcije {

	public static void main(String[] args) throws Exception {
		/*
		 * Sastaviti algoritam i napisati program kojim se izračunava vrednost funkcije
		 * 'f' na osnovu unetih vrednosti x, y, z. Na izlazu štampati vrednost funkcije.
		 */
		double x, y, z, f;
		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za z: ");
		z = Double.parseDouble(ulaz.readLine());
		// Izračunavanje vrednosti funkcije f
		f = Math.pow((x + 3 * z + y) / 2 * x, 4) - x / (x + 3 * z - y);
		// Štampanje rezultata
		System.out.println("Vrednost funkcije f je " + f);
	}

}
