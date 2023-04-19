package all3_double;

import java.util.ArrayList;
import java.util.List;

public class ALL3_Double {

	public static void main(String[] args) {
		// ArrayList kolekcija sa int vrednostima
				List<Double> kolekcija = new ArrayList<Double>();

				// METODA SIZE
				System.out.println("Pocetna duzina: " + kolekcija.size());

				// METODA ADD
				kolekcija.add(1.5);
				kolekcija.add(2.5);
				kolekcija.add(3.5);
				kolekcija.add(4.5);

				// Stampanje i prolazak kroz kolekciju:
				for (double d : kolekcija) {
					System.out.printf(" " + d);
				}
				System.out.println("\nTrenutna duzina: " + kolekcija.size());

				// METODA CONTAINS
				boolean sadrzaj = kolekcija.contains(2.5);

				if (sadrzaj) {
					System.out.println("Trazeni element SE nalazi u zadatoj kolekciji!");
				} else {
					System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji!");
				}

				// METODA GET
				double element = kolekcija.get(1);
				System.out.println("Element sa indexom 1 u kolekciji je: " + element);

				// METODA INDEXOF
				int pozicija = kolekcija.indexOf(2.5);
				System.out.println("Element 2.5 je na poziciji: " + pozicija);

				// METODA TO ARRAY
				double nizDouble[] = new double[kolekcija.size()];
				kolekcija.toArray();
				System.out.println("Kolekcija u Niz: ");
				for (double d : kolekcija)
					System.out.println(" " + d);

				// METODA REMOVE
				System.out.println("Kolekcija nakon ukalanja zadatog elementa 4.5 : \n");
				kolekcija.remove(3);
				for (double d : kolekcija)
					System.out.println(" " + d);

				// METODA CLEAR
				kolekcija.clear();
				System.out.println("Velicina kolekcije nakon brisanja: " + kolekcija.size());
	}

}
