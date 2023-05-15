package paket;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List ll = new LinkedList();

		/* Dodavanje elemanta povezanoj lisit */
		ll.add("A"); // 0
		ll.add("B"); // 1
		ll.add(2, "C"); // 2

		System.out.println("Elementi povezane liste su: " + ll);

		/* Brisanje elemenata iz povezane liste */
		ll.remove(0); // brisanje preko indexa
		ll.remove("B"); // brisanje preko vrednosti

		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");
		/*
		 * Unutar interfejsa List, indeksiranje ide od 0. Ne moze se indeksirati
		 * stringovnim tipom
		 */

		System.out.println("Elementi povezane liste su: " + ll);

		/* Trazenje elemenata u povezanoj listi */
		boolean sadrzi = ll.contains("E");

		if (sadrzi) {
			System.out.println("Lista sadrzi element E.");
		} else {
			System.out.println("Lista ne sadrzi element E.");
		}

		/* Pristupanje (uzimanje) vrednosti elemenata iz povezane liste */
		Object element = ll.get(3);
		System.out.println("Zatrazen element je: " + element);

		/* Postavljanje vrednosti elemenata u povezanoj listi */
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);

	}
}