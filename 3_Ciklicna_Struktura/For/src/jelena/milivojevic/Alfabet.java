package jelena.milivojevic;

public class Alfabet {

	public static void main(String[] args) {
		/* Koristeci for petlju ispisati velika slova alfabeta */

		// Unos podataka
		char slovo = 'A';
		// Obrada podataka
		for (int i = 1; i <= 26; i++) {

			if (slovo >= 'A' && slovo <= 'Z') {
				System.out.print(slovo+" ");
				slovo++;
			}
		}
	}

}
