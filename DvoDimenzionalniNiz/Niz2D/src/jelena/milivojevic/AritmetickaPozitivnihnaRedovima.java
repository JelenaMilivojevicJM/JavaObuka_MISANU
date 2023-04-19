package jelena.milivojevic;

public class AritmetickaPozitivnihnaRedovima {

	public static void main(String[] args) {
		int niz[][] = { { 1, -2, 3 }, { 4, 5, -6 }, { -7, 8, -9 } };
		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		int suma = 0;
		double aritmeticka = 1;
		int brojac = 0;

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (niz[i][j] > 0) {
					brojac++;
					suma += niz[i][j];
					aritmeticka = (double) suma / brojac;
				}
			}
			System.out.println("Aritmeticka Pozitivnih NA REDU " + (i + 1) + ". = " + aritmeticka);

		}

	}
}
