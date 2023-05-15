package paket;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 1.Niz
		String imena1[] = { "Mika", "Zika", "Fica" };
		// 1.lolekcija
		List<String> listaImena1 = new LinkedList<String>();
		// Dodavanje elemenata iz niza u listu
		for (String s1 : imena1) {
			listaImena1.add(s1);
		}
		System.out.println("Lista 1: " + listaImena1);

		// 2. Niz:
		String imena2[] = { "Ana", "Lena", "Hana", "Una" };
		// 2.lolekcija
		List<String> listaImena2 = new LinkedList<String>();
		// Dodavanje elemenata iz niza u listu
		for (String s2 : imena2) {
			listaImena2.add(s2);
		}
		System.out.println("Lista 2: " + listaImena2);

		// METODA ADDALL
		listaImena1.addAll(listaImena2);
		System.out.println("Lista1 nakon upotrebe metode ADDED-ALL: " + listaImena1);

		// Brisanje odredjenih dodatkanovoj listi : brisemo prema zadatim indexima iz
		// podliste
		listaImena1.subList(0, 2).clear();
		System.out.println("Lista1 nakon brisanja nekih elemenata subliste: " + listaImena1);
	}

}
