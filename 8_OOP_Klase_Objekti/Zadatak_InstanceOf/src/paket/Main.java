package paket;

public class Main {
//InstanceOf Prikaz
	public static void main(String[] args) {
		// KREIranje objekata - u trenutku pozivanja iz klase
		ABC a = new ABC();
		XYZ x = new XYZ();

		// Pojam: Instamceof - kljucna rec
		// if(ime_objekta instanceof ime_klase)
		if (a instanceof ABC) {
			System.out.println("a JESTE instanca klase ABC");
		} else {
			System.out.println("a NIJE instanca klase ABC");
		}

		if (x instanceof XYZ) {
			System.out.println("x JESTE instanca klase XYZ");
		} else {
			System.out.println("x NIJE instanca klase XYZ");

		}
	}
}
