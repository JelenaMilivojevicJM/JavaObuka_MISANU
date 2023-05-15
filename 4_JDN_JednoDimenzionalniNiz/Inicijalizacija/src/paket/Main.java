package paket;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ukoliko želimo da naknadno dodeljujemo vrednosti elementima niza, niz
		 * inicjalizujemo na sledeci nacin: tipPodatka imeNiza[ ] = new tip [ukupan broj
		 * elemenata];
		 */
		int brojevi[] = new int[5];
		char slova[] = new char[5];
		String ime[] = new String[5];

		/*
		 * Ako je potrebno navesti inicijalne vrednosti samo za neke elemente niza, onda
		 * se dodeljuje vrednost određenim elementima sa konkretnim indexom u nizu.
		 */
		int[] temperatura = { 22, 23, 26, 28, 25, 21, 18, 17 };
		temperatura[0] = 22;
		System.out.println(temperatura[0]); // Izlaz: 22
		temperatura[7] = 18;
		System.out.println(temperatura[7]); // Izlaz: 18

	}

}
