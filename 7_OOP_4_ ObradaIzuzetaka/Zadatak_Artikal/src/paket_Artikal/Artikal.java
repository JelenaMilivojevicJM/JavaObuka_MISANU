package paket_Artikal;

public class Artikal {
	// Deklarisanje podataka
	String naziv;
	String proizvodjac;
	String barkod;
	double cena;

	// Metoda za pristup podatku naziv

	public String getNaziv() {
		return naziv;
	}

	// Metoda za postavljanje podatka naziv
	public void setNaziv(String naziv) throws IzuzetakArtikal {
		if (naziv == null)
			throw new IzuzetakArtikal("Naziv artikla ne sme biti null");
		this.naziv = naziv;
	}

// Metoda za pristup podatku proizvodjač
	public String getProizvodjac() {
		return proizvodjac;
	}

	// Metoda za postavljanje podatka proizvodjač
	public void setProizvodjac(String proizvodjac) throws IzuzetakArtikal {
		if (proizvodjac == null)
			throw new IzuzetakArtikal("Proizvodjač artikla ne sme biti null");
		this.proizvodjac = proizvodjac;
	}

//Metoda za pristup podatku barkod 
	public String getBarkod() {
		return barkod;
	}

//Metoda za postavljanje podatka barkod
	public void setBarkod(String barkod) throws IzuzetakArtikal {
		if (barkod == null)
			throw new IzuzetakArtikal("Barkod artikla ne sme biti null");
		this.barkod = barkod;
	}

	// Metoda za pristup podatku cena
	public double getCena() {
		return cena;
	}

//Metoda za postavljanje podatka cena
	public void setCena(double cena) throws IzuzetakArtikal {
		if (cena <= 0)
			throw new IzuzetakArtikal("Cena mora biti veća od nule");
		this.cena = cena;
	}

//Metoda za ispisivanje podataka o artiklu 
	public String toString() {
		return "Naziv: " + naziv + "\nProizvodjač: " + proizvodjac + "\nBarkod: " + barkod + "\nCena: " + cena;
	}
}
