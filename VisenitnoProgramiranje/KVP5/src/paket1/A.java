package paket1;

public class A extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nit A: " + i);
		}
		System.out.println("Kraj izvrsavanja Niti A: ");
	}
}
