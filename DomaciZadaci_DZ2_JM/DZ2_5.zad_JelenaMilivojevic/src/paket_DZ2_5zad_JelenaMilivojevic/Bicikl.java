package paket_DZ2_5zad_JelenaMilivojevic;

class Bicikl extends Vozilo {
	public Bicikl(double sopstvenaTezina, String naziv) {
		super(sopstvenaTezina, naziv);
	}

	@Override
	public void upisiUTok() {
		System.out.printf("%s, tezina: %.2f kg\n", naziv, sopstvenaTezina);
	}
}