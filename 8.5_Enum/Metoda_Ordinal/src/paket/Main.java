package paket;

public class Main {
	public static void main(String[] args) {
		Boje x;
		x = Boje.valueOf("Crvena");

		Boje xxx;
		Boje nizB[] = Boje.values();
		System.out.print("Niz Boja:  ");
		for (Boje n : nizB) {
			System.out.print(n + " ");
		}

		/*
		 * Metoda Ordinal()njome se dobija redni broj konstante u listi odnosno polozaj
		 * date konstante u listi konstanti u nabrajanju. Redni brojevi pocinju od 0
		 */
		System.out.println("\nBoja : Redni Broj Boje   ");
		for (Boje n : nizB) {
			System.out.println(n + " : " + n.ordinal());
		}
	}

}
