package jelena.milivojevic;

public class KvadratiKubBrojeva {

	public static void main(String[] args) {
		// Kvadrat i Kub brojeva od 1 do 5
		System.out.println("DO-WHILE:");
		System.out.println("Br \tKva \tKub ");
		int j = 1;
		do {
			System.out.println(j + "\t" + (j * j) + "\t" + (j * j * j));
			j++;
		} while (j <= 5);

	}

}
