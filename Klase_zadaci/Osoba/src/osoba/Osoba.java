package osoba;

public class Osoba {
	
	public String ime;
	public String datum;
	public String adresa;
	

		//Metoda
		public String ispisi() {
			return "Ime: " + ime + "\nDatum Rodjenja: " + datum + "\nAdresa Stanovanja: " +adresa+"";
		}
		public String getIme() {
			return ime;
		}
		public String getDatum() {
			return ime;
		}
}
