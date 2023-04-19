package jelena.milivojevic;

public class RekurzivnoMnozenje {
	// Rekurzivno mnozenje dva broja svojdenjem na sabiranje:
	public static int mnozi(int x, int y) {
		if (x == 0)
			return 0;
		else
			return mnozi(x - 1, y) + y;
	}

	public static void main(String[] args) {
		System.out.println("Mnozenje brojeva:  5 * 6 = " + mnozi(5, 6));
		System.out.println("Mnozenje brojeva:  8 * 9 = " + mnozi(8, 9));
		System.out.println("Mnozenje brojeva:  3 * 4 = " + mnozi(3, 4));
	}

}
