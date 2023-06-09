package jelena.milivojevic;

import java.util.Scanner;

public class LogickiIzraz2 {

	public static void main(String[] args) {
		/*
		 * Trougao: Napisati program kojim se logičkoj promenljivoj p dodeljuje vrednost
		 * true, ako se od odsečaka sa dužinama x, y, z može konstruisati trougao. Opis
		 * rešenja: p = (x + y > z) && (x + z > y) && (y + z > x)
		 */

		// Ulaz:
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite stranicu trougla x: ");
		int x = input.nextInt();
		System.out.print("Unesite stranicu trougla y: ");
		int y = input.nextInt();
		System.out.print("Unesite stranicu trougla z: ");
		int z = input.nextInt();
		// Obrada:
		boolean p = (x + y > z) && (x + z > y) && (y + z > x);
		// Izlaz:
		System.out.println("p = " + p);
		input.close();
	}

}
