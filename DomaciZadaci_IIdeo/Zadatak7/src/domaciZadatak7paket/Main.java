package domaciZadatak7paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ulaz: Ucitavanje vrednosti za n
		System.out.println("Unesite vrednostza n:");
		int n = sc.nextInt();

		// Deklarisanje i inicijalizacija dva niza
		int a[] = new int[100];
		int b[] = new int[100];

		// Unosenje pocetnog elementa niza a
		System.out.println("Unesite vrednosti za Niz A: ");
		for (int i = 1; i <= 2 * n; i++) {
			System.out.println("Unisite A[" +i+"] ");
			a[i] = sc.nextInt();
		}

		// Obrada:
		for (int i = 1; i <= n; i++) {
			b[i] = (a[i] + a[2 * n + 1 - i]) / 2;

		}

		// Izlaz:
		// Stampanje niza a
		System.out.println("Niz A:");
		for (int i = 1; i <= 2 * n; i++) {
			System.out.println(a[i]);
		}
		// Stampanje niza b
		System.out.println("Niz B:");
		for (int i = 1; i <= n; i++) {
			System.out.println(b[i]);	
		}

		sc.close();
	}

}
