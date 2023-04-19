package jelena.milivojevic;

public class Overloading {
	public static double zbir(double x, double y) {
		return x + y;
	}

	public static int zbir(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		/*
		 * Napisati metode za izračunavanje zbira dva cela i dva realna broja. U glavnom
		 * programu izvršiti poziv metode za sabiranje dva cela broja 3 i 4 i dva realna
		 * broja 2.3 i 4.5.
		 */
		double x = 2.3, y = 4.5;
		int a = 3, b = 4;
		System.out.println("Poziv za podatke tipa double: " + zbir(x, y));
		System.out.println("Poziv za podatke tipa int: " + zbir(a, b));

	}

}
