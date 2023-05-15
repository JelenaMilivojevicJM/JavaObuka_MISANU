package paket;

public class Main {

	public static void main(String[] args) {
		// Single Catch blok - moze jer oba pripadaju istom roditelju

		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;

			int c[] = { 1 };
			c[10] = 100;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Uhvacen exception!"+e);
		}
		System.out.println("Nakon try.cathch bloka!");
	}

}

