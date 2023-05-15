package paket;

public class Main {
	public static void main(String[] args) {
		try {
			int a = 2;
			int b = 10 / a;
			System.out.println("a = " + a);

			try {
				if (a == 1) {
					a = a / (a - 1);
				}
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				// Unutrasnji catch blok
				System.out.println("Greska s indexom. " + e);
			}
		} catch (ArithmeticException e) {
			// Spoljasnji catch blok
			System.out.println("Greska prilikom deljenja. " + e);
		}
	}
}
