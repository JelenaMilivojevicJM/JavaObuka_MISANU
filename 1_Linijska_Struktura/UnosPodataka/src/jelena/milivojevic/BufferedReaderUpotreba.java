package jelena.milivojevic;

import java.io.*;

public class BufferedReaderUpotreba {

	public static void main(String[] args) throws Exception {
		/*
		 * Napisati program primenom klase BufferedReader koji traži da se unese željena
		 * cifra koja će nakon unosa biti ispisana na ekranu.
		 */

		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Ispis poruke korisniku za unos:
		System.out.print("Unesite brojcanu vrednost za X: ");
		double x = Double.parseDouble(ulaz.readLine());
		// Izlaz:
		System.out.print("X je: " + x);
	}

}
