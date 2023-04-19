package dz1_2zad_paket1_JelenaM;

public class VerizniRazlomak {

	/*
	 * Note to self: Sta je verizni razlomak? izvor objasnjenja veriznog razlomka:
	 * https://mathworld.wolfram.com/ContinuedFraction.html
	 * 
	 * Dakle: Koeficijen veriznog razlomka je a[0],a[1],a[2],a[3]....a[n] Znaci, za
	 * predtsavljanje koeficijenata mi je potreban jednodimenzionalni niz
	 * 
	 * Konacni veruzni razlomak - Uskladjeno sa onim kako smo mi radili na casu
	 * verizni: int a[]; int b; int rezultat = a[0]/(b+a[1]/(b+a[2]/(b+a[3]/a[n])));
	 */

	// RAD:
	// Deklaracija, inicijalizacija niza svih koeficijenta veriznog razlomka:
	double a[];

	VerizniRazlomak(int red) {
		this.a = new double[red];
	}

	// Postavljanje vrednosti konkretnog koeficijenta:
	public VerizniRazlomak setKoeficijent(int indeks, double koef) {
		a[indeks] = koef;
		return this;
	}

	// Metoda za Rezultat razlomka:
	public double racunajRezultat(double b) {

		double rezultat = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			rezultat = a[i] / (b + rezultat);
		}
		return rezultat;
	}


	//Metoda za prikaz tekstualnog opisa veriznog razlomka sa sve koeficijentima: 
	public String toString() {
		String opis = "Verizni razlomak sadrzi koeficijente: ";
		for (int i = 0; i < a.length; i++) {
			opis+= a[i] + ", ";
		}
		return opis;
	}
	
	// Metoda za stampanje koeficijenata veriznog razlomka:
		public void stampaj() {
			System.out.print(" Koeficijenti veriznog razlomka su : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
}
