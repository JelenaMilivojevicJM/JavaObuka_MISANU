package paket1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// DEKLARACIJA KOLECIJE ARRAYLIST
		// Opsti oblik postupka delaracije kolekcije ArrayList
		// List je interfejs u okviru koga se smesta kolekcija ArrayList
		// <T> je tip podataka promenljive

		// interfejs <T> ime = new ArrayList<T>();
		List<Integer> kolekcijaAL = new ArrayList<Integer>();

		// Metoda koju cemo iskoristiti iz ovoga interfejska i kolekcije
		// Metoda: add koja se nalazi vec unutar interfejska List a mi je samo koristimo

		// DODAVANJE ELEMENATA UNUTAR KOLEKCIJE
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);

		// STAMPANJE KOLEKCIJE
		System.out.println(kolekcijaAL);

	}

}
