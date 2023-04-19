package paket_DZ2_5zad_JelenaMilivojevic;

import java.util.ArrayList;

class TrkackiAuto extends Vozilo {
	private ArrayList<Voznja> voznje;

	public TrkackiAuto(double sopstvenaTezina, String naziv) {
		super(sopstvenaTezina, naziv);
		voznje = new ArrayList<Voznja>();
	}

	public void zapocniVoznju() {
		voznje.add(new Voznja());
	}

	public void dodajEtapu(int trajanje, double brzina) {
		voznje.get(voznje.size() - 1).dodajEtapu(trajanje, brzina);
	}

	public Voznja najbrzaVoznja() {
		Voznja najbrzaVoznja = voznje.get(0);
		for (Voznja voznja : voznje) {
			if (voznja.prosecnaBrzina() > najbrzaVoznja.prosecnaBrzina()) {
				najbrzaVoznja = voznja;
			}
		}
		return najbrzaVoznja;
	}

	public void dodajVoznju(Voznja voznja) {
		if (voznje.size() < 10) {
			voznje.add(voznja);
		} else {
			System.out.println("Kapacitet popunjen! Ne mozete dodati novu voznju.");
		}
	}

	public ArrayList<Voznja> dohvatiVoznje() {
		return new ArrayList<Voznja>(voznje);
	}

	@Override
	public void upisiUTok() {
		// TODO Auto-generated method stub

	}
}