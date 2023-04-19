package zadatak6;

import java.util.Scanner;

public class Main {
	/*
	 * TEXT ZADATKA: 6. Napisati program koji pretvara dekadni broj
	 * {0,1,2,3,4,5,6,7,8,9} u binarni{0,1}.
	 */
	
	public static void konvertuj(int dekadni) {
		int binarni[] = new int[40];

		int brojac = 0;

		while (dekadni > 0) {
			binarni[brojac++] = dekadni % 2;
			dekadni = dekadni / 2;
		}
		for (int i = brojac - 1; i >= 0; i--) {
			System.out.print(binarni[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		//ULAZ: Ucitavanje zeljenog broja sa skenera:
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dekadni broj: ");
		int dekadni = sc.nextInt();
		
		//OBRADA + IZLAZ: Poziv metode za konvertovanje u dekadni + ispis
		konvertuj(dekadni);

		sc.close();
	}

}
