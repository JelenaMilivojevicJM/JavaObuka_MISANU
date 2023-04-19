package konstruktori1;

public class BoxMain {

	public static void main(String[] args) {
		// Kreiranje objekta 
		Box b1 = new Box();
		
		//Dodeljivanje vrednosti atributima objekta
		b1.sirina=10;
		b1.visina=15;
		b1.dubina=20;
		
		//Racunanje zapremine
		double zapremina;
		
		zapremina = b1.sirina * b1.visina *b1.dubina;
		
		//Izlaz
		System.out.println("Zapremina je: "+zapremina);
	}

}
