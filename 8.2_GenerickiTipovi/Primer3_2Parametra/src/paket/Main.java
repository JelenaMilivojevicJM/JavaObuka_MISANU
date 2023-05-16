package paket;

public class Main {

	public static void main(String[] args) {
		// Objekat genericke klase
		GKlasa<Integer, String> objekat = new GKlasa<Integer, String>(5, "Odlican");

		objekat.prikaziTip();

		// Dohvatanje vrednosti atributa
		int vrednost1 = objekat.getAtribut1();
		System.out.println("Vrednost atributa1 objekta je: " + vrednost1);

		String vrednost2 = objekat.getAtribut2();
		System.out.println("Vrednost atributa2 objekta je: " + vrednost2);
	}

}
