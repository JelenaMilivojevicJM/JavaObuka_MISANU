package jelena.milivojevic;

public class ZbirBrojeva {

	public static void main(String[] args) {
		/* Napisati program za računanje zbira brojeva od 1 do 10. */
		int zbir = 0; /* 0 predstavlja neutral prilikom sabiranja */
		for (int i = 1; i <= 10; i++) {
			zbir = zbir + i; // zbir += i;

		}
		System.out.println("Zbir brojeva iznosi: " + zbir);
	}

}
