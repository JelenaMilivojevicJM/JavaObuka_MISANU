package paket_DZ2_3zad_JelenaMilivojevic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite maksimalni broj adresa u ulici:");
		int maksimalniBrojAdresa = sc.nextInt();
		sc.nextLine();

		Ulica ulica = new Ulica(maksimalniBrojAdresa);

		while (true) {
			System.out.println("Unesite ime saobraćajnice:");
			String ime = sc.nextLine();
			System.out.println("Unesite dužinu saobraćajnice (u metrima):");
			int duzina = sc.nextInt();
			sc.nextLine();

			Saobracajnica saobracajnica;
			try {
				saobracajnica = new Saobracajnica(ime, duzina);
				break;
			} catch (Izuzetak e) {
				System.out.println(e.getMessage());
			}
		}

		while (true) {
			System.out.println("Unesite podatke za zgradu:");
			System.out.println("Unesite površinu osnove zgrade (u m2):");
			int povrsinaOsnove = sc.nextInt();
			sc.nextLine();
			System.out.println("Unesite broj spratova:");
			int brojSpratova = sc.nextInt();
			sc.nextLine();
			System.out.println("Unesite broj stanova po spratu:");
			int brojStanovaPoSpratu = sc.nextInt();
			sc.nextLine();

			Zgrada zgrada = new Zgrada(povrsinaOsnove, brojSpratova, brojStanovaPoSpratu);
			try {
				ulica.dodajZgradu(zgrada);
				System.out.println("Zgrada uspešno dodata.");
				System.out.println("Ukupan broj stanova u ulici: " + ulica.getUkupanBrojStanova());
				System.out.println("Ukupna površina stanova u ulici: " + ulica.getUkupnaPovrsinaStanova() + " m2");
				System.out.println("Trenutni broj adresa u ulici: " + ulica.getUkupanBrojZgrada());
				System.out.println("Adrese u ulici:\n" + ulica.toString());
				break;
			} catch (Izuzetak e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
		
		/*Primer izlaznog resenja: 
		 * 
		 * Unesite maksimalni broj adresa u ulici:
25
Unesite ime saobraćajnice:
Saob1
Unesite dužinu saobraćajnice (u metrima):
50
Unesite podatke za zgradu:
Unesite površinu osnove zgrade (u m2):
1200
Unesite broj spratova:
4
Unesite broj stanova po spratu:
3
Zgrada uspešno dodata.
Ukupan broj stanova u ulici: 12
Ukupna površina stanova u ulici: 5760000.0 m2
Trenutni broj adresa u ulici: 1
Adrese u ulici:
1. 1200.0m2/4/3
*/
	}
}
