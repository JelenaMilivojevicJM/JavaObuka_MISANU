package paketBibliotekari;

import java.io.Serializable;

public class Bibliotekar implements Serializable{
	//Serijski broj klase 
			private static final long serialVersionUID = 75427836L;
	//Polja	
			private int sifraZaposlenog;
			private String ime;
			private String prezime;
			private String grad;
			private String ulica;
			private String ulicniBroj;
			private String telefon;
			private long jmbg;
			private int  bibliotekaID;
			
	//Konstruktor		
	Bibliotekar(int sifraZaposlenog,String ime,String prezime,String grad,String ulica,String ulicniBroj,String telefon, long jmbg, int bibliotekaID){
		this.sifraZaposlenog=sifraZaposlenog;
		this.ime=ime;
		this.prezime=prezime;
		this.grad=grad;
		this.ulica=ulica;
		this.ulicniBroj=ulicniBroj;
		this.telefon=telefon;
		this.jmbg=jmbg;
		this.bibliotekaID=bibliotekaID;
	}
	
	//Dohvatanje vrednosti pomocu getera
	public int getSifraZaposlenog() {
		return sifraZaposlenog;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
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

	public String getTelefon() {
		return telefon;
	}

	public long getJmbg() {
		return jmbg;
	}

	public int getBibliotekaID() {
		return bibliotekaID;
	}	
	
	// Metoda za tekstualni opis atributa
			public String toString() {
				return  "\n*BIBLIOTEKAR*: | Sifra Zaposlenog"+sifraZaposlenog + " | Ime: "+ ime+ " | Prezime: "+prezime+ " | Grad: "+grad+" | Adresa: "+ulica+","+ulicniBroj+" | Telefon: "+telefon+" | JMBG: "+jmbg+" | BibliotekaID: "+bibliotekaID;
			}
	
}
