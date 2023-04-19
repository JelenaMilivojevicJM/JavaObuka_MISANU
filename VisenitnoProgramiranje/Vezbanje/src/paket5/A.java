package paket5;

public class A extends Thread {

	A(String s) {
		super(s);
	}

	public void run() {
		int i = 1;
		while (i < 5) {
			System.out.println("Bravo!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Nit je prikinuta. Desio se izuzetak!" + e);
			}
			i++;
		}
		System.out.println("Kraj!");
	}
}
