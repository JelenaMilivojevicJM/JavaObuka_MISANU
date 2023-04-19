package paket_DZ2_5zad_JelenaMilivojevic;
//Kamion nasledjuje vozilo jer je i on vrsta vozila

class Kamion extends Vozilo {
	private double nosivost;
	private double teret;

	public Kamion(double sopstvenaTezina, double nosivost, String naziv) {
		super(sopstvenaTezina, naziv);
		this.nosivost = nosivost;
		this.teret = 0;
	}

	public void dodajTeret(double tezinaTereta) {
		if (teret + tezinaTereta > nosivost) {
			throw new IllegalArgumentException("Kamion bi bio preopterecen!");
		}
		teret += tezinaTereta;
	}

	public void skiniTeret(double tezinaTereta) {
		if (teret - tezinaTereta < 0) {
			teret = 0;
		} else {
			teret -= tezinaTereta;
		}
	}

	@Override
	public void upisiUTok() {
		System.out.printf("%s, tezina: %.2f kg, teret: %.2f kg\n", naziv, sopstvenaTezina, teret);
	}
}