package paket_DZ2_5zad_JelenaMilivojevic;

public class Etapa {

	double duzina;
	double tezina;
	double trajanje;

	public Etapa(double duzina, double tezina, double trajanje) {
		super();
		this.duzina = duzina;
		this.tezina = tezina;
		this.trajanje = trajanje;
	}

	public double getDuzina() {
		return duzina;
	}

	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

	public double getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(double trajanje) {
		this.trajanje = trajanje;
	}

}
