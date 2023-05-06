package paketIznajmljeneKnjige;

import java.io.Serializable;

public class Knjiga implements Serializable{
	//serijski broj ove klase:
	private static final long serialVersionUID = 19941506L;
	
	//Polja:
	private int id;
	private long isbn;
	private String naziv;
	private String jezik;
	private String izdavac;
	private String status;
	private int pozajmnoOdeljenjeID;
	
	//Konstruktor
	Knjiga(int id, long isbn, String naziv, String jezik, String izdavac, String status,
			int pozajmnoOdeljenjeID) {
		this.id = id;
		this.isbn = isbn;
		this.naziv = naziv;
		this.jezik = jezik;
		this.izdavac = izdavac;
		this.status = status;
		this.pozajmnoOdeljenjeID = pozajmnoOdeljenjeID;
	}
	//Getteri
	public int getId() {
		return id;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getJezik() {
		return jezik;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public String getStatus() {
		return status;
	}

	public int getPozajmnoOdeljenjeID() {
		return pozajmnoOdeljenjeID;
	}
	
	// Metoda za tekstualni opis atributa
			public String toString() {
				return  "\n*KNJIGA*: | ID: "+id + " | Naziv: "+ naziv+ " | Jezik: "+jezik+ " | Izdavac: "+izdavac+" | Status: "+status+" | PozajmnoOdeljenjeID: "+pozajmnoOdeljenjeID;
			}
}
