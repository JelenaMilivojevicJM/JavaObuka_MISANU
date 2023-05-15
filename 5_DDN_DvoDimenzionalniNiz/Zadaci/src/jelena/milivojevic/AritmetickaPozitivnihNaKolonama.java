package jelena.milivojevic;

public class AritmetickaPozitivnihNaKolonama {

	public static void main(String[] args) {
		//Ulaz:
		//Kreiranje matrice
		int niz[][] = { { 1, -2, 3 }, { 4, 5, -6 }, { -7, 8, -9 } };
		System.out.println("Niz:");
		
		//Prolazak kroz matricu i ispis svih elemenata
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		//Inicijalizacija promenljive za sumu
		int suma = 0;
		//Inicijalizacija promenljive za aritmeticku sredinu
		double aritmeticka = 1;
		//Inicijalizacija promenljive za brojac
		int brojac = 0;

		//Obrada:
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (niz[i][j] > 0) {
					brojac++;
					suma += niz[i][j];
					aritmeticka = (double) suma / brojac;
				}
				//Izlaz:
				System.out.println("Aritmeticka sredina Pozitivnih elemenata U KOLONI " + (j + 1) + ". = " + aritmeticka);
			}

		}

	}

}
