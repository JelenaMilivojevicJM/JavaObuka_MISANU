package paket_zadatak;

public class Knjiga {

	private String ime;
	private int brojStranica;

	public void setime(String name) {
		ime = name;
	}

	public String getime() {
		return ime;
	}

	public void setbrojStranica(int br) {
		brojStranica = br;
	}

	public int getbrojStranica() {
		return brojStranica;
	}

	public void imeIBroj() {
		System.out.println("Ime: " + getime() + ". Broj stranica: " + getbrojStranica());
	}
}