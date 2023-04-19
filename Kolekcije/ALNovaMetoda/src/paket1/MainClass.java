package paket1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// ArrayList kolekcija sa Stringovnim vrednostima
		List<String> kolekcija = new ArrayList<String>();

		// METODA SIZE - vraca broj elemenata smestenih u kolekciji AL
		System.out.println("Pocetna duzina: " + kolekcija.size());

		// METODA ADD - dodaje element na kraj kolekcije
		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");

		// Stampanje i prolazak kroz kolekciju:
		for (String s : kolekcija)
			System.out.printf("%s ", s);

		System.out.println("\nTrenutna duzina: " + kolekcija.size());

		// METODA CONTAINS
		// Da li je element deo kolekcije
		// Ugradjena metoda contains - vraca true ako kolekcija sadrzi trazeni element

		boolean sadrzi = kolekcija.contains("Treci");// vrednost ce biti smestena unutar ove promenljive

		// Ispitivanje sadrzaja promenljive:
		if (sadrzi) {
			System.out.println("Trazeni element SE nalazi u zadatoj kolekciji!");
		} else {
			System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji!");
		}

		// METODA GET - vraca element sa zadatim indeksom
		// Kako zelimo da upistamo za elemnt sa indexom 2:
		String element = kolekcija.get(2);
		System.out.println("Element sa indexom 2 u kolekciji je: " + element);
		// Dakkle takodje smo ga smestili kao vrednost unutar odredjene promenljive,
		// prilikom ispitivanja

		// METODA INDEXOF - vraca index prve pojave zadatog elementa kolekcije
		// Na primer, ako element ne postoji vratice vrendost -1
		// Takodje, pravimo promenljivu u koju smestamo tu vrednost
		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);

		// METODA TO ARRAY - sluzi za prebacivanje elemenata u niz
		// elementi moraju biti istog tipa vrednosti promenljive, zato je ovde String
		// tipa

		String[] nizString = new String[kolekcija.size()];
		// Ovu vrednost dodeljujemo statickom mnizu, zato smo ga ovde anpravili kao
		// posebnu promenljivu (niz)
		// poziv toArray metode :
		kolekcija.toArray(nizString);
		// Niz koji pravimo dakle mora ds se pokalapa po tipu i velicini
		// moramo preci kroz taj niz u koji smo smetili elemente iz kolekcije:
		for (String s : nizString) {
			System.out.printf("%s ", s);
		}

		// METODA REMOVE - brise prvu pojavu zadate vrednosti
		kolekcija.remove("Treci");
		System.out.printf("\n Kolekcija nakon ukalanja elementa: \n");
		// da bismo videli nove rezultate moramo ponovo preci kroz datu kolekciju:
		for (String s : nizString) {
			System.out.printf("%s ", s);
		}

		// METODA CLEAR - brise SVe elemente iz zadate kolekcije

		kolekcija.clear();
		System.out.println("\nVelicina kolekcije nakon brisanja: " + kolekcija.size());
	}

}
