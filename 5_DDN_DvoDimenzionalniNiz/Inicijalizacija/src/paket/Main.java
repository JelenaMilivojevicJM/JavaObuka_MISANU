package paket;

public class Main {

	public static void main(String[] args) {
		// I nacin inicijalizacije promenljive niza:
		int[][] niz = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// Stampanje dvodimenzionalnog niza
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}

	}

}
