package paket_Radnik;

public class Main {
	public static void main(String[] args) {
		// Kreiranje radnika
		Radnik r1 = new Radnik("Pera", 100, 150000);
		Radnik r2 = new Radnik("Mika", 80, 12000);

		// Prihod

		System.out.println("Pera - prihod: " + r1.getPrihod());
		System.out.println("Mika - prihod: " + r2.getPrihod());

		// Plata
		System.out.println("Pera - plata: " + r1.racunajPlatu());
		System.out.println("Mika - plata: " + r2.racunajPlatu());

		// opis
		System.out.println("Ime/Plata: " + r1.opis());
		System.out.println("Ime/Plata: " + r2.opis());
	}
}
