package paket1;

public class Vezbanje {

	public static void main(String[] args) {

		// Pristup trenutnoj niti
		Thread t = Thread.currentThread();

		// Prikaz koja je:
		System.out.println("Trenutna nit: " + t);

		// Prikaz imena niti
		System.out.println("Ime niti: " + t.getName());
		System.out.println("Ime niti (cela putanja): " + Thread.currentThread().getName());

		// Prikaz prioriteta niti
		System.out.println("Prioritet niti: " + t.getPriority());
		System.out.println("Prioritet niti(cela putanja): " + Thread.currentThread().getPriority());

	}

}
