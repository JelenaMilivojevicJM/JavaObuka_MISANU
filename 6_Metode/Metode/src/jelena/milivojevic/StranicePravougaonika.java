package jelena.milivojevic;

import java.io.*;

public class StranicePravougaonika {
	public static boolean uslov(int a, int b, int c, int d) {
		return ((a < c) && (b < d)) || ((a < d) && (b < c));
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Napisati funkciju kojom se ispituje da li se pravougaonik dužina stranica a i
		 * b može ceo smestiti u pravougaonik dužina stranica c i d uz uslov da su im
		 * stranice paralelne. U glavnom programu uneti pravougaonik sa stranicama a i b
		 * i n pravougaonika sa stranicama c i d.
		 */
		int a, b, n;
		int c[] = new int[100];
		int d[] = new int[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka
		System.out.print("Unesite stranicu a: ");
		a = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite stranicu b: ");
		b = Integer.parseInt(ulaz.readLine());
		System.out.print("Koliko novih pravougaonika zelite da unesete? ");
		n = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite stranice c i d: \n");
		for (int i = 1; i <= n; i++) {
			System.out.print("c[" + i + "] = ");
			c[i] = Integer.parseInt(ulaz.readLine());
			System.out.print("d[" + i + "] = ");
			d[i] = Integer.parseInt(ulaz.readLine());
		}
		for (int i = 1; i <= n; i++) {
			if (uslov(a, b, c[i], d[i]))
				System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i]
						+ " nalazi se u pravougaoniku stranica a = " + a + " i b = " + b);
			else
				System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i]
						+ " ne nalazi se u pravougaoniku stranica a = " + a + " i b = " + b);
		}

	}

}
