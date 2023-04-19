package zadatak8;

import java.util.Scanner;

public class Main {

	//Rekurzivna metoda za racunanje sume cifara nekog broja:
	public static int racunajS(int br) {
		
		if (br < 10) {
			return br;
		}
		return br % 10 + racunajS(br / 10);
	}

	public static void main(String[] args) {
		/*
		 * TEKST ZADATKA: 8. Koristeći rekurzivan postupak izračunati sumu svih cifara
		 * unetog broja.
		 */

		// ULAZ:
		// Ucitavanje broja
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();

		// OBRADA:
		// Pozivanje rekurzivne metode
		int rezultat = racunajS(broj);

		// IZLAZ:
		// Ispis rezultata
		System.out.println("Rezultat: " + rezultat);
	
		sc.close();
	}

}
