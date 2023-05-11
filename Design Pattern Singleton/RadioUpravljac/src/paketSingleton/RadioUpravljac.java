package paketSingleton;

/*Singleton Desdign  Pattern (obrazac dizajna) je obrazac koji se koristi kada želimo da osiguramo da postoji samo jedna instanca neke
klase i da ta instanca bude globalno dostupna. Ovaj obrazac se često koristi za upravljanje resursima koji su
deljeni između više delova aplikacije, kao što su konekcije sa bazom podataka ili konfiguracioni fajlovi.
Koristi se za kontrolu pristupa nekom deljenom resursu, na primer bazi podataka ili datoteci.
Prednost Singleton-a: Štedi memoriju jer se objekat ne kreira na svaki zahtev.
Samo jedna instanca se ponovo koristi iznova i iznova.
Postoji nekoliko načina za implementaciju Singleton obrasca u Javi, uključujući korišćenje obične klase sa privatnim konstruktorom i statičkim poljem koje sadrži njegovu jedinu instancu ili korišćenje enumeracije.
Implementacija Singleton obrasca dizajna uključuje nekoliko koraka:
1. Dodavanje privatnog statičkog atributa u klasu koji će čuvati jedinstvenu instancu klase.
2. Dodavanje privatnog konstruktora koji sprečava direktno instanciranje objekata ove klase.
3. Dodavanje javne statičke metode koja vraća jedinstvenu instancu klase. Ova metoda proverava da li je
instanca već kreirana i ako nije, kreira je.
 */

public class RadioUpravljac {
	// Statička promenljiva koja čuva jedinstvenu instancu klase
	private static RadioUpravljac instance;

	// Promenljive koje predstavljaju jačinu zvuka i izabranu radio stanicu
	private int jacinaZvuka;
	private String radioStanica;

	// Privatni konstruktor koji sprečava direktno instanciranje objekata ove klase
	private RadioUpravljac() {
		// Inicijalizacija promenljivih na početne vrednosti
		jacinaZvuka = 0;
		radioStanica = "";
	}

	// Statička metoda koja vraća jedinstvenu instancu klase
	public static RadioUpravljac getInstance() {
		// Provera da li je instanca već kreirana
		if (instance == null) {
			// Ako nije, kreiraj novu instancu
			instance = new RadioUpravljac();
		}
		// Vrati instancu
		return instance;
	}

	// Metoda za podešavanje jačine zvuka
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	// Metoda za dobijanje trenutne jačine zvuka
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	// Metoda za izbor radio stanice
	public void setRadioStation(String radioStanica) {
		this.radioStanica = radioStanica;
	}

	// Metoda za dobijanje trenutno izabrane radio stanice
	public String getRadioStanica() {
		return radioStanica;
	}
}
