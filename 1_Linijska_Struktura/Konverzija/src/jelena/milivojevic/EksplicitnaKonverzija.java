package jelena.milivojevic;

public class EksplicitnaKonverzija {

	public static void main(String[] args) {
		/*
		 * Eksplicitna konverzija (uz gubitke) pretvara sa šireg na uži tip podatka
		 * (engl. Narrowing Casting). Mora da se uradi ručno stavljanjem odgovarajućeg
		 * tipa podatka u zagrade ispred vrednosti.
		 */

		// Inicijalizacija i deklaracija promenljive koja je sireg tipa
		double d = 10.82d;

		// Inicijalizacija i deklaracija promenljive koja je uzeg tipa
		// Eksplicitna konverzija se ovde prikazuje stavljanjem zeljenig tipa podatka u
		// zagradi ispred same vrednosti koju dodeljujemo novoj promenljivoj
		int i = (int) d;

		// Izlaz:
		System.out.println("d = " + d);
		System.out.println("i = " + i);
	}

}
