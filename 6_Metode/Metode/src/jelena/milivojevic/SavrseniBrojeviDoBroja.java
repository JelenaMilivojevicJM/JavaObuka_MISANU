package jelena.milivojevic;

import java.io.*;

public class SavrseniBrojeviDoBroja {
	public static void savrsenBroj(double m) {
		System.out.println("Savršeni brojevi broja " + m + " su: ");

		// Nalaženje savršenih brojeva broja m
		for (int n = 2; n <= m; n++) {
			double suma = 1;
			int nk = n / 2;

			for (int i = 2; i <= nk; i++)
				if (n % i == 0)
					suma += n / i;

			if (suma == n)
				System.out.println(n);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati program kojim se određuju i ispisuju svi savršeni brojevi unetog
		 * broja m. Napomena: Broj je savršen ako je jednak sumi svih delitelja
		 * isključujući njega samog.
		 */
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// m - broj za koji se pronalaze svi savršeni brojevi
		int m;

		System.out.println("Unesite broj za koji se pronalaze svi savršeni brojevi m: ");
		m = Integer.parseInt(ulaz.readLine());

		savrsenBroj(m);

	}

}
