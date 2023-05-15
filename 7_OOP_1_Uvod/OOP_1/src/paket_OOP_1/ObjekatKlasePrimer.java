package paket_OOP_1;

public class ObjekatKlasePrimer {

	public static void main(String[] args) {
		// Kreiranje novog objekta - instance klase A:
		// NazivKlase nazivObjekta = new nazivKlase();
		A objekat = new A();
		// Ovo je novi objekat tj instanca klase A

		// Pozivamo metodu koja se nalazi unutar klase A
		// Metode klase se pozivaju pomocu operatora . (Tacka) je ovde Operator Pristupa
		objekat.PrikaziPoruku();
		// NavizObjekta.NavizMetode();
	}

}
