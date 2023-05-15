package paket_k5;

public class Main {
	public static void main(String[] args) {

		//Parametrizovani konstruktor
		// Prosledili smo vrednosti konstruktoru prilikom kreiranaj objekta
		Box b1 = new Box(10, 15, 20);
		Box b2 = new Box(5, 6, 7);

		System.out.println("Zaprmeina je: " + b1.volume());
		System.out.println("Zaprmeina je: " + b2.volume());
	}
}
