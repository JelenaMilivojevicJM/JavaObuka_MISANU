package paket;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Napisati program koji kreira ArrayList i dodaje vrednosti 5,4,9,7,12 u tu
		 * list a zatim ispisuje navedenu listu.
		 */
		List kolekcijaAL = new ArrayList();

		// add sluzi da dodavanje vrednosti unutar kolekcije

		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);

		System.out.println(kolekcijaAL);

		/*
		 * Razlika u odnosu na niz? Koristite ArrayList kada se ne zna unapred velicina
		 * niza!
		 */
	}

}
