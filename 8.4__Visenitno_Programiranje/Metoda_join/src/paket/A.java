package paket;

public class A implements Runnable {

	String ime; // Ime niti
	Thread t;

	A(String name) { // A je nova nit
		ime = name;
		t = new Thread(this, ime);
		t.start();
	}

	public void run() {

		try {
		for (int i = 1; i <= 5; i++) {
			System.out.println(ime + " = " + i);
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
