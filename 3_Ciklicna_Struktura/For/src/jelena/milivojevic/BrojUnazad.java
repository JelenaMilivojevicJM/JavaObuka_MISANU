package jelena.milivojevic;

public class BrojUnazad {

	public static void main(String[] args) {
		/* Ispisivanje trocifrenog broja unazad */
		int brojF = 365;
		System.out.println("Broj: " + brojF);
		System.out.println("Broj unazad: ");
		System.out.print("FOR: ");
		for (int i = 3; i > 0; i--) {
			int cifra = brojF % 10;
			brojF = brojF / 10;
			System.out.print(cifra);
		}

	}

}
