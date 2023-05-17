package paket_prioritet;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a, "A");
		t.start();

		B b = new B("B");
		b.start();

		/*
		 * Parametrom nivo zadajemo nivo u brojčanom iznosu. Nivo prioriteta za nit za
		 * koju je metoda pozvana. Vrednost mora biti u opsegu 1 - 10; Konstante
		 * prioriteta su : MIN_PRIORITY = 1; MAX_PRIORITY = 10; Podrazumeva na vrednost
		 * po defaultu je 5. Ona se može zadati preko konstante NORM_PRIORITY.
		 */
		t.setPriority(Thread.MIN_PRIORITY + 2);
		b.setPriority(Thread.MAX_PRIORITY - 2);

	}

}
