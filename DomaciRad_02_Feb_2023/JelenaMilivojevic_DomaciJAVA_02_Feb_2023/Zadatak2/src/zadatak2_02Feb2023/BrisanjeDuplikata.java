package zadatak2_02Feb2023;

import java.util.ArrayList;
import java.util.Iterator;

public class BrisanjeDuplikata {

	// Genercika metoda za brisanje duplikata iz niza
	// - radi primene na dinamickim nizovima podataka razlictih tipa vrednosti
	public static <T> ArrayList<T> brisiDuplikate(ArrayList<T> niz) {

		// Kreiranje dinamickog niza za cuvanje onih koji nisu duplikati
		ArrayList<T> niz2 = new ArrayList<T>();

		for (T element : niz) {

			if (!niz2.contains(element)) {

				niz2.add(element);
			}
		}

		return niz2;
	}

	public static void main(String[] args) {
		/*
		 * TEXT ZADATKA: 2. Napisati program koji iz zadatog niza briše duplikate.
		 * 1232145657 -> 1234567
		 */

		// Dinamicki niz podataka celobrojne vrednosti
		ArrayList<Integer> niz = new ArrayList<Integer>();
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

		System.out.print("Pocetni Biz Brojeva: ");

		Iterator<Integer> iter1 = niz.iterator();
		while (iter1.hasNext()) {
			System.out.print(iter1.next() + " ");
		}

		ArrayList<Integer> nizBezDuplikata = brisiDuplikate(niz);
		System.out.print("\nNiz Brojeva Bez Duplikata: ");
		Iterator<Integer> iter2 = nizBezDuplikata.iterator();
		while (iter2.hasNext()) {
			System.out.print(iter2.next() + " ");
		}

		// Dinamicki niz podataka char vrednosti
		ArrayList<Character> nizChar = new ArrayList<Character>();
		nizChar.add('a');
		nizChar.add('b');
		nizChar.add('a');
		nizChar.add('c');
		nizChar.add('d');
		nizChar.add('e');
		nizChar.add('d');
		nizChar.add('a');
		nizChar.add('c');
		nizChar.add('f');

		System.out.print("\nPocetni Biz Karaktera: ");

		Iterator<Character> iter3 = nizChar.iterator();
		while (iter3.hasNext()) {
			System.out.print(iter3.next() + " ");
		}

		ArrayList<Character> nizCharBezDuplikata = brisiDuplikate(nizChar);
		System.out.print("\nNiz Karaktera Bez Duplikata: ");
		Iterator<Character> iter4 = nizCharBezDuplikata.iterator();
		while (iter4.hasNext()) {
			System.out.print(iter4.next() + " ");
		}

	}

}
