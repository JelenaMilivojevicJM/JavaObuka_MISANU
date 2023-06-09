package jelena.milivojevic;

public class RekurzivnoStepenovanje {
	// Stepenovanje prvog broja drugim

	public static int stepenuj(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y % 2 == 0) {
			return stepenuj(x * x, y / 2);
		} else {
			return x * stepenuj(x, y - 1);
		}
	}

	public static int stepen_sporo(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			return x * stepen_sporo(x, y - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Stepenovanje brojeva:  5 na 2 = " + stepenuj(5, 2));
		System.out.println("*Stepenovanje brojeva:  5 na 2 = " + stepen_sporo(5, 2));
		System.out.println();
		System.out.println("Stepenovanje brojeva:  8 na 2 = " + stepenuj(8, 2));
		System.out.println("Stepenovanje brojeva:  3 na 4 = " + stepenuj(3, 4));
	}

}
