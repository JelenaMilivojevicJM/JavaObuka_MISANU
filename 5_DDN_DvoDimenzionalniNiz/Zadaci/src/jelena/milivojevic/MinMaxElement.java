package jelena.milivojevic;

public class MinMaxElement {

	public static void main(String[] args) {
		// Deklaracija, inicijalizacija i stampanje matrice:

		int matrica[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		System.out.println("Matrica:");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		int suma = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				suma = suma + matrica[i][j];
			}
		}

		System.out.println("Zbir svih elemenata matrice: " + suma);

		// MIN element
		int min = matrica[0][0];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				if (matrica[i][j] < min) {
					min = matrica[i][j];
				}
			}
		}
		System.out.println("Najmanji element matrice: " + min);

		// Max element
		int max = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				if (matrica[i][j] > max) {
					max = matrica[i][j];
				}
			}
		}
		System.out.println("Najveci element matrice: " + max);
		System.out.println();
	}

}
