package zadatak3_02Feb2023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite da li je osoba djak ili zaposlen: ");
		String osoba = sc.nextLine();

		System.out.println("Unesite ime ");
		String ime = sc.nextLine();
		System.out.println("Unesite Datum Rodjenja ");
		String datumRodjenja = sc.nextLine();
		System.out.println("Unesite Adresu Stanovanja");
		String adresaStanovanja = sc.nextLine();

		if (osoba.equalsIgnoreCase("Djak")) {
			System.out.println("Unesite Naziv Skole");
			String nazivSkole = sc.nextLine();
			System.out.println("Unesite razred");
			String razred = sc.nextLine();
			Djak dj = new Djak(ime, datumRodjenja, adresaStanovanja, nazivSkole, razred);
			System.out.println(dj.toString());
		} else if (osoba.equalsIgnoreCase("Zaposlen")) {
			System.out.println("Unesite Naziv Firme");
			String nazivFirme = sc.nextLine();
			System.out.println("Unesite Odeljenje Rada ");
			String odeljenjeRada = sc.nextLine();
			Zaposlen z = new Zaposlen(ime, datumRodjenja, adresaStanovanja, nazivFirme, odeljenjeRada);
			System.out.println(z.toString());
		}else {
			System.out.println("Radi detaljnije obrade podataka pokretine program ponovo i unesite da li je osoba djak ili zaposlen.");
		}

		sc.close();
	}

}
