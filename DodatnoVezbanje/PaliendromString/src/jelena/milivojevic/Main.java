package jelena.milivojevic;

import java.util.Scanner;

public class Main {
	public static String obrni(String broj) {
		String rezultat = "";
		for (int i = broj.length() - 1; i >= 0; i--) {
			rezultat += broj.charAt(i);
		}
		return rezultat;
	}

	public static void main(String[] args) {
		// Text zadatka: Utvrditi da li je ucitani broj paliendrom

		// ULAZ:
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj:");
		String broj = sc.nextLine();
		System.out.println();

		// OBRADA:

		// IZLAZ:
		if (broj.equalsIgnoreCase(obrni(broj))) {
			System.out.println("Broj JESTE paliendrom");
		} else {
			System.out.println("Broj NIJE paliendrom");
		}

		// NAPOMENA: Vazno je da STRINGOVE poredimo metodom equalsIgnoreCase() da ne bi
		// doslo do problema pri unosu velikih slova!!!
		sc.close();
	}

}