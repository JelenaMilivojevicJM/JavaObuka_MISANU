package paket;

import java.util.Stack;

public class TestOblik {
	public static void main(String[] args) {
		Krug krug = new Krug(1);

		Pravougaonik pravougaonik = new Pravougaonik(4, 5);

		Stack stek = new Stack();
		stek.push(krug);
		stek.push(pravougaonik);
		while (!stek.empty()) {
			Oblik oblik = (Oblik) stek.pop();
			System.out.println("Površina je " + oblik.uzmiPovrsinu());
		}
		/*
		 * Stek (engl. stack) je struktura podataka koja radi na principu L-I-F-O =
		 * poslednji smešten, prvi izvađen (engl. last-in, first-out). 1. Stavljanje
		 * nečega na stek znači da ga stavljate na vrh. 2. Uzimanje nečega sa steka
		 * znači da sa njega skidate poslednje uneto. Metode Stek-a: 1. push( ); -
		 * koristi se za postavljanje - dodavanje na stek. 2. pop( ); - koristai se za
		 * uzimanje sa steka - brisanje iz steka.
		 * 
		 * 
		 */
	}
}
