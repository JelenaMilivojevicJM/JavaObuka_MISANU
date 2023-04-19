package zadatak3_02Feb2023;

public abstract class Osoba {

	String ime;
	String datumRodjenja;
	String adresaStanovanja;
	
	Osoba(String ime,String datumRodjenja,String adresaStanovanja){
		this.ime = ime;
		this.datumRodjenja=datumRodjenja;
		this.adresaStanovanja=adresaStanovanja;
	}
	
	public String toString() {
		return "\nIme: "+ime+",\nDatum rodnjenja: "+datumRodjenja+"\nAdresa Stanovanja: "+adresaStanovanja;
	}
}
