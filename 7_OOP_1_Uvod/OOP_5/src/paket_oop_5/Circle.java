package paket_oop_5;

public class Circle {
	private double poluprecnik;

	// Pravljenje konstruktorA:
	// Ima isto ime kao i naziv klase
	Circle() {
		poluprecnik = 10.00;
	}

	// metoda kojom se racuna povrsina
	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}
}
