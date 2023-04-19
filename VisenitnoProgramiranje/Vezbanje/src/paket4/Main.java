package paket4;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a, "A");
		t.start();
	}

}
