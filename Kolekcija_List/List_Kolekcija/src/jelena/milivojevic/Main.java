package jelena.milivojevic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * Teorijsko objasnjenje List-a: U hijerarhiji kolekcija, interfejs Collection
		 * je koreni interfejs iz koga su izvedeni interfejsi List, Set, Queue.
		 * Interfejs List definise kolekciju u kojoj se elementi mogu ponavljati List je
		 * uredjena kolekcija koja je izvedena iz korenog interfejsa Collection.
		 * Karakteristike: 1) Interfejs List obezbedjuje niz metoda za rad sa elementima
		 * liste, rad sa opsegom elemenata liste, pretragu elemenata, itd.
		 * 
		 * 2) Moze sadrzati duplikate elemenata. Interfejs List definise kolekciju u
		 * kojoj se elementi mogu ponavljati
		 * 
		 * 3) Kao kod nizova, indeks prvog elementa liste je 0.
		 * 
		 * 4) Za razliku od nizova, elementima se ne moze pristupiti koristeci zagrade [
		 * ], vec preko odgovarajucih metoda get i set.
		 * 
		 * Nekoliko KLASA implementira interfejs List, od kojih su najsce koriscene dve:
		 * 1. ArrayList - implementira se kao niz promenljive duzine. 2. LinkedList -
		 * LinkedList se implementira kao povezana lista, koja je u osnovi predstavljena
		 * kao vektor parova (element, pokazivac na sledeci).
		 * 
		 * Posto je List kolekcija, to znaci da moze raditi samo nad referentnim tipom
		 * podataka. Primitivni tipovi moraju prvo biti "umotani" u wrapper klase kako
		 * bi imali odlike referentnog tipa.
		 * 
		 * Sintaksa za kreiranje: List <Tip vrednosti> ImeKolekcije = newKlasaKolekcije<
		 * Tip vrednosti>();
		 * 
		 * Prolazak kroz kolekciju List koristi se Iterator (list ili interface).
		 * Iteratori su standardni nacin u Javi da se prodje kroz sve clanove jedne
		 * kolekcije. Iterator je mehanizam koji omogucava da se sekvenicjalno prolazi
		 * kroz clanove kolekcije, pri cemu se izvrsava i odredjena operacija.
		 */

		/*
		 * PRIMER UPOTREBE kolekcije LIST na primeru njene implementacije kroz
		 * ArrayListu:
		 */

		// Kreiranje pocetnog niza stringovnog tipa (referentni tip)
		String voce[] = { "Jabuka", "Banana", "Visnja", "Tresnja", "Jagoda", "Limun", "Kivi", "Kruska" };

		// Kreiranje kolekcija
		List<String> ListaVoce = new ArrayList<String>();

		/*
		 * Napomena! Razlika je ako stavimo List na pocetku sinatkse i ArrayList. List
		 * je interfejs, dok je ArrayList samo klasa kolekcije.
		 */

		// Ubaciti sadrzaj iz niza u kolekciju upotrebom for-each petlje:
		for (String s : voce) {
			ListaVoce.add(s);
		}

		// Prolazak kroz listu upotrebom Iteratora
		Iterator<String> iter = ListaVoce.iterator();
		System.out.println("1 Kolekcija ListaVoce ARRAY LIST: ");
		// Upotreba metode "hasNext()"
		while (iter.hasNext()) {
			// upotreba metode "next()"
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n--------------------------");
		// Provera velicine liste - ugradjena metoda size();
		int velicina = ListaVoce.size();
		// - moze ovako jer je size CELOBROJNA VREDNOST
		System.out.println("Trenutna duzina: " + velicina);
		System.out.println("--------------------------");
		// Koriscenje ugradjene metode contains() za proveru da li se element nalazi u
		// listi
		boolean sadrzi = ListaVoce.contains("Kivi");
		// Ispitivanje sadrzaja promenljive:
		if (sadrzi) {
			System.out.println("Trazeni element Kivi SE nalazi u zadatoj kolekciji!");
		} else {
			System.out.println("Trazeni element Kivi se NE nalazi u zadatoj kolekciji!");
		}
		System.out.println("--------------------------");
		/*
		 * Ugradjena metoda get() vraca element SA ZADATIM INDEXOM. Dakle kaze koji
		 * element se nalazi pod tim indexom. SLuzi za dohvatanje elementa, jer ne
		 * mozemo preko [ ]. Idexiranje uvek krece od 0.
		 */
		String element = ListaVoce.get(2);
		System.out.println("Element sa indexom 2 u kolekciji je: " + element);
		System.out.println("--------------------------");
		/*
		 * Ugradjena metoda indexOf() vraca index PRVE POJAVE zadatog elementa
		 * kolekcije. AKo lista ne sadrzi taj element vratice -1
		 */
		int pozicija = ListaVoce.indexOf("Tresnja");
		System.out.println("Element Tresnja je na poziciji: " + pozicija);
		System.out.println("--------------------------");
		/* Metoda toArray() sluzi za konvertovanje kolekcije u niz. */
		// 1.Kreiranje novog niza tako da je duzina niza = kolekcija.velicina
		String niz2[] = new String[ListaVoce.size()];
		// 2.Prebacivanje - pomocu for each petlje
		ListaVoce.toArray(niz2);
		// 3. Prolazenje kroz niz uz pomoc FOR EACH petlje:
		System.out.println("Novi Niz: ");
		for (String s : niz2) {
			System.out.printf("%s ", s);
		}
		System.out.println("\n--------------------------");
		/* LinkedList: */
		// Novi niz mozemo da iskoristimo za popunjavanje primera LinkedListe
		List<String> LinkedVoce = new LinkedList<String>();

		for (String s : niz2) {
			LinkedVoce.add(s);
		}

		/*
		 * Za prolazak kroz linked listu koristimo LIST ITERATOR. Osnovna razlika
		 * zimedju Iteratora i ListIterarora je ta da ovde mozemo da idemo kroz listu U
		 * OBA SMERA.
		 */
		ListIterator<String> litr = LinkedVoce.listIterator();
		System.out.println("2 Kolekcija ListaVoce LINKED LIST:");
		System.out.println("Kretanje kroz linkedlistu od prvog do poslednjeg elementa:");
		while (litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println("\n--------------------------");
		System.out.println("Kretanje kroz linkedlistu od poslednjeg do prvog elementa:");
		// Dokle god mu postoji prethodni
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println("\n--------------------------");
// Proveravanje sadrzaja pojedinacnih elemenata
		boolean sadrziD = LinkedVoce.contains("Jagoda");
		System.out.println("Sadrzi li Jagodu: " + sadrziD);
		boolean sadrziE = LinkedVoce.contains("Kruska");
		System.out.println("Sadrzi li Krusku: " + sadrziE);
		System.out.println("--------------------------");
		// Pristupanje vrednostima elementa
		Object element0 = LinkedVoce.get(0);
		System.out.println("Element sa indexom 0: " + element0);
		Object element1 = LinkedVoce.get(1);
		System.out.println("Element sa indexom 1: " + element1);

		// Postavljanje nove vrednosti elementa na poziciji na kojoj je vec postojao
		// neki
		LinkedVoce.set(3, "Mandarina");

		// Metoda remove() za brisanje elementa preko njegovog indexa
		// Brisemo element Visnja
		LinkedVoce.remove(2);
		System.out.println("--------------------------");
		// Izgled Liste nakon brisanja:
		System.out.println("Izgled LinkedListe nakon brisanja Visnje:");
		ListIterator<String> liter = LinkedVoce.listIterator();
		while (liter.hasNext()) {
			System.out.print(liter.next() + " ");
		}

	}

}