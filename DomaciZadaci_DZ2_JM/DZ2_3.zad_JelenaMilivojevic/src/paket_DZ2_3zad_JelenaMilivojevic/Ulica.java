package paket_DZ2_3zad_JelenaMilivojevic;

import java.util.ArrayList;

public class Ulica {
	private ArrayList<Zgrada> zgrade;
	private int maksimalniBrojAdrese;

	public Ulica(int maksimalniBrojAdrese) {
		this.zgrade = new ArrayList<>();
		this.maksimalniBrojAdrese = maksimalniBrojAdrese;
	}

	public int getUkupanBrojStanova() {
		int ukupno = 0;
		for (Zgrada zgrada : zgrade) {
			ukupno += zgrada.getUkupanBrojStanova();
		}
		return ukupno;
	}

	public double getUkupnaPovrsinaStanova() {
		double ukupno = 0.0;
		for (Zgrada zgrada : zgrade) {
			ukupno += zgrada.getPovrsinaOsnove() * zgrada.getUkupanBrojStanova() * zgrada.getProsecnaPovrsinaStana();
		}
		return ukupno;
	}

	public void dodajZgradu(Zgrada zgrada) throws Izuzetak {
		if (zgrade.size() >= maksimalniBrojAdrese) {
			throw new Izuzetak("Dostignut maksimalni broj adresa u ulici.");
		}
		zgrade.add(zgrada);
	}
	
	public int getUkupanBrojZgrada() {
        return zgrade.size();
    }
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < zgrade.size(); i++) {
			sb.append((i + 1) + ". " + zgrade.get(i).toString() + "\n");
		}
		return sb.toString();
	}
}
