package paket;

public class B extends Thread {
	B(String s) {
		super(s);
	}

	public void run() {
		;
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}
