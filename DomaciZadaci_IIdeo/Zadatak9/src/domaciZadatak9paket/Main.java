package domaciZadatak9paket;

import java.util.Scanner;

public class Main {

	static double funkcija(int n, int f0, int g0) {
		int nn = n;
		double f = f0;
		double g = g0;
			for (int i = 1; i <= nn; i++) {
				for (int j = 1; j <= nn; j++) {
					g = Math.pow(j, 2) * i + 2 * g;
				}
				f = i * g + 3 * (i - 1);
			}
			return f;
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ulaz: Ucitavanje vrednosti za n,f(0),g(0)
		System.out.println("Unesite vrednostza n:");
		int n = sc.nextInt();
		System.out.println("Unesite vrednostza f(0):");
		int f0 = sc.nextInt();
		System.out.println("Unesite vrednostza g(0):");
		int g0 = sc.nextInt();

		// Obrada:
		// Pozivanje funkcije F(n)
		funkcija(n, f0, g0);

		// Izlaz:
		// Stampanje rezultata:
		System.out.println("F(n) = " + funkcija(n, f0, g0));
		sc.close();
	}

}
