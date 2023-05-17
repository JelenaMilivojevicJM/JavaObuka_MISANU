package paket;

public class Main {

	public static void main(String[] args) {
		// Deklaracija jende promenljive i prikaz niza boja
		Boje x;
		Boje nizB[] = Boje.values();
		System.out.println("Boje:");
		for (Boje b : nizB) {
			System.out.println(b + " ");
		}

		// Inicijalizacija promenljiva vrednostima enuma
		Boje x1;
		Boje x2;
		Boje x3;

		x1 = Boje.valueOf("Crvena");
		x2 = Boje.valueOf("Zelena");
		x3 = Boje.valueOf("Plava");

		// Poredjenje metdoom compareTo
		/*
		 * compareTo() -poredi redne brojeve dveju konstanti iz istog nabrajanja. AKo je
		 * redni broj pozivajuce konstante < rednog broja konstante, vratice negativan
		 * broj koji predstavlja KOLIKO JE POZICIJA JEDAN OD DRUGOG DALEKO
		 */
		System.out.println("Poredjenje:");
		System.out.println("Crvena vs Zelena : " + x1.compareTo(x2));
		System.out.println("Crvena vs Plava : " + x1.compareTo(x3));
		System.out.println("Zelena vs Plava : " + x2.compareTo(x3));
		System.out.println("Plava vs Zelena : " + x3.compareTo(x2));
		System.out.println("Plava vs Zelena : " + x3.compareTo(x1));
	}

}
