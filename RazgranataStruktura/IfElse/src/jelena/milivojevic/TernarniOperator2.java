package jelena.milivojevic;

import java.io.*;

public class TernarniOperator2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati program za izračunavanje vrednosti funkcije sa
		 * vrednostima x, y, p i q, za izraz: f(x,y,p,q) = min(x,max(y,min(p,q)))
		 */
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Ulaz:
		System.out.print("Unesite vrednost za x: ");
		int x = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		int y = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za p: ");
		int p = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za q: ");
		int q = Integer.parseInt(ulaz.readLine());

		// Obrada:
		// Upotreba Ternarnog operatora
		int f = (p < q) ? p : q;
		if (y > f)
			f = y;
		if (x < f)
			f = x;

		// Izlaz:
		System.out.println("Vrednost funkcije f je " + f);
	}

}
