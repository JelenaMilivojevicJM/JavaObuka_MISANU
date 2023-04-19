package dz1_1zad_paket1_JelenaM;

public class Izuzetak extends Throwable {

	//Niz mogucih poruka izuzetaka
	public static String porukaIzuzetka[] = {"Neispravan opseg!","Van opsega!","Neadekvatne duzine vektora!"};


	//Oznake izuzetaka
	public static  int opseg = 0;
	public static  int indeks = 1;
	public static  int duzina = 2;
	
	
	//Oznaka izuzetka
	private int oznaka;
	
	//Dodela vrednosti za oznaku
	public Izuzetak(int ozn) {
		oznaka = ozn;
	}
	//Dohvatanje vrednosti oznake 
		public int getOznaka(int oznaka) {
			return oznaka;
		} 
		
	//toString metoda za ispis poruke izuzetka
	public String toString() {
		return "Izuzetak! "+ porukaIzuzetka[oznaka];
	}
	
}
