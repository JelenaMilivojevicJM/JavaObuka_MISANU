package zadatak3_02Feb2023;

public class Zaposlen extends Osoba{
	String nazivFirme;
	String odeljenjeRada;
	
	Zaposlen(String ime,String datumRodjenja,String adresaStanovanja,String nazivFirme,String odeljenjeRada ){
		super(ime,datumRodjenja,adresaStanovanja);
		this.nazivFirme = nazivFirme;
		this.odeljenjeRada = odeljenjeRada;
	}
	
	public String toString() {
		return "Zaposlen: "+super.toString()+"\nNaziv Firme: "+nazivFirme+"\nOdeljenje Rada: "+odeljenjeRada;
		}
}
