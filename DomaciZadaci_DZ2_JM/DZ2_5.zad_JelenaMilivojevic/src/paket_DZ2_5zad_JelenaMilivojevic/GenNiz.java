package paket_DZ2_5zad_JelenaMilivojevic;

import java.util.ArrayList;

class GenNiz<T> {
	private ArrayList<T> niz;
	private int kapacitet;

	public GenNiz() {
		this(20);
	}

	public GenNiz(int kapacitet) {
		this.niz = new ArrayList<T>();
		this.kapacitet = kapacitet;
	}

	public int brojElemenata() {
		return niz.size();
	}

	public T dohvatiElement(int index) throws Izuzetak{
		if (index < 0 || index >= niz.size()) {
			throw new Izuzetak("Ne postoji element sa indeksom " + index);
		}
		return niz.get(index);
	}

	public void dodajElement(T element) throws Izuzetak{
		if (niz.size() >= kapacitet) {
			throw new Izuzetak("Niz je vec popunjen.");
		}
		niz.add(element);
	}

	public void ispustiSve() {
		niz.clear();
	}
}