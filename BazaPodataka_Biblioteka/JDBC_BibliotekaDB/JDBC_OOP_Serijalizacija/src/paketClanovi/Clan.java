package paketClanovi;

import java.io.Serializable;

public class Clan implements Serializable {
/*Klasa Clan predstavlja clanove biblioteke.
 * Polja ove klase se poklapaju sa poljima Tabele Clanovi */
	
	//Serijski broj klase 
		private static final long serialVersionUID = 1506L;
	//Polja:
	private int brClanskeKarte;
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String telefon;
	private String grad;
	private String ulica;
	private String ulicniBroj;
	
	//Konstruktor
	Clan(int brClanskeKarte,String ime,String prezime,String datumRodjenja,String telefon,String grad,String ulica,String ulicniBroj){
		this.brClanskeKarte=brClanskeKarte;
		this.ime=ime;
		this.prezime=prezime;
		this.datumRodjenja=datumRodjenja;
		this.telefon=telefon;
		this.grad=grad;
		this.ulica=ulica;
		this.ulicniBroj=ulicniBroj;
	}

	//Dohvatanje vrednosti atributa pomocu gettera
	public int getBrClanskeKarte() {
		return brClanskeKarte;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getGrad() {
		return grad;
	}

	public String getUlica() {
		return ulica;
	}

	public String getUlicniBroj() {
		return ulicniBroj;
	}
	// Metoda za tekstualni opis atributa
		public String toString() {
			return  "\n*CLAN*: | BrClanskeKarte"+brClanskeKarte + " | Ime: "+ ime+ " | Prezime: "+prezime+ " | Datum Rodjenja: "+datumRodjenja+" | Telefon: "+telefon+" | Grad: "+grad+" | Adresa: "+ulica+","+ulicniBroj;
		}
}
