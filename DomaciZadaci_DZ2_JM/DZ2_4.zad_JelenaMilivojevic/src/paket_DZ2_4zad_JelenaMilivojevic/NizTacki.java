package paket_DZ2_4zad_JelenaMilivojevic;

public class NizTacki {

	private Tacka[] tacke;
	private int kapacitet;
	private int brojElemenata;

	public NizTacki() {
		this.kapacitet = 5;
		this.tacke = new Tacka[this.kapacitet];
		this.brojElemenata = 0;
	}

	public void dodaj(Tacka t) {
		if (this.brojElemenata == this.kapacitet) {
			this.povecajKapacitet();
		}
		this.tacke[this.brojElemenata] = t;
		this.brojElemenata++;
	}

	private void povecajKapacitet() {
		this.kapacitet += 5;
		Tacka[] noviTacke = new Tacka[this.kapacitet];
		for (int i = 0; i < this.brojElemenata; i++) {
			noviTacke[i] = this.tacke[i];
		}
		this.tacke = noviTacke;
	}

	public int getBrojElemenata() {
		return this.brojElemenata;
	}

	public Tacka najprivlacnija(Tacka t) {
		Tacka najPrivlacnija = this.tacke[0];
		double najvecaPrivlacnaSil = t.privlacnaSil(this.tacke[0]);
		for (int i = 1; i < this.brojElemenata; i++) {
			double privlacnaSil = t.privlacnaSil(this.tacke[i]);
			if (privlacnaSil > najvecaPrivlacnaSil) {
				najPrivlacnija = this.tacke[i];
				najvecaPrivlacnaSil = privlacnaSil;
			}
		}
		return najPrivlacnija;
	}

	public void ispisi() {
		for (int i = 0; i < this.brojElemenata; i++) {
			this.tacke[i].ispisi();
		}
	}
}
