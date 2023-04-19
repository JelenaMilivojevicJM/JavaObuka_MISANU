package paket1_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Pogadjanje pozicije elemnata matrice

		// Pocetna matrica - za prikaz korisniku na pocetku
		char m1[][] = { { '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };

		// Pocetno stampanje za prikaz korisniku:
		System.out.println("Matrica 5X5:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		// Nase resenje!
		char m2[][] = { { '0', '0', '0', '0', '0' }, { '0', 'x', '0', '0', '0' }, { '0', '0', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };

		// Nas unapred postavljen broj reda i broj kolone u kojima se nalazi x
		int r = 2;
		int k = 2;

		// Ucitavanje korisnikovog odgovora iz konzole
		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko pokusaja zelite:");
		int pokusaj = sc.nextInt();

		int brojac = 0;
		for (int n = 0; n < pokusaj; n++) {
			brojac++;
			int red;
			int kolona;
			do {
				System.out.println("Pokusajte da pogodite gde se nalazi broj x:");
				System.out.println("Broj reda:");
				red = sc.nextInt();
				System.out.println("Broj kolone:");
				kolona = sc.nextInt();

				if (r == red && k == kolona) {
					System.out.println("Pogodili ste! Nalazi se u drugom redu u drugoj koloni!");
					System.out.println("Pogodili ste iz " + brojac + " pokusaja");
					System.out.println("Resenje:");
					for (int i = 0; i < m2.length; i++) {
						for (int j = 0; j < m2.length; j++) {
							System.out.print(m2[i][j] + " ");
						}
						System.out.println();
					}
				} else {
					System.out.println("Izgubili ste! Nalazi se u drugom redu u drugoj koloni!");

					char m3[][] = new char[5][5];

					for (int i = 0; i < m3.length; i++) {

						for (int j = 0; j < m3.length; j++) {

							if (red == (i + 1) && kolona == (j + 1)) {

								m3[i][j] = 'x';

							} else {
								m3[i][j] = '0';
							}

						}
						System.out.println();
					}

					System.out.println("Vase Resenje  je :");

					for (int i = 0; i < m3.length; i++) {
						for (int j = 0; j < m3.length; j++) {
							System.out.print(m3[i][j] + " ");
						}
						System.out.println();
					}
					System.out.println("Ispravno Resenje  je :");
					for (int i = 0; i < m2.length; i++) {
						for (int j = 0; j < m2.length; j++) {
							System.out.print(m2[i][j] + " ");
						}
						System.out.println();
					}
				}
			} while (!(r == red && k == kolona));
		}
		sc.close();

	}
}
