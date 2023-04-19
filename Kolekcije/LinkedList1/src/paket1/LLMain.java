package paket1;

import java.util.LinkedList;
import java.util.List;

public class LLMain {

	public static void main(String[] args) {
		// Ovde jedino naznacavamo razliku un klasi kojuz elimo da iskoristimo, ovde je
		// LinkedList

		List<String> ll = new LinkedList<String>();

		// Dodavanje elemenata u povezanu listu
		ll.add("A");// index 0
		ll.add("B");// index 1
		ll.add(2, "C");// index 2 --Mozemo i ovako i sa naznacavanjem indexaispred elementa
		System.out.println("Elementi povezane liste su: " + ll);

		// Brisanje elemenata iz povezane lista
		ll.remove(0); // brisanje preko indexa
		ll.remove("B");// brisanje preko vrednosti
		System.out.println("Nakon brisanja elemenata: " + ll);

		// Dodavanje elemenata
		ll.add("D");
		ll.add("E");
		ll.add("F");
		System.out.println("Elementi povezane liste su: " + ll);

		// Trazenje u povezanoj listi:
		boolean sadrzaj = ll.contains("E");
		if (sadrzaj) {
			System.out.println("Lista sadrzi element E! ");
		} else {
			System.out.println("Lista NE sadrzi element E! ");
		}

		// Pistupanje vrednostima elementa (uzimanje elementa iz lista)
		Object element = ll.get(2);
		System.out.println("Zatrazeni element je: " + element);

		// Postavljanje vrednosti u ll
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);
	}
}
