package jelena.milivojevic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntervalNeparnihBrojeva {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Napisati program za ispisivanje neparnih brojeva od 1 do zadatog broja n. */
		int n;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za n: ");
		n = Integer.parseInt(ulaz.readLine());

		int i = 1;
		while (i <= n) {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		}
	}

}
