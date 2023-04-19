package all2_int;

import java.util.ArrayList;
import java.util.List;

public class ALL2_int {

	public static void main(String[] args) {

		// ArrayList kolekcija sa int vrednostima
		List<Integer> kolekcija = new ArrayList<Integer>();

		// METODA SIZE
		System.out.println("Pocetna duzina: " + kolekcija.size());

		// METODA ADD
		kolekcija.add(1);
		kolekcija.add(2);
		kolekcija.add(3);
		kolekcija.add(4);

		// Stampanje i prolazak kroz kolekciju:
		for (int i : kolekcija) {
			System.out.printf(" " + i);
		}
		System.out.println("\nTrenutna duzina: " + kolekcija.size());

		// METODA CONTAINS
		boolean sadrzaj = kolekcija.contains(2);

		if (sadrzaj) {
			System.out.println("Trazeni element SE nalazi u zadatoj kolekciji!");
		} else {
			System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji!");
		}

		// METODA GET
		int element = kolekcija.get(1);
		System.out.println("Element sa indexom 1 u kolekciji je: " + element);

		// METODA INDEXOF
		int pozicija = kolekcija.indexOf(2);
		System.out.println("Element 2 je na poziciji: " + pozicija);

		// METODA TO ARRAY
		int nizInt[] = new int[kolekcija.size()];
		kolekcija.toArray();
		System.out.println("Kolekcija u Niz: ");
		for (int i : kolekcija)
			System.out.println(" " + i);

		// METODA REMOVE
		System.out.println("Kolekcija nakon ukalanja zadatog elementa 4 : \n");
		kolekcija.remove(3);
		for (int i : kolekcija)
			System.out.println(" " + i);

		// METODA CLEAR
		kolekcija.clear();
		System.out.println("Velicina kolekcije nakon brisanja: " + kolekcija.size());
	}
}