package paket_primer1;

public class GlavnaKlasa {
	/*
	 * Ovo je pokretacka klasa. Obe klase se nalaze UNUTAR istog paketa i zato te
	 * dve klase mogu da komuniciraju
	 */

	public static void main(String[] args) {

		/*
		 * Da bismo pozvali drugu klasu, mi moramo prvo kreirati OBJEKAT te klase.
		 * Objekat klase se naziva INSTANCA KLASE. Svaki objekat predstavlja instancu
		 * odredjene klase. Takva instanca klase kreira se tokom izvrsavanja i
		 * sastavljena je od nekog broja podataka.
		 */

		// Ovde zelimo da povezemo kalsu A sa ovom glavnom klasom, zato kreirano njenu
		// instancu
		// ime_klase ime_objekta = new ime_klase();
		A objekat = new A();

		// Ovde zelimo da pozovemo metodu iz te klase
		// ime_Objekta.ime_Metode();
		objekat.prikaziPoruku();
		// . je ovde operator poziova, pomocu koga pozivamo metode klase (odnosno
		// objekta te klase)

	}

}
