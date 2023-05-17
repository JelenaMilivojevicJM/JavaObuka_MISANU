package paket;

public class Main {
	public static void main(String[] args) {

		A a1 = new A("Prva nit");
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());

		A a2 = new A("Druga nit");
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());

		/*
		 * Pomocu metode join(); moze se postici postavljanje jedne niti na cekanje dok
		 * se druga zavrsi. Pozivanje ove metode vrsimo u Main klasi oblikom:
		 * objekat.join();
		 */
		try {
			a1.t.join();
			a2.t.join();

		} catch (Exception e) {

		}
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
	}
}
