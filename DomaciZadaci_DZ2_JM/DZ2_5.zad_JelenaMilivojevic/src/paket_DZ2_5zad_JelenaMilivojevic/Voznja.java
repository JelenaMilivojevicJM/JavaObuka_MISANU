package paket_DZ2_5zad_JelenaMilivojevic;

import java.util.ArrayList;

public class Voznja {
	private double duzina;
	private ArrayList<Integer> etape;
	private ArrayList<Voznja> voznje;

	public Voznja() {
		this.etape = new ArrayList<Integer>();
		this.duzina = 0;
		this.voznje = new ArrayList<Voznja>();
	}

	public void dodajEtapu(int duzinaEtape, double vrijeme) {
		etape.add(duzinaEtape);
		duzina += duzinaEtape;
	}

	public double prosecnaBrzina() {
		double v = 0;
		for (int i = 0; i < etape.size(); i++) {
			v += etape.get(i);
		}
		return duzina / v;
	}

	public void zavrsiVoznju() {
		voznje.add(this);
	}

	public static Voznja najbrzaVoznja(ArrayList<Voznja> voznje) {
		Voznja najbrza = null;
		double maxBrzina = Double.MIN_VALUE;
		for (Voznja voznja : voznje) {
			double brzina = voznja.prosecnaBrzina();
			if (brzina > maxBrzina) {
				najbrza = voznja;
				maxBrzina = brzina;
			}
		}
		return najbrza;
	}

	public void zapocniVoznju() {
		etape = new ArrayList<Integer>();
		duzina = 0;
	}

	public void dodajEtapa(int duzinaEtapa) {
		etape.add(duzinaEtapa);
		duzina += duzinaEtapa;
	}

	public double dohvatiUkupnuDuzinu() {
		return duzina;
	}

	public double najvecaSrednjaBrzina() {
		double maxSrednjaBrzina = 0;
		int brojEtapa = etape.size();
		for (int i = 0; i < brojEtapa - 1; i++) {
			int duzinaEtapa = etape.get(i);
			int trajanjeEtapa = (int) (Math.random() * 1800) + 600;
			double srednjaBrzinaEtape = (double) duzinaEtapa / trajanjeEtapa;
			if (srednjaBrzinaEtape > maxSrednjaBrzina) {
				maxSrednjaBrzina = srednjaBrzinaEtape;
			}
		}
		return maxSrednjaBrzina;
	}

	public ArrayList<Voznja> dohvatiVoznje() {
		return new ArrayList<Voznja>(voznje);
	}

}