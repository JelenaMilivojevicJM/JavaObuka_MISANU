package paketprimr2;

public class Main {

	public static void main(String[] args) {
		// Multi Catch Blok
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;

			int c[] = { 1, 2, 3, 4, 5, 6 };
			c[10] = 100;

		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci Index unutar datog niza.");
		}

		System.out.println("Program nastavlja sa radom");
	}
}
