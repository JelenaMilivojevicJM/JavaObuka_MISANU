package paket_DZ2_5zad_JelenaMilivojevic;

abstract class Vozilo {
	protected double sopstvenaTezina;
	protected String naziv;

	public Vozilo(double sopstvenaTezina, String naziv) {
		this.sopstvenaTezina = sopstvenaTezina;
		this.naziv = naziv;
	}

	public abstract void upisiUTok();

	public double odrediTezinu() {
		return sopstvenaTezina;
	}

	public String dohvatiNaziv() {
		return naziv;
	}
}