package enum1;

public class Main {

	public static void main(String[] args) {
		// NABrAJANJE
		/*
		 * To je uvodjenje novog tipa podatka. s tim da ovde imamo unapred definisane
		 * vrednosti. To je lista imenovanih vrednosti koje definisu nov tip podatka oi
		 * njegove dozvoljenen vrednosti. To znaci da nabrajanje moze da sadrzi samo
		 * neku od vrednosti koje su navedene na listi - druge vrednosti nisu
		 * dozvoljene.
		 * 
		 */

		Boje b; // =int a;
		// nema ono kalsicmno = new Boje nego je prost tip

		b = Boje.Crvena;// a = 5;

		System.out.println("Boja: " + b);

		b = Boje.Plava;
		if (b == Boje.Plava) {
			System.out.println("Plava Boja: ");
			// }else {

		}

		switch (b) {

		case Crvena: {
			System.out.println("Crvena");
			break;
		}
		case Zelena: {
			System.out.println("Zelena");
			break;
		}
		case Plava: {
			System.out.println("Plava");
			break;
		}
		case Crna: {
			System.out.println("Crna");
			break;
		}
		case Bela: {
			System.out.println("Bela");
			break;
		}
		case Narandzasta: {
			System.out.println("Narandzasta");
			break;
		}
		case Zuta: {
			System.out.println("Zuta");
			break;
		}
		default:
			System.out.println("Ni jedna od ponudjenih");
		}

	}

}
