package zadatak1;

public class TackaMain {

	public static void main(String[] args) {
		// Klasa Tacka: 1)deklarisanje koordinata kao atributa; 2)Konstruktor; 3)Metoda
		// za racunanje vrednosti tacke; 4)Metoda za konvertovanje u String;
		// Main klasa: 1) Ucitavanje vrednosti koordinata; 2)Kreiranje objekta; 3) Poziv
		// 1.metode objekta; 4)Poziv 2.metode;

		Tacka t1 = new Tacka(2, 5);
		Tacka t2 = new Tacka(3, 6);

		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(t1.konvertuj());
	}

}
