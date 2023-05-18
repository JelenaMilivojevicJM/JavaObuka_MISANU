package paket;

public class Main {
	static void testPatka(Patka patka) {
		/*
		 * Cilj ove metod je da omogucimo tetsiranje klase patka. Preko nje cemo pozvati
		 * drugi metodu - metodu dizajn paterna
		 */
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {
		// Pravimo objekte obe klase
		DivljaPatka patka = new DivljaPatka();
		DivljaCurka curka = new DivljaCurka();

		/* Umotavamo Curku u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka */
		Patka curkaAdapter = new CurkaAdapter(curka);

		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
		
		//Testiramo klasu Patka
		System.out.println("Patka: ");
		testPatka(patka);
		
		//Najbitniji deo: Maskiranje curke u patku - Poturiti curku kao patku
		/* Pokusavamo da poturimo Curku kao Patku */
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter); /* ne zna da je dobila Curku prerusenu u Patku */
	}

}
