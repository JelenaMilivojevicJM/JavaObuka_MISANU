package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo n broj: ");
		int n = sc.nextInt();

		//int cifra = n % 10;
		int d = (n / 10) % 10;
		while (n > 0)
			if (n % 10 == 5) {
				System.out.println("Sadrzi");
			} else {
				System.out.println("Ne sadrzi");
			}
		sc.close();
	}

}
