package jelena.milivojevic;

public class BrojUnazad {

	public static void main(String[] args) {
		/* Ispisivanje trocifrenog broja unazad */
		int brojW = 365;
		System.out.println();
		System.out.print("WHILE: ");
		int cifra = 1;
		while (brojW > 0) {
			cifra = brojW % 10;
			brojW = brojW / 10;
			System.out.print(cifra);
			cifra++;
		}

	}

}
