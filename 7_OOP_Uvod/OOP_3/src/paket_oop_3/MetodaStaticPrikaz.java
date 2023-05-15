package paket_oop_3;

public class MetodaStaticPrikaz {

	public static void main(String[] args) {
		// Poziv static metode
		// NazivKlase.NazivMetoda();
		AA.PrikaziPoruku();
		// *Svojsvo static metode : Mozemo pozvati metodu BEZ kreiranog objekta
		// Stavljanjem kljucne reci static pri kreiranju metode

		// Kod *NESTATICKIH METODA poziv se vrsi PREKO OBJEKTA
		// Da bi se pozvala dakle mora da se naporavi novi objekat
		/*
		 * 1.Kreiranje objekta 2NazivObjekta.NazivMetoda();
		 */
		// Novi objekat:
		AA a = new AA();
		a.PrikaziPoruku();
		AA objekat = new AA();
		objekat.PrikaziPoruku();

		/*
		 * Dakle: kada je klasa public void, mora se kreirati objekat da bi je pozvao, a
		 * ako je metoda static void moze se pozvati preko klase bez kreiranja objekta
		 */
	}

}
