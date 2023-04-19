package paket;

public class Matrica {

	private double matrica[][];
	
	Matrica(int vrsta, int kolona){
		matrica = new double[vrsta][kolona];
	}
	
	public double getVrsta() {
		return matrica.length;
	}
	
	public double getKolona() {
		return matrica[0].length;
	}
	
	public Matrica postaviElement(int vrsta, int kolona, double vrednost) {
		matrica[vrsta][kolona]= vrednost;
		return this;
	}
	public double dohvatiEelement(int vrsta, int kolona) {
		return matrica[vrsta][kolona];
	}
	
	public String toString() {
		String s ="";
		for(int vrsta = 0; vrsta < matrica.length; vrsta++) {
			for (int kolona = 0; kolona< matrica[0].length; kolona++) {
				System.out.print(matrica[vrsta][kolona]+"\n");
				s = s+" ";
			}
		}
		return s;
	}
}
