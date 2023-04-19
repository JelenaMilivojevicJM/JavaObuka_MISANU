package paket3;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a, "A");
		t.start();

		B b = new B("B");
		b.start();

		t.setPriority(Thread.MIN_PRIORITY + 2);
		b.setPriority(Thread.MAX_PRIORITY - 2);

	}

}
