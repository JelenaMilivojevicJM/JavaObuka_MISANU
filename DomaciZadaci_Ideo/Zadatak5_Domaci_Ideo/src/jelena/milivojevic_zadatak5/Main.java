package jelena.milivojevic_zadatak5;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Resenje: Primer ucitavanja 5 imena ljudi:

		// Ucitavanje vrednosti sa konzole:
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 5 licnih imena: ");
		System.out.println("Ime 1: ");
		String ime1 = sc.nextLine();
		System.out.println("Ime 2: ");
		String ime2 = sc.nextLine();
		System.out.println("Ime 3: ");
		String ime3 = sc.nextLine();
		System.out.println("Ime 4: ");
		String ime4 = sc.nextLine();
		System.out.println("Ime 5: ");
		String ime5 = sc.nextLine();

		// Kreiranje niza ucitanih vrednosti licnih imena
		String nizImena[] = { ime1, ime2, ime3, ime4, ime5 };

		// Kreiranje kolekcije licnih imena
		List<String> kolekcijaImena = new LinkedList<String>();

		// Ubacivanje elemenata iz niza u kolekciju
		for (String s : nizImena) {
			kolekcijaImena.add(s);
		}
		// Prolazak kroz kolekciju pomocu List Iteratora + ispis kolekcije napred i nazad:
		
		ListIterator<String> listitr = kolekcijaImena.listIterator();
		
		//Kolekcija od prvog ka poslednjem elementu:
		System.out.println("Kolekcija od prvog ka poslednjem elementu::");
		while (listitr.hasNext()) {
			System.out.print(listitr.next() + " ");
		}
		//Kolekcija od poslednjeg ka prvom elementu:
		System.out.println("\nKolekcija od poslednjeg ka prvom elementu:");
		while (listitr.hasPrevious()) {
			System.out.print(listitr.previous() + " ");
		}
		
		sc.close();
	}

}
