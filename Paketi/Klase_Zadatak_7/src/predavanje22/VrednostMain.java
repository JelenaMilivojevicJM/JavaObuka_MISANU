package predavanje22;

import java.util.Scanner;

public class VrednostMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int unetBr = sc.nextInt();

		Vrednost v = new Vrednost();

		v.setVrednost(unetBr);
		v.getVrednost();

		System.out.println(v.racunajVrednost());
		sc.close();
	}

}
