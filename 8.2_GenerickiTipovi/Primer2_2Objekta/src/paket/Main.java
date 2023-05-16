package paket;

public class Main {
	public static void main(String[] args) {
		// Objekat1 genericke klase
		GKlasa<Integer> objekat = new GKlasa<Integer>(5);
		objekat.prikaziTip();
		
		// Dohvatanje vrednosti objekta1
		int vrednost = objekat.getAtribut();
		System.out.println("Vrednost objekta je: " + vrednost);

		// Objekat2 genericke klase
		GKlasa<String> objekat2 = new GKlasa<String>("Jelena");
		objekat2.prikaziTip();
		
		// Dohvatanje vrednosti objekta2
		String vrednost2 = objekat2.getAtribut();
		System.out.println("Vrednost objekta2 je: " + vrednost2);
	}
}
