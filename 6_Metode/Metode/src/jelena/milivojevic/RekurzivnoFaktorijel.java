package jelena.milivojevic;

public class RekurzivnoFaktorijel {
	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n - 1) * n;
	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu za rekurzivno izračunavanje faktorijela broja.
		 * 
		 * Objašnjenje: Rekurzivno se može izračunati faktorijel broja (n!), jer je za n
		 * = 0, 0! = 1, a za n>0 je n! = n * (n-1)!.
		 */
		System.out.println("Faktorijel broja 5 je " + faktorijel(5));
		System.out.println("Faktorijel broja 7 je " + faktorijel(7));
	}

}
