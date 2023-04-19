package paket1;

import java.util.LinkedList;
import java.util.List;

public class Vezba {

	public static void main(String[] args) {
		// Deklaracija nove LINKEDLIST kolekcije
		List<Character> LLista = new LinkedList<Character>();

		// Dodavanje elemenata u listu - noviji nacin
		LLista.add(0, 'A');
		LLista.add(1, 'B');
		LLista.add(2, 'C');
		LLista.add(3, 'D');
		LLista.add(4, 'E');
		LLista.add(5, 'F');

		// Pocetni izgled Liste:
		System.out.println("Pocetni izgled Liste:");
		System.out.println(LLista);

		// Brisanje elementa preko indexa
		LLista.remove(1);
		LLista.remove(2);

		// Brisanje elementa preko vrednosti
		// LLista.remove('E');

		// Izgled Liste nakon brisanja:
		System.out.println("Izgled Liste nakon brisanja:");
		System.out.println(LLista);

		// Proveravanje sadrzaja pojedinacnih elemenata
		boolean sadrziD = LLista.contains('D');
		System.out.println("Sadrzi li D: " + sadrziD);
		boolean sadrziE = LLista.contains('E');
		System.out.println("Sadrzi li E: " + sadrziE);

		// Pristupanje vrednostima elementa
		Object element0 = LLista.get(0);
		System.out.println("Element sa indexom 0: " + element0);
		Object element1 = LLista.get(1);
		System.out.println("Element sa indexom 1: " + element1);

		// Postavljanje vrednosti - elementa
		LLista.set(2, 'J');

		// Novi izgled LListe:
		System.out.println(LLista);

	}

}
