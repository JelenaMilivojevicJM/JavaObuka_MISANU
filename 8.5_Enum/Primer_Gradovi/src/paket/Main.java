package paket;

public class Main {

	public static void main(String[] args) {
		Gradovi g1;
		Gradovi g2;
		Gradovi g3;
		Gradovi g4;

		g1 = Gradovi.valueOf("Nis");
		g2 = Gradovi.valueOf("Kragujevac");
		g3 = Gradovi.valueOf("NoviSad");
		g4 = Gradovi.valueOf("Beograd");

		Gradovi g;

		Gradovi nizG[] = Gradovi.values();
		System.out.println("Gradovi : Redni Broj");
		for (Gradovi x : nizG) {
			System.out.println(x + " : " + x.ordinal());
		}

		System.out.println("g1 equals g2 : " + g1.equals(g2));
		System.out.println("g2 equals g3" + g2.equals(g3));

		System.out.println("g3 compareTo g2 " + g3.compareTo(g2));
		System.out.println("g2 compareTo g1 " + g3.compareTo(g2));
		System.out.println("g1 compareTo g2 " + g3.compareTo(g2));

	}

}
