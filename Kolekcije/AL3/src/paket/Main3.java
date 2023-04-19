package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// Niz sa elementima
		String niz[] = { "Mika", "Zika", "Pera" };

		// Kolekcija
		List<String> kolekcija = new ArrayList<String>();

		// Niz u kolekciju:
		for (String s : niz) {
			kolekcija.add(s);
		}

		// Iterator za prolazak kroz kolekciju
		Iterator iter = kolekcija.iterator();
		System.out.println("Kolekcija: ");
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}

		// Kolekcija za brisanje:
		// Niz sa elementima
		String nizBrisanje[] = { "Zika", "Pera" };

		// Kolekcija
		List<String> kolekcijaBrisanje = new ArrayList<String>();

		// Niz u kolekciju:
		for (String s : nizBrisanje) {
			kolekcijaBrisanje.add(s);
		}

		// Brisanje pomocu iteratora
		iter = kolekcija.iterator();
		while (iter.hasNext()) {
			if (kolekcijaBrisanje.contains(iter.hasNext())) {
				iter.remove();
			}
		}

		// Kolekcija NAKON Brisanja:
		System.out.println("Kolekcija NAKON Brisanja: ");
		for (int i = 0; i < kolekcija.size(); i++) {
			System.out.print(kolekcija.get(i));
		}

	}

}
