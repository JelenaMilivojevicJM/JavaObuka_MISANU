package osoba;

import java.util.Scanner;

public class OsobaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Osoba o1 = new Osoba();
		
		System.out.println("Ime: ");
		o1.ime = sc.nextLine();
		
		System.out.println("Datum Rodjenja: ");
		o1.datum = sc.nextLine();

		System.out.println("Adresa: ");
		o1.adresa = sc.nextLine();
		
		System.out.println(o1.ispisi());
		
		sc.close();
	}

}
