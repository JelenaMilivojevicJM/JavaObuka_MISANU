package paket1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj sati: ");
		int sati = sc.nextInt();
		System.out.println("Unesite broj minuta : ");
		int minuta = sc.nextInt();

		if (sati >= 9 && sati <= 16) {
			if (minuta >= 0 && minuta <= 59) {
				System.out.println("U toku radnog vremena");
			}
		} else {
			System.out.println("Van radnog vremena");
		}

		sc.close();
	}

}
