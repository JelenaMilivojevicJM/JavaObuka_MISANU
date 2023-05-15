package paket_OOP_8;

public class Main {

	public static void main(String[] args) {

		// Objekat kao parametar konstruktora

		Krug k1 = new Krug(20);

		calcArea(k1);
	}

	public static void calcArea(Krug k) {
		System.out.println("Povrsina kruga: " + k.area());
	}
}
