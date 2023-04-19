package jelena.milivojevic;

import java.util.Scanner;

public class LogickiIzraz3 {

	public static void main(String[] args) {
		/*
		 * Pravougaonik: Napisati program kojim se logičkoj promenljivoj p dodeljuje
		 * vrednost true, ako se pravougaonik sa stranicama a i b može ceo smestiti u
		 * pravougaonik sa stranicama c i d. Opis rešenja: p = ((a < c) && (b < d)) ||
		 * ((a < d) && (b < c))
		 */
		// Ulaz:
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite stranicu prvog pravougaonika a: ");
		int a = input.nextInt();
		System.out.print("Unesite stranicu prvog pravougaonika b: ");
		int b = input.nextInt();
		System.out.print("Unesite stranicu drugog pravougaonika c: ");
		int c = input.nextInt();
		System.out.print("Unesite stranicu drugog pravougaonika d: ");
		int d = input.nextInt();
		// Obrada:
		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));
		// Izlaz:
		System.out.println("p = " + p);
		input.close();
	}

}
