package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Primer unosa ukupnog broja elemenata niza preko skenera:

		Scanner ulaz = new Scanner(System.in);
		System.out.print("Koliko elemenata zalite da sadrzi niz BROJEVI: ");
		int ukupnoElemenata = ulaz.nextInt();

		// Deklarisanje, definisanje i inicijalizacija niza unetog skenerom:
		int[] brojevi = new int[ukupnoElemenata];

		int zbir = 0;

		// For petlja za unos pojedinacnih elemenata

		for (int i = 0; i < ukupnoElemenata; i++) {

			System.out.print("Unesite " + i + ".element: ");
			int element = ulaz.nextInt();

			// Racunanje zbira (sume svih elemenata)
			zbir += element;

		}

		System.out.println("Ukupan broj elemenata niza BROJEVI je : " + brojevi.length);
		System.out.println("Zbir unetih elemenata je : " + zbir);

		ulaz.close();

	}

}
