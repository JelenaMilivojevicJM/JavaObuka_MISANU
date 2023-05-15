package paket_abs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int unetBr = sc.nextInt();

		ApsolutnaVrednost v = new ApsolutnaVrednost();

		v.setVrednost(unetBr);
		v.getVrednost();

		System.out.println(v.racunajVrednost());
		sc.close();
	}

}
