package jelena.milivojevic;

public class ZbirElemenataTrecegReda {

	public static void main(String[] args) {
		int niz[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		System.out.println("Niz:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		int zbir = 0;

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {

				if (i == 2) {
					zbir += niz[i][j];
				}
			}
		}
		System.out.println("Zbir: " + zbir);

	}

}
