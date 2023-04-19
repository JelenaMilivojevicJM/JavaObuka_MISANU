package jelena.milivojevic;

public class Main {

	public static void main(String[] args) {
		/*
		 * Kreirati klasu A sa metodom PrikaziPoruku koja ispisuje text
		 * "Ovo je poruka!". Kreirati pokretačku klasu ObjekatKlaseA. U klasi
		 * ObjekatKlaseA kreirati objekat klase A i pozvati metodu PrikaziPoruku.
		 */

		/*
		 * Kreiranje novog objekta (instance) klase A. Svaki objekat predstavlja
		 * instancu odredjene klase. Kreiran je tokom izvršavanja. Objekat je sastavljen
		 * od određenog broja polja (podataka)
		 */
		A objekat = new A();

		/*
		 * Metode klase se pozivaju pomoću operatora '.'
		 */
		objekat.PrikaziPoruku();
	}

}
