package paket_Matrica;

public class Matrica {
	private double[][] matrica;

	public Matrica(int v, int k) {
		matrica = new double[v][k];
	}

	public double getVrsta() {
		return matrica.length;
	}

	public double getKolona() {
		return matrica[0].length;
	}

	// Metod 1: Postavljanje elementa
	public Matrica postaviEelement(int v, int k, double vr) {

		matrica[v][k] = vr;

		return this;
	}

	// Metod 2: Dohvatanje elementa
	public double dohvatiEelment(int v, int k) {

		return matrica[v][k];

	}

	// Metod 3: Ispis matrice
	public String toString() {
		String s = "";
		for (int v = 0; v < matrica.length; v++) {
			for (int k = 0; k < matrica[0].length; k++) {
				System.out.print(matrica[v][k] + "\n");
				s = s + "\n";
			}
		}
		return s;
	}
}
