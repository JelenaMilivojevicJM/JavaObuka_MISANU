package paket;

public class SporednaKlasa extends Thread {

	SporednaKlasa(String s) {
		super(s);
	}

	public void run() {
		System.out.println("Bravo!");
	}
}
