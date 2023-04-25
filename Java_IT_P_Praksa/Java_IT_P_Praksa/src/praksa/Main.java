package praksa;

//Uvoz paketa potrebnih za realizaciju programa:
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pokretačka klasa "Main":
public class Main {
	// main metoda pokretačke klase:
	public static void main(String[] args) {
		// ULAZ:
		/*
		 * Implementacija klase FileHelmper i Učitavanje meta podataka. Pozivamo metodu
		 * loadMetaData() da bi se učitali meta podaci.
		 */
		String metaData = FileHelper.loadMetaData();

		/*
		 * Kreiramo niz Stringova pod nazivom "lines" i dodeljujemo mu vrednost
		 * rezultata pozivanja metode "split()" preko vec kreiranje String varijable pod
		 * nazivom "metaData". Metoda "split()" ima delimiter kao argument i deli
		 * promenljivu "metaData" na niz podstringova na svakom pojavljivanju
		 * delimitera. U ovom slučaju, delimiter je "System.lineSeparator()", koji vraća
		 * sistemski zavisan string separatora linija. Dakle, varijabla "metaData" deli
		 * se na odvojene linije na osnovu separatora linija sistema. To nam je bitno,
		 * jer nam sluzi da prolazimo kroz sve linije počevši od druge (prva linija
		 * sadrži zaglavlje). Svaka linija se deli na delove pomoću ove metode
		 * split(", "). Delovi se koriste za kreiranje liste objekta klase Karakter koji
		 * se dodaje u listu karaktera.
		 */
		String[] lines = metaData.split(System.lineSeparator());
		// OBRADA 1:
		// Kreiranje liste objekata klase Karakter
		List<Karakter> karakteri = new ArrayList<>();
		for (int i = 1; i < lines.length; i++) {
			String[] parts = lines[i].split(", ");
			String name = parts[0];
			String allegiance = parts[1];
			String messagesFile = parts[2];
			Karakter karakter = new Karakter(name, allegiance, messagesFile);
			karakteri.add(karakter);
		}

		// IZLAZ 1:
		// Ispisivanje podataka o svim karakterima
		System.out.println("--------------------------------------------------");
		System.out.println("*Svi učesnici u konverzacijama*");
		System.out.println("Ime Prezime  -  Kuća ");
		/*
		 * Upotrebom for-each petlje prolazimo kroz sve karaktere i ispisujemo njihova
		 * imena i kuće kojima pripadaju
		 */
		for (Karakter karakter : karakteri) {
			System.out.println(karakter.getName() + " - " + karakter.getAllegiance());
		}
		System.out.println("--------------------------------------------------");
		// 2. Одштампајте све поруке особе Daenerys
		// OBRADA 2:
		System.out.println("*Sve poruke osobe Daenerys(iz njenog chat-a)*");
		/*
		 * Kreiranje liste u koju učitavamo sve poruke osobe Daenerys - iz fajla
		 * "messages82387561293.txt" U pomoć pozivamo klasu FileHelper kako bismo preko
		 * njene metode loadMessages() učitali podatke iz konkretnog fajla u kome su
		 * poruke osobe Daenerys. Kao stvarni argument (parametar) ove metode koristimo
		 * ime konkretnog fajla iz kojeg želimo da učitamo podatke (u ovom slučaju to je
		 * fajl sa podacima iy Denerisinog četa).
		 */
		List<String> porukeDaenerys = FileHelper.loadMessages("messages82387561293.txt");
		// Koristeći se for-each petljom prolazimo kroz poruke i ispisujemo ih
		for (String pD : porukeDaenerys) {
			// IZLAZ 2:
			System.out.println(pD);

		}
		System.out.println("--------------------------------------------------");

		// 3.Креирајте обавештење које приказује број порука који се сваки карактер
		// послао.
		// Ispisivanje broja poruka za svakog karaktera
		System.out.println("*Broj poslatih poruka svakog učesnika*");
		System.out.println("Učesnik : Ukupan broj poruka ");
		// OBRADA 3:
		for (Karakter karakter : karakteri) {
			/*
			 * Kreiramo listu poruka. Za učitavanje podataka ponovo koristimo klasu
			 * FileHelper i njenu metodu loadMessages(). Parametar ove metode je metoda
			 * klase Karakter koja služi za dohvatanje vrednosti polja messagesFile.
			 */
			List<String> poruke = FileHelper.loadMessages(karakter.getMessagesFile());
			// IZLAZ 3:
			System.out.println(karakter.getName() + " : " + poruke.size() + " poruka");
		}

		System.out.println("--------------------------------------------------");
		/* Elementi koda koji nam trebaju za resavanje 4.,5. i 6.stavke */

		// Definisanje regularnih izraza (REGEX) za smajlije
		// Svi smajlili iz grupe "srećni smajliji" (ovde su i ljubavni smajliji)
		Pattern happyPattern = Pattern.compile("🙂");
		Pattern happy2Pattern = Pattern.compile("😄");
		Pattern lovePattern = Pattern.compile("😍");
		Pattern kissPattern = Pattern.compile("😘");

		// Svi smajlili iz grupe "tužni smajliji"
		Pattern sadPattern = Pattern.compile("😞");
		Pattern suzaPattern = Pattern.compile("😢");
		Pattern madPattern = Pattern.compile("👿");
		Pattern placPattern = Pattern.compile("😭");

		// 4. Урадити анализу карактера, бројећи њихову употребу смајлија:
		// 5. Одштампати карактер који има најпозитивнију и најнегативнију диспозицију.
		Karakter najpozitivnijiKarakter = null;
		int najpozBrojac = 0;
		Karakter najnegativnijiKarakter = null;
		int najnegBrojac = 0;
		// Analiza karaktera sa proverom odnosa broja svih happy/sad smajlija
		System.out.println("*Koji učesnik je koliko srećnih/tužnih smajlija poslao*");
		System.out.println("Učesnik [ Broj srećnih smajlijia: , Broj tužnih smajlija ]");
		for (Karakter karakter : karakteri) {
			List<String> poruke = FileHelper.loadMessages(karakter.getMessagesFile());
			int happyBrojac = 0;
			int sadBrojac = 0;
			for (String p : poruke) {
				Matcher happyMatcher = happyPattern.matcher(p);
				Matcher happy2Matcher = happy2Pattern.matcher(p);
				Matcher loveMatcher = lovePattern.matcher(p);
				Matcher kissMatcher = kissPattern.matcher(p);
				// OBRADA 4:
				/*
				 * Program prolazi kroz while pretlju i povećava brojač srećnih smjalija za 1,
				 * sve dok postoji poklapanje sa nekim od smajlija iz grupe srećnih smajlija.
				 */
				while (happyMatcher.find() || happy2Matcher.find() || loveMatcher.find() || kissMatcher.find()) {
					happyBrojac++;
				}
				Matcher suzaMatcher = suzaPattern.matcher(p);
				Matcher madMatcher = madPattern.matcher(p);
				Matcher placMatcher = placPattern.matcher(p);
				Matcher sadMatcher = sadPattern.matcher(p);
				/*
				 * Program prolazi kroz while pretlju i povećava brojač tužnih smjalija za 1,
				 * sve dok postoji poklapanje sa nekim od smajlija iz grupe tužnih smajlija.
				 */
				while (suzaMatcher.find() || madMatcher.find() || placMatcher.find() || sadMatcher.find()) {
					sadBrojac++;
				}
			}
			// IZLAZ 4:
			System.out
					.println(karakter.getName() + " [ " + " srećnih: " + happyBrojac + ", tužnih: " + sadBrojac + " ]");
			// OBRADA 5:
			/*
			 * Ispitivanje uslova za stavku broj 5 Broj pronađenih smajlija sabiramo i
			 * proveravamo da li je karakter sa najpozitivnijom ili najnegativnijom
			 * dispozicijom. Na kraju se ispisuju imena karaktera sa najpozitivnijom i
			 * najnegativnijom dispozicijom.
			 */
			if (happyBrojac - sadBrojac > najpozBrojac) {
				najpozitivnijiKarakter = karakter;
				najpozBrojac = happyBrojac - sadBrojac;
			}
			if (sadBrojac - happyBrojac > najnegBrojac) {
				najnegativnijiKarakter = karakter;
				najnegBrojac = sadBrojac - happyBrojac;
			}
		}
		System.out.println("--------------------------------------------------");
		// IZLAZ 5:
		// Ispisivanje rezultata za stavku broj 5:
		System.out.println("*Najsrećniji vs. Najtužniji*");
		System.out.println("Karakter sa najpozitivnijom dispozicijom: " + najpozitivnijiKarakter.getName());
		System.out.println("Karakter sa najnegativnijom dispozicijom: " + najnegativnijiKarakter.getName());
		System.out.println("--------------------------------------------------");
		System.out.println("*Ko koga više voli*");
		// 6.Да ли Jon воли Daenerys више него што она воли њега.
		/*
		 * Logika rešavanja stavke broj 6: Ako u Daenerysinom chatu ima više ljubavnih
		 * smajlija, dakle primila je više takvih poruka, znači da Jon više voli nju
		 * nego ona njega (jer on dakle poslao njoj više takvih), i obrnuto.
		 */

		// OBRADA 6:
		// Uporedna analiza (Ko koga više voli):
		/*
		 * !! U delu OBRADA 2 kreirali smo listu porukeDaenerys tako da i u svrhe
		 * uporedne analize ovde koristimo se istom tom listom uz dodavanje nove lite
		 * koja je chat Jon-a !!
		 */
		/*
		 * !! U delu PRE OBRADA 4 i OBRADA 5 kreirali smo promenljive koje
		 * predstsavljaju regex-e koje koristimo za analizu i u ovoj 6.stavci.
		 */

		List<String> porukeJon = FileHelper.loadMessages("messages2094721612573.txt");
		int brojacJon = 0;
		int brojacDaenerys = 0;
		for (Karakter k : karakteri) {
			// FOR petlja koju koristimo za prolazak kroz Jonov chat
			for (String p : porukeJon) {
				// ljubavni smajliji
				Matcher loveMatcher = lovePattern.matcher(p);
				Matcher kissMatcher = kissPattern.matcher(p);
				/*
				 * Program prolazi kroz while pretlju i povećava brojač ljubavnih smjalija kod
				 * Jon-a za 1, sve dok postoji poklapanje sa nekim od smajlija iz grupe
				 * ljubavnih smajlija.
				 */
				while (loveMatcher.find() || kissMatcher.find()) {
					brojacJon++;
				}
			}
			// FOR petlja koju koristimo za prolazak kroz Daenerys-in chat
			for (String p : porukeDaenerys) {
				// ljubavni smajliji
				Matcher loveMatcher = lovePattern.matcher(p);
				Matcher kissMatcher = kissPattern.matcher(p);
				/*
				 * Program prolazi kroz while pretlju i povećava brojač ljubavnih smjalija kod
				 * Daenerys za 1, sve dok postoji poklapanje sa nekim od smajlija iz grupe
				 * ljubavnih smajlija.
				 */
				while (loveMatcher.find() || kissMatcher.find()) {
					brojacDaenerys++;
				}
			}
		}

		// IZLAZ 6:
		if (brojacDaenerys > brojacJon) {
			System.out.println("Jon više voli Daenerys nego ona njega!");
		} else {
			System.out.println("Daenerys više voli Jon-a nego on nju!");
		}
	}
}
