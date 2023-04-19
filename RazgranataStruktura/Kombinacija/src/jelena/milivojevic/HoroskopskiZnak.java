package jelena.milivojevic;

import java.util.Scanner;

public class HoroskopskiZnak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji omogucuje da za uneti naziv meseca i broj dana ispise
		 * horoskopski znak. Primer: Unesite mesec rodjenja: Oktobar Unesite dan
		 * rodjenja: 18 Vaga
		 */
		// Ulaz
		Scanner sk = new Scanner(System.in);
		System.out.print("Unesite mesec (ime) rodjenja ");
		String mesec = sk.nextLine();
		System.out.print("Unesite redni broj dana u mesecu rodjenja ");
		int dan = sk.nextInt();

		// Obrada
		if (mesec.equalsIgnoreCase("Mart") && dan < 21 || mesec.equalsIgnoreCase("April") && dan <= 20) {
			System.out.print("Vi ste u horoskopu ovan ");

		} else if (mesec.equalsIgnoreCase("April") && dan >= 21 || mesec.equalsIgnoreCase("Maj") && dan <= 21)
			System.out.print("Vi ste u horoskopu bik ");

		else if (mesec.equalsIgnoreCase("Maj") && dan >= 22 || mesec.equalsIgnoreCase("Jun") && dan <= 21) {
			System.out.print("Vi ste u horoskopu blizanci ");

		} else if (mesec.equalsIgnoreCase("Jun") && dan >= 22 || mesec.equalsIgnoreCase("Jul") && dan <= 22) {
			System.out.print("Vi ste u horoskopu rak ");

		} else if (mesec.equalsIgnoreCase("Jul") && dan >= 23 || mesec.equalsIgnoreCase("Avgust") && dan <= 22) {
			System.out.print("Vi ste u horoskopu lav ");

		} else if (mesec.equalsIgnoreCase("Avgust") && dan >= 23 || mesec.equalsIgnoreCase("Septembar") && dan <= 22) {
			System.out.print("Vi ste u horoskopu devica ");

		} else if (mesec.equalsIgnoreCase("Septembar") && dan >= 23
				|| mesec.equalsIgnoreCase("Oktobbar") && dan <= 23) {
			System.out.print("Vi ste u horoskopu vaga ");

		} else if (mesec.equalsIgnoreCase("Oktobar") && dan >= 24 || mesec.equalsIgnoreCase("Novembar") && dan <= 23) {
			System.out.print("Vi ste u horoskopu skorpija ");

		} else if (mesec.equalsIgnoreCase("Novembar") && dan >= 24 || mesec.equalsIgnoreCase("Decembar") && dan < 22) {
			System.out.print("Vi ste u horoskopu strelac ");

		} else if (mesec.equalsIgnoreCase("Decembar") && dan >= 22 || mesec.equalsIgnoreCase("Januar") && dan < 21) {
			System.out.print("Vi ste u horoskopu jarac ");

		} else if (mesec.equalsIgnoreCase("Januar") && dan >= 21 || mesec.equalsIgnoreCase("februar") && dan < 20) {
			System.out.print("Vi ste u horoskopu vodolija ");

		} else if (mesec.equalsIgnoreCase("Februar") && dan >= 20 || mesec.equalsIgnoreCase("Mart") && dan <= 20) {
			System.out.print("Vi ste u horoskopu ribe ");
		} else {
			System.out.print("Pogresan unos imena meseca");
		}
		sk.close();
	}

}
