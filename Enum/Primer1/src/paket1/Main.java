package paket1;

public class Main {

	static void testPatka(Patka patka) {
		//Cilj ove metod je da omogucimo tetsiranje klase patka.
		//Preko nje cemo pozvati drugi metodu - metodu dizajn  paterna
		
		patka.kvace();
		patka.leti();
	}
	
	public static void main(String[] args) {
		
		// Pravimo objekte obe klase
		
		DivljaPatka patka = new DivljaPatka();
		
		Curka curka = new DivljaCurka();

		//Umotavanje Curku u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka
		//1.Korak:
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
		
		//Testiramo klasu Patka
		System.out.println("Patka: ");
		testPatka(patka);
		
		//Najbitniji deo: Maskiranje curke u patku - Poturiti curku kao patku
		System.out.println("AdapterCurka: ");
		testPatka(curkaAdapter);
		//ova metoda ne zna da je dobila curku prerusenu u patku
	}

}
