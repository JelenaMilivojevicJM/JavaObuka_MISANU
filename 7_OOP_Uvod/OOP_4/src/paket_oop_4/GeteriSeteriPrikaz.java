package paket_oop_4;

public class GeteriSeteriPrikaz {

	public static void main(String[] args) {
		// Prikaz pozivanja getera i setera

		// 1.Kreiranje objekta klase
		A objekat = new A();

		// 2.postavljanje vrednosti
		objekat.setMessage("Vrednost1");

		// 3.Poziv i dobavljanje vrednosti
		System.out.println("Postavljena je vrednost: " + objekat.getMessage());
	}

}
