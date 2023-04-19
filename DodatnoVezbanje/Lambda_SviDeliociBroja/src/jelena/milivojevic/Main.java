package jelena.milivojevic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		SviDelioci delioci = (n) -> {

			System.out.println("Delioci broja " + n + " su:");

			for (int i = 0; i < n; i++) {

				if (n % i == 0) {
					System.out.println(i);

				}
			}
		};

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		double br = sc.nextDouble();

		delioci.svi(br);
		sc.close();
	}
}
