package all4_String;

import java.util.ArrayList;
import java.util.List;

public class ALL4_String {

	public static void main(String[] args) {
		// ArrayList kolekcija sa Char vrednostima
				List<String> kolekcija = new ArrayList<String>();

				// METODA SIZE
				System.out.println("Pocetna duzina: " + kolekcija.size());

				// METODA ADD
				kolekcija.add("AAA");
				kolekcija.add("BBB");
				kolekcija.add("CCC");
				kolekcija.add("DDD");

				// Stampanje i prolazak kroz kolekciju:
				for (String s : kolekcija)
					System.out.printf(" " + s);
				System.out.println("\nTrenutna duzina: " + kolekcija.size());

				// METODA CONTAINS
				boolean sadrzaj = kolekcija.contains("CCC");

				if (sadrzaj) {
					System.out.println("Trazeni element SE nalazi u zadatoj kolekciji!");
				} else {
					System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji!");
				}

				// METODA GET
				String element = kolekcija.get(3);
				System.out.println("Element sa indexom 3 u kolekciji je: " + element);

				// METODA INDEXOF
				int pozicija = kolekcija.indexOf("AAA");
				System.out.println("Element AAA je na poziciji: " + pozicija);

				// METODA TO ARRAY
				char nizChar[] = new char[kolekcija.size()];
				kolekcija.toArray();
				System.out.println("Kolekcija u Niz: ");
				for (String s : kolekcija)
					System.out.println(" " + s);

				// METODA REMOVE
				System.out.println("\nKolekcija nakon ukalanja zadatog elementa DDD :");
				kolekcija.remove(3);
				for (String s : kolekcija)
					System.out.println(" " + s);

				// METODA CLEAR
				kolekcija.clear();
				System.out.println("Velicina kolekcije nakon brisanja: " + kolekcija.size());
	}

}
