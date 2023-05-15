package jelena.milivojevic;

public class DvaNovaNiza {

	public static void main(String[] args) {
		/*
		 * Dati su sledeći celi brojevi: 25, 31, 12, -7, 14, 24, 121, -35, 42, 15.
		 * Sastaviti algoritam i napisati program pomoću koga će se od ovog niza brojeva
		 * formirati dva nova niza. U prvom treba da budu članovi datog niza koji su
		 * deljivi sa 2, a u drugom članovi datog niza koji su deljivi sa 5. Odštampati
		 * članove sva tri niza brojeva.
		 * 
		 * Objašnjenje: x = {25, 31, 12, -7, 14, 24, 121, -35, 42, 15} i = 10; x2 = {12,
		 * 14, 24, 42} i2 = 4; x5 = {25, -35, 15} i5 = 3.
		 */
		// k - zadati niz brojeva
		// k2 - niz brojeva deljivih sa 2
		// k5 - niz brojeva deljivih sa 5
		// n2 - brojač brojeva deljivih sa 2
		// n5 - brojač brojeva deljivih sa 5
		int[] k = { 25, 31, 12, -7, 14, 24, 121, -35, 42, 15 };
		int[] k2 = new int[100];
		int[] k5 = new int[100];
		int n2 = 0, n5 = 0;

		for (int i = 0; i < 10; i++) {
			// Ispitivanje da li je broj deljiv sa 2
			if (k[i] % 2 == 0) {
				n2++;
				k2[n2] = k[i];
			}

			// Ispitivanje da li je broj deljiv sa 5
			if (k[i] % 5 == 0) {
				n5++;
				k5[n5] = k[i];
			}
		}

		// Štampanje rezultata
		System.out.println("Zadati niz brojeva: ");
		for (int i = 0; i < 10; i++)
			System.out.print(k[i] + " ");

		System.out.println("\nNiz brojeva deljivih sa 2: ");
		for (int i = 1; i <= n2; i++)
			System.out.print(k2[i] + " ");

		System.out.println("\nNiz brojeva deljivih sa 5: ");
		for (int i = 1; i <= n5; i++)
			System.out.print(k5[i] + " ");
	}

}
