package jelena.milivojevic;

import java.io.*;

public class ZbirZnacajnihCifara {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati program za izračunavanje zbira značajnih
		 * cifara proizvoljnog trocifrenog broja datog na ulazu. Na izlazu odštampati
		 * traženi zbir.
		 */

		/*
		 * Tekstualni algoritam 1. ulaz: učitati trocifreni broj n 2. obrada: izračunati
		 * cifre stotine, desetice i jedinice i njihov zbir 3. izlaz: ispisati vrednost
		 * zbira cifara trocifrenog broja
		 */
		// n - trocifren broj
		// s - cifra stotice
		// d - cifra desetice
		// j - cifra jedinice
		// zbir - zbir cifara trocifrenog broja
		int n, s, d, j, zbir;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos trocifrenog broja
		System.out.print("Unesite trocifren broj n: ");
		n = Integer.parseInt(ulaz.readLine());
		// Nalaženje cifara trocifrenog broja
		s = n / 100;
		d = (n - s * 100) / 10;
		j = n - s * 100 - d * 10;
		// Izračunavanje zbira cifara trocifrenog broja
		zbir = s + d + j;
		// Štampanje rezultata
		System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir);

	}

}
