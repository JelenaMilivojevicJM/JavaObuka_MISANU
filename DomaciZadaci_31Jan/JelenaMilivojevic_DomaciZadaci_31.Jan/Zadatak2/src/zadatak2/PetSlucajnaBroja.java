package zadatak2;

//Importovanje paketa java.lang koji sadrzi klasu Radnom
import java.util.Random;

public class PetSlucajnaBroja {

	public static void main(String[] args) {
		/*
		 * TEKST ZADATKA: 2. Napisati program koji generiše i ispisuje pet slučajna
		 * broja celobrojnog tipa
		 */

		// Resenje: Upotreba objekta klase Random i njegove metode nextIne();

		// Ulaz: Kreiranje objekta klase Random
		Random randBr = new Random();

		// Obrada+Izlaz: Upotreba for petlje radi ponavljanja naredbi ispisa brojeva
		for (int i = 0; i < 5; i++) {

			System.out.println((i + 1) + ". broj: " + randBr.nextInt(101) + " ");
			/*
			 * Pozivanje metode nextInt() koja je metoda objekta klase Radnom. Naznacen
			 * argument - broj 101 u zagradi je opseg do kog zelimo da ide ispisivanje
			 * nasumicnih brojeva. Posto metode nextInt()krece od broja 0, kao uslov
			 * stavljamo 101 ako zelimo da uracuna i broj 100.
			 */
		}
	}

}
