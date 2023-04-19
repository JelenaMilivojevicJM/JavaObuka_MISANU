package predavanje22;

public class Matrica {

	//Matrcia je ovde atribut
	// Deklaracija matrice i inicijalizacija matrice kroz konstruktor
	private double[][] matrica;

	public Matrica(int v, int k) {
		matrica = new double[v][k];
	}

	//Getter - jer mogu da se dohvate
	public double getVrsta() {
		return matrica.length;
	}

	public double getKolona() {
		return matrica[0].length;
	}
	// length je osobina, a k je manja odduzine prve kolone

	//Metod 1: Postavljanje vrednosti elementa
	public Matrica postaviEelement(int v, int k, double vr) {
		matrica[v][k] = vr;
		return this;
	}

	//Metod 2: Dohvatanje vrednosti elementa
	public double dohvatiEelment(int v, int k) {
		return matrica[v][k];// Vratice konkretnu vrednost koja se tu nalazi

	}
	
	//Metod 3: Ispis matrice
	public String toString() {
		String s = "";
		
		for(int v = 0; v < matrica.length; v++) {
			
			for(int k = 0; k < matrica[0].length; k++) {
				
				System.out.print(matrica[v][k]+" ");
				s = s+" ";
			}
		}
		return s;
	}
}
