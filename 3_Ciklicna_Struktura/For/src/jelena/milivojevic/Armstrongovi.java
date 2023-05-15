package jelena.milivojevic;

public class Armstrongovi {

	public static void main(String[] args) {
		// Napisati program kojim se štampaju Amstrongovi brojevi. Broj je Armstrongov
		// ako je jednak zbiru kubova svojih cifara.

		int broj, s, d, j;

		// Obrada podataka
		for (int i = 100; i < 1000; i++) {

			broj = i;
			s = broj / 100;
			d = (broj / 10) % 10;
			j = broj % 10;

			if (broj == (s * s * s + d * d * d + j * j * j)) {
				System.out.println("Dati broj " + broj + " je Armstrongov broj.");
			}
		}
	}

}
