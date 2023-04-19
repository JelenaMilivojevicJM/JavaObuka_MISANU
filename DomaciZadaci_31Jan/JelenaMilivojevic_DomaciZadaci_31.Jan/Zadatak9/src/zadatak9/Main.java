package zadatak9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * TEKST ZADATKA: 9. Napisati program koji prebrojava “space” simbole.
		 */
		
		// ULAZ:
		
		// Ucitavanje textualnog sadrzaja sa konzole
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String recenica = sc.nextLine();

		// Deklaracija i inicijalizacija brojaca karaktera
		int brojac = 0;

		// Deklaracija i Inicijalizacija char niza na osnovu vrednosti unetog Stringa
		int duzinaNiza = recenica.length();
		
		char niz[] = new char[duzinaNiza];
		
		//OBRADA:
		for (int i = 0; i < duzinaNiza; i++) {
			// Unosenje karaktera u char niz na osnovu vrednosti unetog Stringa
			niz[i] = recenica.charAt(i);
			
			//Prolazak kroz zeljeni uslov (da nam je karakter prazan)
			if (recenica.charAt(i) == ' ') {
				//Ukoliko je uslov tacan, brojac se povecava za 1
				brojac++;
			}
		}
		// IZLAZ:
		System.out.println("Znak space se u unetoj recenici pojavljuje " + brojac + " puta.");

		sc.close();
	}
}
