package jelena.milivojevic;

public class IstovremenoDeljivi {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se štampaju svi trocifreni brojevi koji su istovremeno
		 * deljivi i sa 2 i s
		 */
		// Obrada podataka
		for (int i = 100; i < 1000; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);

			}
		}
	}

}
