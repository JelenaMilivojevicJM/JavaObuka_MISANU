package paket_uvod;

public class Main {
	public static void main(String[] args) {

		// Deklaracija promenljive Boje tipa (enum)
		Boje b;

		// Kreiranje niza
		System.out.print("Niz Boja : ");

		Boje nizBoja[] = Boje.values();

		for (Boje x : nizBoja) {
			System.out.print(x + " ");
		}

		// Deklaracija druge promenljive enum tipa
		Boje c;

		// Inicijalizacija date promenljive vrednoscu konstante iz enum skupa
		c = Boje.valueOf("Crvena");
		System.out.println("\n1. Boja: " + c);

		// Pristupanje vrednosti/konstanti
		Boje d;
		d = Boje.Zelena;
		System.out.println("Boja 2.: " + d);

		// Nova promenljiva
		Boje e;
		e = Boje.valueOf("Plava");
		System.out.println("3. Boja: " + e);
	}

}
