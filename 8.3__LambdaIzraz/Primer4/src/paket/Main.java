package paket;

public class Main {
	/* Napisati Lambda izraz koji racuna proizvod dva broja. */

	public static void main(String[] args) {
		Proizvod p = (n, m) -> n * m;

		System.out.println("P = " + p.racujajProizvod(5, 2));
	}

}
