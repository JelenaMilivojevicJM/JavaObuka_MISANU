package jelena.milivojevic;

public class KvadratiKubBrojeva {

	public static void main(String[] args) {
		// Kvadrat i Kub brojeva od 1 do 5
		System.out.println("WHILE:");
		System.out.println("Br \tKva \tKub ");
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
			i++;
		}

	}

}
