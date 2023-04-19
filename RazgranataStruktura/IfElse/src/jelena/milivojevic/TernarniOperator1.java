package jelena.milivojevic;

import java.io.*;

public class TernarniOperator1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati program za izračunavanje vrednosti funkcije sa
		 * argumentima q, r i s za izraz: y(q,r,s)= min(q,max(r,s));
		 */
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka
		System.out.print("Unesite vrednost za q: ");
		int q = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za r: ");
		int r = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za s: ");
		int s = Integer.parseInt(ulaz.readLine());
		// Izračunavanje vrednosti funkcije
		int y = (r > s) ? r : s;
		if (q < y)
			y = q;
		// Štampanje rezultata
		System.out.println("Vrednost funkcije y je " + y);

	}

}
