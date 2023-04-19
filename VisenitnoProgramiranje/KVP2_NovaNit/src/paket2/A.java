package paket2;

public class A implements Runnable {
//Koristimo ovu dodatnu klasu je za potrebe pravljenja nove niti upotrebom prvog nacina

	/*
	 * Nit se moze napraviti za svaki objekat koji implementira interface
	 * Runnable**. Da bi klasa implementirala intefrejs Runnable, potrebno je samo
	 * da ima metodu run(). Ova metoda je deklarisana u sledecem obliku: public void
	 * run(); U ovoj metodi zadajemo kod koji treba da se izvrsava u novoj niti.
	 * Kada se izvrsi metoda run(), nit biva unistena.
	 */

	public void run() {
		// Mesto za kod koji ce se izvrsavati u posebnoj niti

		// Primer koda koji ce se izvrsavati u novoj niti
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
