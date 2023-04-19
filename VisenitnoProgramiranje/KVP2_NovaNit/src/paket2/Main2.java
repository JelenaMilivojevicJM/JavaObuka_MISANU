package paket2;

public class Main2 {

	public static void main(String[] args) {
		// Postupak pokretanja nove niti:

		/*
		 * Za kreiranje nove niti moramo kreitati isntacu Thread-a. Novu nit pokrecemo
		 * tako sto naoravimo instancu objekta tipa Thread. To se moze uraditi na dva
		 * nacina. 1.nacin: Implementacija interfejsa Runnable (u ovom prijektu)
		 * 2.nacin: Prosirivanjem klase Thread. (U sledecem projektu)
		 */

		/*
		 * Ovde, u main klasi:
		 */

		A a = new A();// **Objekat koji implemnetira taj interface

		/*
		 * Nakon kreiranja klase koja implementura interface Runnable, potrebno je
		 * napraviti instancu objekta tipa Thread. Oblik konstruktora klase Thread:
		 * Thread(Runnable objektaNit, String imeNiti); objektaNit - instanca klase koja
		 * implementira interface Runnable. Ona definise mesto gde pocinje nit.
		 * objektaNit - predastavlja ime nove niti (koje mi kreiramo)
		 */
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");

		/*
		 * Metoda za pokretanje novih niti koje smo napravili /Ova metoda zapravo poziva
		 * metodu run(); /*run kaze STA ce se izvrsavati. Dok metoda start predtsavlja
		 * mesto GDE startujemo i ona odredjuje KADA ce se izvrsavati.
		 */
		t1.start();
		t2.start();
		t3.start();

		// OV DE IMAMO 4 niti, jer smo naporavili tri nove a 4.-ta je glavna nit
		// Pokazivanje koliko jezgara ima:
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
