package paket_k1;

public class BoxGlavna {

	public static void main(String[] args) {
		// Rad sa dva objekta

		Box b1 = new Box();
		Box b2 = new Box();
		
		//Dodeljivanje vrednosti poljima
		b1.width=10;
		b1.heigth=15;
		b1.depth=20;
		
		b2.width=5;
		b2.heigth=6;
		b2.depth=7;
		
		//Racunanje zapremine
		double vol1;
		double vol2;
		
		vol1 = b1.width*b1.heigth*b1.depth;
		vol2 = b2.width*b2.heigth*b2.depth;
		
		//Izlaz
		System.out.println("Zapremina B1 je: "+vol1);
		System.out.println("Zapremina B2 je: "+vol2);
		
	}
}
