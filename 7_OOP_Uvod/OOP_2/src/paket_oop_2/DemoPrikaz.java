package paket_oop_2;

//Ovo je glavna - POKRETACKA klasa
public class DemoPrikaz {

	public static void main(String[] args) {

		// Kreiranje novog objekta unutar klase rastojanje, dodavanje nove instance
		// objekta:
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();

		// Dodeljivanje vrednostima podacima objekata
		r1.stopala = 14;

		// r1 je objekata
		// inci je pdoatak
		// vren=dnost je ono posle=
		r1.inci = 9.5;

		// Dodeljivanje vrednosti drugom objekti
		// r2 drugi objekat klase
		// stoapala podatak
		r2.stopala = 19;
		r2.inci = 5.5;

		// Ispis vrednosti koje smo upisali unutar objekata r1 i r2
		// stoapala i inci su podaci koje smo dodeljivali objektima
		// vrednosti smo dodeljivali podacima
		System.out.println("Rastojanje 1: " + r1.stopala + "\'-" + r1.inci + "\" ");
		System.out.println("Rastojanje 2: " + r2.stopala + "\'-" + r2.inci + "\" ");
	}
}