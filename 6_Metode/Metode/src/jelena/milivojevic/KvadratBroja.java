package jelena.milivojevic;

public class KvadratBroja {
	public static int kvadratBroja(int x) {
		return x * x;
	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu za izračunavanje kvadrata celog broja. U glavnom programu
		 * pozvati ovu metodu sa parametrom 10.
		 */
		int x = 10;
		System.out.println("Kvadrat broja " + x + " je " + kvadratBroja(x));
	}

}
