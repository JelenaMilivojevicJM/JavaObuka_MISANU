package zadatak10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * TEKST ZADATKA: 10. Napisati program koji omogućuje unos 10 brojeva unutar
		 * niza, traženog broja, a zatim je potrebno ispisati koliko puta se traženi
		 * broj pojavljuje u nizu
		 */

		// ULAZ:
		// Ucitati 10 broja
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 10 broja: ");

		// Deklarisati i inicijalizovati niz
		int niz[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". broj: ");
			niz[i] = sc.nextInt();
		}

		System.out.println("Vaz niz je: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(niz[i] + " ");
		}

		// Ucitati broj za koji zelimo proveriti
		System.out.println("\nUnesite broj za proveru: ");
		int broj = sc.nextInt();

		// Deklaracija i inicijalizacija brojaca
		int brojac = 0;

		// OBRADA: Provera koriscenjem for petlje
		for (int i = 0; i < 10; i++) {
			if (niz[i] == broj) {
				brojac++;
			}
		}

		// IZLAZ: Stampanje rezultata
		System.out.println("Uneti broj " + broj + " pojavljuje se u vasem nizu " + brojac + " puta.");

		sc.close();
	}

}
