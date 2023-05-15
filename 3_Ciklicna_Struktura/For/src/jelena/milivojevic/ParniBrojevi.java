package jelena.milivojevic;

public class ParniBrojevi {

	public static void main(String[] args) {
		/* U intervalu brojeva od 1 .. 100 ispitati sve parne brojeve. */
		// Deklarisanje promenljivih

		// Prvi nacin
		System.out.println("Prvi nacin: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nDrugi nacin: ");
		// Drugi nacin
		for (int i = 2; i <= 100; i += 2) {

			System.out.print(i + " ");

		}
	}

}
