package jelena.milivojevic;

public class A {
	private String message;

	/*
	 * Deklarisanjem privatnih podataka vrši se enkapsulacija - skrivanje podataka.
	 * Sprečava se promena vrednosti promenljivih iz koda van zadatke klase
	 * 
	 * podatak = atribut = osobina klase Objekti imaju svoje atribute atributi se
	 * predstavljaju preko promenljivih u deklaraciji klase deklarišu se unutar
	 * klase van svih metoda
	 * 
	 * Metoda klase
	 * 
	 * Metoda setMessage postavlja poruku.
	 */

	public void setMessage(String msg) {
		message = msg; /* postavlja vrednost promenljivoj 'message' */
	}

	/* Metoda getMessage() vraća poruku. */
	public String getMessage() { /* nema parametara, vraćaju odgovarajući tip podataka */
		return message;
	}

	/*
	 * Parametri i argumenti metoda promenljiva deklarisana u zaglavlju metode
	 * nazivamo parametrom Argument se prosledjuje metodi prilikom poziva metode.
	 * !!! Prilikom poziva, parametri dobijaju vrednost argumenata metode
	 * 
	 */
}