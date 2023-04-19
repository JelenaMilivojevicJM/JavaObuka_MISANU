package metodaUnutarKlase;

public class BoxMain {

	public static void main(String[] args) {
		// Rad sa dva objekta
		Box b1 = new Box();
		Box b2 = new Box();

		// Dodeljivanje vrednosti poljima
		b1.width = 10;
		b1.heigth = 15;
		b1.depth = 20;

		b2.width = 5;
		b2.heigth = 6;
		b2.depth = 7;

		// Pozivanje metode za date objekte
		b1.volume();
		b2.volume();

	}

}
