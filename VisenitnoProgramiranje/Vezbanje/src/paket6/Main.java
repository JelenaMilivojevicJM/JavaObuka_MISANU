package paket6;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a, "A");

		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());

	}

}
