package dz1_3zad_paket1_JelenaM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sk = new Scanner(System.in);
		System.out.println("Koliko ukupno mesta za predmete vasa polica ima? ");
		int kapacitetaMesta = sk.nextInt();
		System.out.println("Koliki teret (tezinu(u gr)) moze da izdrzi? ");
		int kapacitetTezine = sk.nextInt();
		Polica polica = new Polica(kapacitetaMesta,kapacitetTezine);

		polica.staviPredmetnaMesto();

		polica.unosTezine();

		polica.opisPolice();

		polica.ukupnoPoupunjenihMesta();

		polica.ukupnaTezina();

		
			polica.ukloniPredmetsaMesta();
			System.out.println("Sadrzaj police nakon uzimanja predmeta");
			polica.opisPolice();
		
		
			polica.pristupiPredmetu();

		
		System.out.println();
		
		
			polica.proveraPopunjenostiMesta();
		
			/*System.out.println("Da li zelite da ispraznite policu?(Da/Ne)");
			String odgclear = sk.nextLine();
			if (odgclear.equalsIgnoreCase("Da")) {
				System.out.println("Brisanje");
			}*/
		System.out.println("Polica je ispraznjena!");
		polica.isprazniPolicu();
		System.out.println("Sadrzaj police nakon brisanja");
		polica.opisPolice();
		/* Provera rada programa: 
		 * Izlaz: 
		 * Koliko ukupno mesta za predmete vasa polica ima? 
5
Koliki teret (tezinu(u gr)) moze da izdrzi? 
300
Koliko predmeta zelite da stavite u policu? 
5
Predmet 1: 
Predmet 2: 
Knjiga Sveska
Predmet 3: 
Tegla
Predmet 4: 
Cokolada
Predmet 5: 
Olovka
Unesite tezinu predmeta na mestu broj 1 (u gr): 
25
Unesite tezinu predmeta na mestu broj 2 (u gr): 
76
Unesite tezinu predmeta na mestu broj 3 (u gr): 
89
Unesite tezinu predmeta na mestu broj 4 (u gr): 
32
Unesite tezinu predmeta na mestu broj 5 (u gr): 
10
Predmeti na polici:  Knjiga Sveska Tegla Cokolada Olovka 
Tezine predmeta (od prvog do poslednjeg): 25 76 89 32 10 
Ukupno popunjenih mesta: 5
Ukupna tezina svih unetih predmeta: 232
Mozete dodati tezinu u iznosu od 68 grama
Unesite redni broj mesta sa kog brisete predmet: 
3
Obrisan je predmet sa mesta broj 3
Sadrzaj police nakon uzimanja predmeta
Predmeti na polici:  Knjiga Sveska Cokolada Olovka 
Tezine predmeta (od prvog do poslednjeg): 25 76 32 10 
Unesite redni broj mesta predmeta za koji zelite da proverite predmet: 
4
Na mestu broj 4 nalazi se Olovka

Unesite redni broj mesta za proveru popunjenosti: 
3
Mesto je prazno

Polica je ispraznjena!
Sadrzaj police nakon brisanja
Predmeti na polici: 
Tezine predmeta (od prvog do poslednjeg): */ 
	}

}
