package paket_novaNit;

/*Nit se moze napraviti i kada klasu thread prosirimo novom nasledjenom klasom.
A zatim napravimo instancu te klase (njen objekat).
Nova potklassa mora da redefinise metodu run();*/

public class AA extends Thread {

	// Konstruktor:
	public AA(String s) {
		super(s);
		// Konstruktor nastklase, Thread, ima oblik: public Thread(String imeNiti);
	}

	// Metoda run
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}
