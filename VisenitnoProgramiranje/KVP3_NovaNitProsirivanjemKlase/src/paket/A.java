package paket;

public class A extends Thread {
	/*
	 * Nit s emoze napraviti i kada klasu thread prosirimo novom nasledjenom klasom.
	 * A zatim napravimo instancu te klase (njen objekat). Nova potklassa mora da
	 * redefinise metodu run();
	 */

	// Konstruktor:
	A(String s) {
		super(s);
		// poziva konstruktor nastklase, Thread, oblika: public Thread(String imeNiti);
	}

	// Metoda run
	public void run() {
		;
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
	/**/
	/**/

}
