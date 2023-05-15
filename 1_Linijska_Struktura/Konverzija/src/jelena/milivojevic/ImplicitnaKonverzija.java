package jelena.milivojevic;

public class ImplicitnaKonverzija {

	public static void main(String[] args) {
		/*
		 * Napisati kod koji prikazuje implicitnu konverziju, tj automatsko pretvaranje
		 * sa užeg na širi tip podataka (engl. Widening Casting)
		 */

		/*
		 * Ako su dva tipa podatka kompatibilna, Java će sama izvršiti automatsku
		 * konverziju koja se zove implicitna konverzija tipa.
		 */

		// Inicijalizacija i Deklaracija promenljivih
		// Uzi tip podatka - int
		int i = 10;
		// Siri tip podatka - double
		// Automatsko pretravanje iz uzeg u sire (iz manjeg u vece)
		double d = i;

		// Izlaz:
		System.out.println("i = " + i);
		System.out.println("d = " + d);
	}

}
