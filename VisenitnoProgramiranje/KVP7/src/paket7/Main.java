package paket7;

public class Main {

	public static void main(String[] args) {
		/*
		 * metoda isAlive() - utvrdjuje da li se nit josuvek izvrsava Metoda join() -
		 * ceka da se druga nit zvarsi
		 */

		A a1 = new A("Prva nit");
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());

		A a2 = new A("Druga nit");
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());

		A a3 = new A("Treca nit");
		System.out.println("Treca nit se izvrsava: " + a1.t.isAlive());

		try {
			a1.t.join();
			a2.t.join();
			a3.t.join();
		} catch (Exception e) {

		}
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
		System.out.println("Treca nit se izvrsava: " + a1.t.isAlive());

	}

}
