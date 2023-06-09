package jelena.milivojevic;

import java.io.*;

public class InciUCentimetre {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati program za prevođenje dužine zadate u inčima u
		 * centimetre, ako važi relacija 1 inč = 2.54 cm. Na izlazu štampati koliko
		 * iznosi u centimetrima dijagonala televizora od 26 inča.
		 */
		/*
		 * Tekstualni algoritam 1. ulaz: učitati dužinu zadatu u inčima n 2. obrada:
		 * izračunati dužinu u centimetrima d = n * 2.54 3. izlaz: ispisati vrednost
		 * dužine u centimetrima
		 */
		// n - dijagonala ekrana izražena u inčima
		double n;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos dijagonale ekrana izražene u inčima
		System.out.print("Unesite dijagonalu ekrana u inčima: ");
		n = Double.parseDouble(ulaz.readLine());
		// Štampanje rezultata
		System.out.println("Dijagonala ekrana izražena u centimetrima " + n * 2.54);

	}

}
