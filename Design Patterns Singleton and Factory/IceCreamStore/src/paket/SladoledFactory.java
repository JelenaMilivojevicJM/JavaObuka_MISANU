package paket;

public class SladoledFactory {
	// Statička metoda koja prima tip sladoleda kao argument i vraća odgovarajući
	// objekat sladoleda
	public static Sladoled napraviSladoled(String tip) {
		if (tip.equals("Čokolada")) {
			return new Cokolada();
		} else if (tip.equals("Vanila")) {
			return new Vanila();
		} else if (tip.equals("Jagoda")) {
			return new Jagoda();
		} else {
			return null;
		}
	}
}