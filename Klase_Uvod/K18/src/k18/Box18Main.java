package k18;

public class Box18Main {

	public static void main(String[] args) {

		//Parametrizovani konstruktor
		// Prosledili smo vrednosti konstruktoru prilikom kreiranaj objekta
		Box18 b1 = new Box18(10, 15, 20);
		Box18 b2 = new Box18(5, 6, 7);

		System.out.println("Zaprmeina je: " + b1.volume());
		System.out.println("Zaprmeina je: " + b2.volume());
	}

}
