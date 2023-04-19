package all1_char;

import java.util.ArrayList;
import java.util.List;

public class ALL1_Char {

	public static void main(String[] args) {
		// ArrayList kolekcija sa Char vrednostima
		List<Character> kolekcija = new ArrayList<Character>();

		// METODA SIZE
		System.out.println("Pocetna duzina: " + kolekcija.size());

		// METODA ADD
		kolekcija.add('A');
		kolekcija.add('B');
		kolekcija.add('C');
		kolekcija.add('D');

		// Stampanje i prolazak kroz kolekciju:
		for (char c : kolekcija)
			System.out.printf(" " + c);
		System.out.println("\nTrenutna duzina: " + kolekcija.size());

		// METODA CONTAINS
		boolean sadrzaj = kolekcija.contains('C');

		if (sadrzaj) {
			System.out.println("Trazeni element SE nalazi u zadatoj kolekciji!");
		} else {
			System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji!");
		}

		// METODA GET
		char element = kolekcija.get(3);
		System.out.println("Element sa indexom 3 u kolekciji je: " + element);

		// METODA INDEXOF
		int pozicija = kolekcija.indexOf('A');
		System.out.println("Element 'A' je na poziciji: " + pozicija);

		// METODA TO ARRAY
		char nizChar[] = new char[kolekcija.size()];
		kolekcija.toArray();
		System.out.println("Kolekcija u Niz: ");
		for (char c : kolekcija)
			System.out.println(" " + c);

		// METODA REMOVE
		System.out.println("Kolekcija nakon ukalanja zadatog elementa'D':");
		kolekcija.remove(3);
		for (char c : kolekcija)
			System.out.println(" " + c);

		// METODA CLEAR
		kolekcija.clear();
		System.out.println("Velicina kolekcije nakon brisanja: " + kolekcija.size());
	}

}
