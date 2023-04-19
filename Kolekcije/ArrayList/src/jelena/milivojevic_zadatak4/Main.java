package jelena.milivojevic_zadatak4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Primer ucitavanja imena gradova u Srbiji:

		// Ucitavanje vrednosti sa konzole:
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite imena 4 grada u Srbiji: ");
		System.out.println("Ime prvog grada: ");
		String grad1 = sc.nextLine();
		System.out.println("Ime drugog grada: ");
		String grad2 = sc.nextLine();
		System.out.println("Ime treceg grada: ");
		String grad3 = sc.nextLine();
		System.out.println("Ime cetvrtog grada: ");
		String grad4 = sc.nextLine();

		// Kreiranje niza ucitanih vrednosti gradova
		String nizGradova[] = { grad1, grad2, grad3, grad4 };

		// Kreiranje kolekcije gradova
		List<String> kolekcijaGradova = new ArrayList<String>();

		// Ubacivanje elemenata iz niza u kolekciju
		for (String s : nizGradova) {
			kolekcijaGradova.add(s);
		}

		// Prolazak kroz kolekciju pomocu Interface Iteratora + ispis kolekcije

		Iterator iter = kolekcijaGradova.iterator();

		System.out.println("Kolekcija Gradova: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		sc.close();
	}

}
