package paket_oop_4;

public class A {

	private String message;

	/*
	 * Enkapsulacija - skrivanje podataka /*Kada stavimo PRIVATE mi na taj nacin
	 * skrivamo podatke odnosno kazemo da su vidljivi samo u toj klasi. Sprecava se
	 * promena vrednosti promenljivih iz koda van zadate klase. Taj podatak je dakle
	 * zasticen i vidi se samo unutar klase u kojoj je deklarisan. Nije vidljiv
	 * drugim klasama.
	 */

	/*
	 * Podatak je atribut tj osobina kalse. message je osobina kalse A Objekat ima
	 * svoje atribute.
	 */

	/*
	 * SETERI - sluze da bi postavili neku vrednost //npr metoda set message - znaci
	 * da zelimo da postavimo poruku pise se:
	 */

	public void setMessage(String msg) {
		message = msg;
	}

	/*
	 * GETERI - sluze za vracanje vrednosti, metoda GET
	 */
	public String getMessage() {
		return message;
	}
}
