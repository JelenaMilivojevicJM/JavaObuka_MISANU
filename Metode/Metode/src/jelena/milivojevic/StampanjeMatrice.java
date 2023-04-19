package jelena.milivojevic;

public class StampanjeMatrice {
	final static int vrsta = 2;
	final static int kolona = 2;

	static void prikaziMatricu(int matrica[][]) {
		System.out.println("Dobijena matrica izgleda ");
		for (int i = 0; i < vrsta; i++) {
			for (int j = 0; j < kolona; j++)
				System.out.print(" " + matrica[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu za štampanje kvadratne matrice reda 2. U glavnom programu
		 * uneti matricu i odštampati je.
		 */
		int a[][] = { { 1, 2 }, { 3, 4 } };
		prikaziMatricu(a);
	}

}
