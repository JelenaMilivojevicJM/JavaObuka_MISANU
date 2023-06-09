package jelena.milivojevic;

public class ZamenaDijagonala {
	public static void zameni(int matrica[][], int n) {
		for (int i = 0; i < n; i++) {
			int temp = matrica[i][i];
			matrica[i][i] = matrica[i][n - i - 1];
			matrica[i][n - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		int matrica[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = 3;
		// Duzina = 3; sinrina = 3
		System.out.println("Matrica PRE: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		zameni(matrica, 3);
		System.out.println("Matrica POSLE: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
