package jelena.milivojevic;

import java.util.Scanner;

public class IzdvajanjeCifaraTrocifrenog {

	public static void main(String[] args) {
		/*
		 * Napisati program za izdvajanje cifara trocifrenog broja. Izrazom broj % 10
		 * dobijamo jedinice broja (u ovom slučaju trocifrenog). Celobrojnim deljenom sa
		 * 100 dobija se cifra stotica. Cifra jedinica je ostatak deljenje sa 10.
		 * Celobrojnim deljenom sa 10 dobijaju se prve dve cifre, one se dele sa 10 i
		 * ostatak deljenja je cifra desetica.
		 * 
		 * /*1. ulaz: učitati trocifren broj 2. obrada: izračunati cifre stotica,
		 * desetica i jedinica s = broj / 100; // cifra stotina t = broj / 10; // prve
		 * dve cifre d = t % 10 ; // cifra desetica j = broj % 10; // cifra jedinica 3.
		 * izlaz: ispisati cifre stotica, desetica i jedinica
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Trocifren broj:");
		int broj = input.nextInt();
		int s, d, j;
		s = broj / 100; // cifra stotica
		d = (broj / 10) % 10; // cifra desetica
		j = broj % 10; // cifra jedinica
		System.out.println(
				"broj = " + broj + ", cifra stotina = " + s + ", cifra desetica = " + d + ", cifrajedinica = " + j);
		input.close();
	}

}
