package paket1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();

		/*
		 * Prioritet izvrsavanja odredjene niti: Kada odjredjenoj niti zelimo da dodamo
		 * prioritet prilikom izvrasavanja, pozivamo metodu setPriority(); kopja je clan
		 * klase Thread; Opsti oblik ovd emetode: void setPriority(nivo); Parametrom
		 * nivo zadajemo nivo u brojcanom iznosu. Nivo prioriteta za nit za koju je
		 * metoda pozvana. Vrednost mora biti u opsegu 1 - 10; Konstante prioriteta su
		 * MIN_PRIORITY = 1; MAX_PRIORITY = 10; Podrazumeva na vrednost po defaultu je
		 * 5. Ona se moze zadati preko konstante NORM_PRIORITY.
		 */

		a.setPriority(Thread.MAX_PRIORITY - 5);// 10-5
		b.setPriority(Thread.MIN_PRIORITY + 8);// 1+8

		a.start();
		b.start();
	}

}
