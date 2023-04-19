package jelena.milivojevic;

import java.util.Scanner;

public class ParanNeparan {

	public static void main(String[] args) {
		/* Ispisati program koji proverava da li je uneti broj paran. */
		// Ulaz
		int broj;

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		broj = sc1.nextInt();

		// Obrada + Izlaz:
		/* Razgranata struktura */
		if (broj == 0) {
			System.out.println("Uneli ste 0.");
		} else if (broj % 2 == 0)
			System.out.println("Broj je paran.");
		else
			System.out.println("Broj nije paran.");
		sc1.close();
	}

}
