package paket_domaci2;

public class Main {
	/* Napisati program koji prebrojava “space” simbole. */

	public static void main(String[] args) {
		// Broj space-ova Glavna Klasa:
		BrojSpaceova bs = (s) -> {

			int brojacpp = 0;
			char slovo = ' ';

			for (int i = s.length() - 1; i >= 0; i--) {

				slovo = s.charAt(i);

				if (slovo == ' ') {
					brojacpp++;
				}
			}
			return brojacpp;
		};

		String rec = "Voć e i P ovrće";

		System.out.println("U datoj reci ima " + bs.prebrojPP(rec) + " space znakova.");

	}
}
