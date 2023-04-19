package jelena.milivojevic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * TEXT: Napisati program koji iz zadatog niza briše duplikate. 1232145657 ->
		 * 1234567
		 */

		// Kreiranje dinamickog niza
		List<Integer> niz = new ArrayList<Integer>();

		// Ubacivanje elemenata u dinamicki niz
		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(2);
		niz.add(1);
		niz.add(4);
		niz.add(5);
		niz.add(6);
		niz.add(5);
		niz.add(7);

		// Kreiranje pomocnog niza koji cuva brojeve koji nisu duplikati
		List<Integer> pomocni = new ArrayList<Integer>();

		// Dodavanje u pomocni onih elemenata koje ne sadrzi
		for (Integer i : niz) {
			if (!pomocni.contains(i)) {
				pomocni.add(i);
			}
		}

		// Prolazak kroz pocetni niz a zatim i kroz niz bez duplikata:
		Iterator<Integer> niz1iter = niz.iterator();
		System.out.print("Niz na pocetku: ");
		while (niz1iter.hasNext()) {
			System.out.print(niz1iter.next() + " ");
		}
		System.out.println();
		Iterator<Integer> iter = pomocni.iterator();
		System.out.print("Niz BEZ duplikata ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

	}

}