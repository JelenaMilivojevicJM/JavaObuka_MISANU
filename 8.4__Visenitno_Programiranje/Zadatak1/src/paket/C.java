package paket;
public class C extends Thread {
	C(String s) {
		super(s);
	}

	public void run() {
		;
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}