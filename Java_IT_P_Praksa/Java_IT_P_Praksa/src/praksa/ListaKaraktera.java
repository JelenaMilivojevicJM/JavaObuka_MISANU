package praksa;

//Uvoy paketa potrebnih za kreiranje liste karaktera
import java.util.ArrayList;
import java.util.List;

/* Interface ListaKaraktera koji služi za učitavanje karaktera iz fajla,
 * kreiranje niza karaktera, po osnovu njihovih atributa (polja)
 *  koji su deo definicije konstruktora klase Karakter*/
public interface ListaKaraktera {

	// Metoda za učitavanje karaktera (učitava ih iz fajla au niz)
	public static List<Karakter> ucitajKaraktere() {
		/*
		 * Implementacija klase FileHelmper i Učitavanje meta podataka. Pozivamo metodu
		 * loadMetaData() da bi se učitali meta podaci.
		 */
		String metaData = FileHelper.loadMetaData();

		/*
		 * Kreiramo niz Stringova pod nazivom "lines" i dodeljujemo mu vrednost
		 * rezultata pozivanja metode "split()" preko već kreiranje String
		 * promenljive(varijable) pod nazivom "metaData". Metoda "split()" ima delimiter
		 * kao argument i deli promenljivu "metaData" na niz podstringova na svakom
		 * pojavljivanju delimitera. U ovom slučaju, delimiter je
		 * "System.lineSeparator()", koji vraća sistemski zavisan string separatora
		 * linija. Dakle, varijabla "metaData" deli se na odvojene linije na osnovu
		 * separatora linija sistema. To nam je bitno, jer nam sluzi da prolazimo kroz
		 * sve linije počevši od druge (prva linija sadrži zaglavlje). Svaka linija se
		 * deli na delove pomoću ove metode split(", "). Delovi se koriste za kreiranje
		 * liste objekta klase Karakter koji se dodaje u listu karaktera.
		 */

		String[] lines = metaData.split(System.lineSeparator());

		// Lista karaktera
		List<Karakter> karakteri = new ArrayList<>();
		for (int i = 1; i < lines.length; i++) {
			String[] parts = lines[i].split(", ");
			String name = parts[0];
			String allegiance = parts[1];
			String messagesFile = parts[2];
			// Objekat klase Karakter sa poljima kao argumentima konstruktora
			Karakter karakter = new Karakter(name, allegiance, messagesFile);
			// Dodavanje karaktera u listu
			karakteri.add(karakter);
		}
		return karakteri;
	}

}
