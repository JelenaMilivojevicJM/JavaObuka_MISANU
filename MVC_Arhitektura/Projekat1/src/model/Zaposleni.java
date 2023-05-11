package model;

public class Zaposleni {
	/*
	 * Zaposleni je Komponenta Model: Predstavlja poslovnu logiku aplikacije i
	 * takođe stanje aplikacije. Objekat modela preuzima i čuva stanje modela u bazi
	 * podataka. Koristeći sloj modela, pravila se primenjuju na podatke koji
	 * predstavljaju koncepte primene.
	 */

	// Deklaracija privatnih promenljivih
	private int id; // ID zaposlenog
	private String ime; // Ime zaposlenog
	private String prezime;// Prezime zaposlenog
	private String pozicija; // Pozicija rada
	private String odeljenje; // Odeljenje zaposlenog
	private String email; // Poslovni email

	public Zaposleni(){}
	
	public Zaposleni(int id, String ime, String prezime, String pozicija, String odeljenje, String email) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.odeljenje = odeljenje;
		this.email = email;
	}

	// Getter i Setter metode za postavljanje i dohvatanje atributa zaposlenog
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPozicija() {
		return pozicija;
	}

	public String getEmail() {
		return email;
	}

	public String getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}
}