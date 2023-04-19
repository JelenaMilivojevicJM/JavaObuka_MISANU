package jelena.milivojevic;

import java.util.Scanner;

public class DanUNedelji {

	public static void main(String[] args) {
		/* Napisati program koji za dati redni broj dana u nedelji štampa ime dana. */
		int redniBrojDana;

		/* 1. deo: Unos podataka */

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite redni broj dana: ");
		redniBrojDana = ulaz.nextInt();

		/* 2. deo: Obrada podataka */
		switch (redniBrojDana) {
		case 1:
			System.out.println("Ponedeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Sreda");
			break;
		case 4:
			System.out.println("Četvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedelja");
			break;
		default:
			System.out.println("Greska");

		}

		ulaz.close();
	}

}
