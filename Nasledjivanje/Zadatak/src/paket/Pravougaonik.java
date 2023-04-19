package paket;

public class Pravougaonik extends Oblik {
	public double duzina;
	public double sirina;

	public Pravougaonik(double duzina, double sirina) {
		this.duzina = duzina;
		this.sirina = sirina;
	}

	public double uzmiPovrsinu() {
		return duzina * sirina;
	}
}
