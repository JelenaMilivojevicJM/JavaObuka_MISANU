package paket;

public class Main {
	/*
	 * Pomocu metode isAlive(); moze se postici utvrdjivanje da li se neka nit
	 * josuvek izvrsava. Pozivanje ove metode vrsimo u Main klasi. Oblikom:
	 * objekat.isAlive(); Rezultat ce vratiti TRUE ako se izvrsaca ili FALSE ako se
	 * vise ne izvrsava
	 */
	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a, "A");

		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());

	}

}
