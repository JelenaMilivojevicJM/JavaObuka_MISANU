package paket6;

public class A implements Runnable {

	public void run() {
		int i = 1;
		while (i < 5) {
			System.out.println("Bravo!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Izuzetak!" + e);
			}
			i++;
		}
		System.out.println("Kraj!");
	}
}
