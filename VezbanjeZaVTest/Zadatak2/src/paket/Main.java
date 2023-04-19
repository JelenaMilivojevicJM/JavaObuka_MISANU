package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo n broj: ");
		int n = sc.nextInt();

		int broj[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite  broj: ");
			broj[i] = sc.nextInt();
		}

		int negativni = 0;
		int sumaNegativnih = 0;
		for (int i = 0; i < n; i++) {
			if (broj[i] % 2 != 0 && broj[i] < 0) {
				negativni++;
				sumaNegativnih += broj[i];
			}
		}
		System.out.println("Ukupno negativnih i neparnih brojeva: " + negativni);
		System.out.println("Suma : " + sumaNegativnih);

		sc.close();
	}

}
