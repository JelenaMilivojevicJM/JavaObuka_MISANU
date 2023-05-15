package paket_k3;

public class BoxMain {
	public static void main(String[] args) {
		// Kreiranje objekata
		Box b1 = new Box();
		Box b2 = new Box();
		
		// Poziv metode za objekte
		b1.initBox16(10, 15, 20);
		b2.initBox16(5, 6, 7);
		
		System.out.println("Zapremina je: ");
	}
}
