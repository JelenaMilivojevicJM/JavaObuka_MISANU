package jelena.milivojevic;

public class BrojUnazad {

	public static void main(String[] args) {
		/* Ispisivanje trocifrenog broja unazad */
		int broj = 365;
		System.out.println("Broj: " + broj);

		System.out.print("Broj unazad: ");
		int cifra = 1;
		// Do While petlja
		do {
			cifra = broj % 10;
			broj = broj / 10;
			System.out.print(cifra);
			cifra++;
		} while (broj > 0);

	}

}
