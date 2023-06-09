package jelena.milivojevic;

import java.util.Scanner;

public class LogickiIzraz1 {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se izračunava vrednost funkcije prikazane na slici na
		 * osnovu unetih logičkih vrednosti promenljivih x i y. Na izlazu štampati
		 * vrednost funkcije.
		 */

		// Unos: unosenje logickih vrednosti promenjivih x i y
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite true ili false vrednost za x: ");
		boolean x = ulaz.nextBoolean();
		System.out.println("Unesite true ili false vrednost za  y: ");
		boolean y = ulaz.nextBoolean();

		// Obrada: izračunavanje
		boolean z = (!(x && y) || x && y);

		// Izlaz: Stampanje rezultata
		System.out.println("z = " + z);
		ulaz.close();
	}

}
