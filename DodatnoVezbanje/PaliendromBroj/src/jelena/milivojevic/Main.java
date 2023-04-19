package jelena.milivojevic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi neki broj ");
		int broj = sc.nextInt();

		int pomocna = broj;

		int c = 0;
		int d = 0;

		while (broj != 0) {

			c = broj % 10;
			d = d * 10 + c;
			broj = broj / 10;

		}

		if (pomocna == d)
			System.out.println("Broj je palindrom.");

		else
			System.out.println("Broj nije palindrom.");
		sc.close();

	}
}