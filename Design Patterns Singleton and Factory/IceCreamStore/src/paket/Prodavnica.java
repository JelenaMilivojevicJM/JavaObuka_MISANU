package paket;

public class Prodavnica {
	// Statička promenljiva koja čuva jedinstvenu instancu klase Prodavnica
	private static Prodavnica instance;

	// Privatni konstruktor koji sprečava direktno instanciranje klase
	private Prodavnica() {
	}

	// Statička metoda koja vraća jedinstvenu instancu klase Prodavnica
	public static Prodavnica getInstance() {
		// Ako instanca još uvek nije kreirana, kreiraj je
		if (instance == null) {
			instance = new Prodavnica();
		}
		// Vrati instancu
		return instance;
	}

	// Metoda koja prima tip sladoleda kao argument i vraća odgovarajući objekat
	// sladoleda
	public Sladoled poruciSladoled(String tip) {
		// Koristi Factory obrazac dizajna da kreira odgovarajući objekat sladoleda
		Sladoled sladoled = SladoledFactory.napraviSladoled(tip);
		// Pripremi sladoled
		sladoled.pripremi();
		// Spakuj sladoled
		sladoled.pakovanje();
		// Vrati objekat sladoleda
		return sladoled;
	}
}