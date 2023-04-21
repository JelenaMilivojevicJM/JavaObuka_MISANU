package jelena.milivojevic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import izuzetak.Izuzetak;

public class VelikoSlovo {
	/* Kreiranje liste velikih slova. 
	 * Posto radi samo nad referentnim tipom podataka umesto char stavljamo omotacku klasu Character.
	 */
	List<Character> velikaSlova = new ArrayList<Character>();

	Scanner sc = new Scanner(System.in);

	// Metoda za ucitavanje slova u listu
	/*
	 * Stavljamo da ova metoda moze da baci izuzetak ukoliko korisnik greskom krene
	 * sa unosenjem malih slova
	 */
	public void unosVelikihSlova() throws Izuzetak {
		System.out.println("Unesite VELIKA SLOVA ALFABETA.*Za prekid unosenja, unesite broj 1* ");
		while (true) {
			Character vs = sc.next().charAt(0);
			if (vs == 'a' || vs == 'b' || vs == 'c' || vs == 'd' || vs == 'e' || vs == 'f' || vs == 'g' || vs == 'h'
					|| vs == 'i' || vs == 'j' || vs == 'k' || vs == 'l' || vs == 'm' || vs == 'n' || vs == 'o'
					|| vs == 'p' || vs == 'q' || vs == 'r' || vs == 's' || vs == 't' || vs == 'u' || vs == 'v'
					|| vs == 'w' || vs == 'x' || vs == 'y' || vs == 'z') {
				throw new Izuzetak("Uneli ste malo slovo!");
			} else if (vs == '1') {
				return;
			} else {
				// Smestanje ucitanih vrednosti sa konzole u kolekciju
				this.velikaSlova.add(vs);
			}
		}
	}

	// Metoda za ispis liste:
	void ispisVelikihSlova() {
		System.out.println("Velika Slova: ");
		System.out.print(this.velikaSlova);
		System.out.println();
	}
}
