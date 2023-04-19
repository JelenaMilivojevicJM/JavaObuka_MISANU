package pkt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestiraDeljivost broj = (n, d) -> (n % d) == 0;

		// Ispsitivanje
		if (broj.testBr(10, 5)) {
			System.out.println("Jeste deljiv");
		} else {
			System.out.println("Nije deljiv");
		}
	}

}
