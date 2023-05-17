package paket;

public class Main {

	public static void main(String[] args) {
		Voce v1;
		Voce v2;
		Voce v3;
		Voce v4;

		v1 = Voce.valueOf("Jabuka");
		v2 = Voce.valueOf("Kruska");
		v3 = Voce.valueOf("Narandza");
		v4 = Voce.valueOf("Limun");

		Voce nizV[] = Voce.values();
		System.out.print("Niz VOCE: ");
		for (Voce v : nizV) {
			System.out.print(v + " ");
		}
		System.out.println();

		System.out.print("Da li je v1 = v2 : ");
		if (v1.equals(v2)) {
			System.out.println("DA");
		} else {
			System.out.println("NE ");
		}

		System.out.print("Da li je v3 = v4 : ");
		if (v3.equals(v4)) {
			System.out.println("DA");
		} else {
			System.out.println("NE");
		}

	}

}
