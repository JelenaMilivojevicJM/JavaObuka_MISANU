package dz1_3zad_paket1_JelenaM;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Polica {

	// Stvaranje police sa zadatim brojem mesta i zadatom dozvoljenom najvećom
	// težinom svih predmeta na polici
	int ukupnoMesta;
	int maxTezinaSvih;

	Polica(int ukupnoMesta, int maxTezinaSvih) {
		this.ukupnoMesta = ukupnoMesta;
		this.maxTezinaSvih = maxTezinaSvih;
	}

	Scanner sc = new Scanner(System.in);

	// Kolekcije predmeta i njihovih tezina
	 List<String> predmet = new LinkedList<String>();
	 List<Integer> tezina = new LinkedList<Integer>();

	// -stavljanje predmeta na zadato mesto I na prvo slobodno mesto na polici,
	public void staviPredmetnaMesto() {

		System.out.println("Koliko predmeta zelite da stavite u policu? ");
		int broj = sc.nextInt();

		if (broj > ukupnoMesta) {
			System.out.println("Nema dovoljno mesta! Mozete staviti maximalno " + ukupnoMesta + " predmeta!");
		}

		for (int i = 0; i <broj; i++) {
			System.out.println("Predmet " + (i + 1) + ": ");
			String unosPredmeta = sc.nextLine();
			predmet.add(unosPredmeta);
		}

	}

	public void unosTezine() {
		for (int i = 0; i < predmet.size(); i++) {

			System.out.println("Unesite tezinu predmeta na mestu broj " + (i + 1) + " (u gr): ");

			int unosTezinepoPredmetu = sc.nextInt();

			if (unosTezinepoPredmetu > maxTezinaSvih) {

				System.out.println("Predmet je pretezak!");
			}
			tezina.add(unosTezinepoPredmetu);
		}
	}

	// - uzimanje predmeta sa zadatom mesta na polici (predmet se uklanja sa police)
	public void ukloniPredmetsaMesta() {
		System.out.println("Unesite redni broj mesta sa kog brisete predmet: ");
		int kojeMesto = sc.nextInt();
		if (kojeMesto > 1) {
			int brisanje = kojeMesto - 1;
			predmet.remove(brisanje);
			tezina.remove(brisanje);
			System.out.println("Obrisan je predmet sa mesta broj " + kojeMesto);
		} else {
			predmet.remove(kojeMesto);
			tezina.remove(kojeMesto);
			System.out.println("Obrisan je predmet sa mesta broj " + kojeMesto);
		}
	}

	// - pristup predmetu na datom mestu na polici (predmet ostaje na polici)
	public void pristupiPredmetu() {
		System.out.println("Unesite redni broj mesta predmeta za koji zelite da proverite predmet: ");
		int pozicija = sc.nextInt();
		if (pozicija > 1) {
			int provera = pozicija - 1;
			Object element = predmet.get(provera);
			System.out.println("Na mestu broj " + pozicija + " nalazi se " + element);
		} else {
			Object element = predmet.get(pozicija);
			System.out.println("Na mestu broj " + pozicija + " nalazi se " + element);
		}
	}

	// - ispitivanje da li je neko mesto na polici prazno,
	public void proveraPopunjenostiMesta() {
		System.out.println("Unesite redni broj mesta za proveru popunjenosti: ");
		int lokacija = sc.nextInt();
		int lok = 0;
		if (lokacija >= 1) {
			
			lok = lokacija - 1;
			int index = predmet.indexOf(lok);
			String element = predmet.get(lok);
			if(index==-1) {
				System.out.println("Mesto je prazno");
			} else {
				System.out.println("Na mestu broj " + lokacija + " nalazi se " + element);
			}
		} else {
			int index = predmet.indexOf(lok);
			String element = predmet.get(lok);
			if(index==-1) {
				System.out.println("Mesto je prazno");
			} else {
				System.out.println("Na mestu broj " + lokacija + " nalazi se " + element);
			}
		}
	}

	// Broj popunjenih mesta u polici
	public void ukupnoPoupunjenihMesta() {
		int brojPopunjenihMesta = predmet.size();
		System.out.println("Ukupno popunjenih mesta: " + brojPopunjenihMesta);
	}

	// Ukupno tereta na polici:
	public void ukupnaTezina() {
		int zbirTezina = 0;

		for (int i = 0; i < tezina.size(); i++) {
			zbirTezina += tezina.get(i);
		}

		System.out.println("Ukupna tezina svih unetih predmeta: " + zbirTezina);

		if (zbirTezina > maxTezinaSvih) {
			System.out.println("Prekoracili ste dozvoljenu tezinu! Polica samo sto nije pukla!");
		} else if (zbirTezina < maxTezinaSvih) {
			int razlika = maxTezinaSvih - zbirTezina;
			System.out.println("Mozete dodati tezinu u iznosu od " + razlika + " grama");
		} else {
			System.out.println("Uneta tezina je jednaka ukupno dozvoljenoj");
		}
	}

	// - sastavljanje tekstualnog opisa police,

	public void opisPolice() {

		System.out.print("Predmeti na polici: ");
		ListIterator<String> liter1 = predmet.listIterator();
		while (liter1.hasNext()) {
			System.out.print(liter1.next() + " ");
		}
		System.out.println();

		System.out.print("Tezine predmeta (od prvog do poslednjeg): ");
		ListIterator<Integer> liter2 = tezina.listIterator();
		while (liter2.hasNext()) {
			System.out.print(liter2.next() + " ");
		}
		System.out.println();
	}

	// - pražnjenje police.
	public void isprazniPolicu() {
		predmet.clear();
		tezina.clear();
		System.out.println("Polica je prazna!");
	}
}
