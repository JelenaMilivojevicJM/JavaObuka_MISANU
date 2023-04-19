package paket1;

import java.util.ArrayList;
import java.util.List;

public class Primer2 {

	public static void main(String[] args) {

		List<String> kolekcija = new ArrayList<String>();

		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");

		for (String s : kolekcija)
			System.out.printf("%s ", s);

		System.out.println("\nTrenutna duzina: " + kolekcija.size());

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
