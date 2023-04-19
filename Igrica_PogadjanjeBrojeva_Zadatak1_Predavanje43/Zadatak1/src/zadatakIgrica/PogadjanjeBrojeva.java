package zadatakIgrica;

import java.util.Random;
import java.util.Scanner;

public class PogadjanjeBrojeva {

	public static void main(String[] args) {
		// Kreiranje objekta klase Random
		Random randBr = new Random();

		int broj = randBr.nextInt(10);
		/*
		 * Pozivanje metode nextInt() koja je metoda objekta klase radnom Naznacen broj
		 * 9 u zagradi je opseg do kog zelimo da ide ispisivanje nasumicnih brojeva
		 * Posto metode nextInt()krece od broja 0, kao uslov stavljamo 10 ako zelimo da
		 * uracuna broj 9. Svaki put kada se pokrene bice dodeljena vrednost drugog
		 * broja.
		 */

		// Unosenje od strane korisnika:
		Scanner sc = new Scanner(System.in);

		int uneto;
		// Brojac krece od 1 da bi se izbeglo prikazivanje broja 0 korisniku.
		int brojac = 1;

		// DO while pretljom da bi barem jednom prosao kroz petlju i na kraju postavio
		// uslov!
		do {
			System.out.println("Unesite broj: ");
			uneto = sc.nextInt();

			// IF - ELSE IF grananje za trazenje opcije tacnosti ili pribliznosti tacnog
			// rezultata
			if (uneto == broj) {

				boolean pogodak = true;
				System.out.println(pogodak + " POGODAKT!");
				System.out.println("Pogodili ste iz " + brojac + ". puta!");

			} else if (uneto > broj) {
				boolean pogodak = false;
				System.out.println(pogodak + " Broj je MANJI od unetog");
			} else if (uneto < broj) {
				boolean pogodak = false;
				System.out.println(pogodak + " Broj je VECI od unetog");
			}
			brojac++;

		} while (uneto != broj);

		// Uslov while-a : sve dok je uneti razlicit od radnom dobijenog broja
		sc.close();

	}

}
