package paket_k4;

public class Main {
	public static void main(String[] args) {
		// Inicijalizacija Objekta koristeci difolntni kontruktor
		Box b1 = new Box();
		Box b2 = new Box();

		System.out.println("Zaprmeina je: " + b1.volume());
		System.out.println("Zaprmeina je: " + b2.volume());
	}
}
