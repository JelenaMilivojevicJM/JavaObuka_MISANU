package jelena.milivojevic;

public class TransponovanaMatrica {

	public static void main(String[] args) {
		/* Zamena redova i kolona matrice */
		int a[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		System.out.println("Matrica A:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int b[][] = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[j][i];
			}
		}
		System.out.println();
		System.out.println("Transponovana Matrica A:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
