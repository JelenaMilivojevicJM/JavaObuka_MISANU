package jelena.milivojevic;

//Import klsa Matcher i Pattern iz paketa java.util
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	/*
	 * Osnovno Teorijsko Objasnjenje REGEX-a: Regularni izrazi (Regular expressions
	 * ili REGEX) su sekvence karaktera (odnosno text - string) koje formiraju
	 * pretrazivacki obrazac tj search pattern. Kada pretrazujemo podatke u tekstu,
	 * mozemo koristiti ovaj pretrazivacki obrazac da opisemo tacno sta trazimo.
	 * 
	 * Regularni izraz moze biti jedan karakter ili komplikovaniji obrazac.
	 * 
	 * Regularni izrazi se mogu koristiti za izvodjenje svih vrsta pretrage teksta i
	 * operacija zamene teksta . Java nema ugradjenu klasu za regularne izraze, ali
	 * mozemo uvesti paket java.util.regex da bismo radili sa regularnim izrazima.
	 * Paket ukljucuje sledece klase: Klasa Pattern - Definise obrazac (za upotrebu
	 * u pretrazi), Klasa Matcher - Koristi se za pretragu/ poklapanje obrasca i
	 * Klasa PatternSyntaxException - Ukazuje na sintaksnu gresku u obrascu
	 * regularnog izraza.
	 * 
	 * JDK sadrzi poseban paket java.util.regex, posvecen operacijama sa regularnim
	 * izrazima. Samo ga treba importovati kod . Takodje, klasa java.lang.String ima
	 * ugradjenu podrsku za regex.
	 * 
	 */
	public static void main(String[] args) {

		// Sledi jednostavan primer upotrebe:

		// Kreirano string:
		String recenica = "Danas je lep dan!";

		/*
		 * Klasa `Pattern` nema javne konstruktore, tako da se objekat klase `Pattern`
		 * kreira pozivanjem staticke metode `compile` koja prima obrazac regularnog
		 * izraza kao argument. Kompajliranje obrasca regularnog izraza u objekat klase
		 * Pattern a pozivanjem njene metode compile(). Pomocu objekta klase Pattern iz
		 * paketa util.regex pripremamo njemu dodeljenu vrednost za proveru. Zapravo:
		 * Pretrazujemo da li je rec "lep" sadrzana u stringu. Takodje, oznaka
		 * CASE_INSENSITIVE je zapravo vrsta tzv ZASTAVICE. Zastavice (flags) se koriste
		 * u regularnim izrazima da promene nacin na koji se pretraga vrsi.
		 * CASE_INSENSITIVE se koristi da ignorise velicina slova prilikom pretrage.
		 * Zastavice se prosledjuju kao DRUGI PARAMETAR metode compile klase Pattern.
		 */
		Pattern obrazac = Pattern.compile("lep", Pattern.CASE_INSENSITIVE);

		/*
		 * Kreiramo i koristimo objekat klase Matcher kako bi nas kreirani obrazac
		 * pristupio metodi za pretragu i pretrazio parametar koji joj prosledjujemo.
		 * Dakle, bjekat klase Matcher se koristi za pretragu teksta pomocu obrasca
		 * regularnog izraza.
		 */
		Matcher poklapanje = obrazac.matcher(recenica);

		/*
		 * Kreiramo logicku promenljivu kojoj dodeljujemo vrednost rezultata pozivanja
		 * metode za pretragu od strane objekta klase Matcher - koja, kao sto joj i samo
		 * ime govori sluzi u svrhe pretrage poklapanja delova stringa u pretrazi
		 */
		boolean poklapanjeUspelo = poklapanje.find();

		// Koriscenje uslovnog grananja radi provere tacnosti uslova (da/ne)
		if (poklapanjeUspelo) {
			System.out.println("Poklapanje postoji!");
		} else {
			System.out.println("Poklapanje NE postoji!");
		}

		/*
		 * Dakle generalno gledano postupak je sledeci: 1. Prvo kreiramo objekat klase
		 * Pattern koji definise regularni izraz. - Ovaj objekat klase Pattern nam
		 * omogucava da kreiramo objekat klase Matcher za zadati string. 2. Kreiramo
		 * objekat klase Matcher za zadati string. - Ovaj objekat klase Matcher nam
		 * omogucava da izvrsavamo operacije sa regularnim izrazima nad stringom. 3.
		 * Izvrsavamo operacije sa regularnim izrazima nad prvobitno odredjenim
		 * stringom.
		 * 
		 * Zato, ovaj program trazi pojavljivanje reci lep u recenici Danas je lep dan!
		 * i vraca Poklapanje postoji! jer se rec pojavljuje u recenici
		 */
	}

}
