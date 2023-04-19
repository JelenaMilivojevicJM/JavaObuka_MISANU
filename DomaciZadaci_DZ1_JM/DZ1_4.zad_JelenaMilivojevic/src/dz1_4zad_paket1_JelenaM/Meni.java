package dz1_4zad_paket1_JelenaM;

public class Meni {

	public static void main(String[] args) {
		/*-Meni sadrži niz namirnica.
		 *Stvara se prazan, zadatog kapaciteta, posle čega se namirnice dodaju jedna po jedna.
		 *Može da se odredi ukupna energetska vrednost menija i
		 *da se sastavi tekstualni opis menija u obliku{namirnica,…,namirnica}[uk_energetska_vrednost],
		 *gde je namirnica tekstualni opis jedne namernice u sastavu menija.
		 *Greška je ako se meni prepuni. */

		/*
		 * Napisati na jeziku Java program (klasu s glavnom funkcijom) koji napravi
		 * jedan meni u koji smesti nekoliko namirnica, a zatim na glavnom izlazu ispiše
		 * sadržaj formiranog menija. Svi parametri treba da budu konstante (ne treba
		 * ništa učitavati
		 */

		// Zadati kapacitet menija
		int kapacitet = 5;

		// Stvaranje praznog menija sa zadatim kapacitetom
		/*
		 * Namirnica je apstraktna klasa, samim tim ne mozemo da pravimo niz objekata
		 * namirnica - jer ona ne moze da se instancira. Ali, hrana je vrsta namirnice,
		 * sto znaci da je nasledjuje, pa samim tim mi u meni dodajemo hranu. Odnosno
		 * pravimo jdn objekata tipa Hrana.
		 */
		Hrana[] nizNamirnica = new Hrana[kapacitet];

		// Smestanje jedne po jedne namirnice u niz
		nizNamirnica[0] = new Hrana("Jabuka", 50.00);
		nizNamirnica[1] = new Hrana("Kruska", 65.00);
		nizNamirnica[2] = new Hrana("Sladoled", 75.00);
		nizNamirnica[3] = new Hrana("Pogaca", 82.00);
		nizNamirnica[4] = new Hrana("Pita", 150.00);

		double ukupnaEnergetskaVrednost = 0;

		for (int i = 0; i < kapacitet; i++) {
			ukupnaEnergetskaVrednost += nizNamirnica[i].odrediEnergetskuVrednost();
		}

		System.out.println("Opis Meni-a: ");
		System.out.println("Namirnice: {");
		
		for (int i = 0; i<nizNamirnica.length; i++) {
			nizNamirnica[i].opisHrane();
		}
		System.out.println(" }");
		System.out.print(" Ukupna Energetska Vrednost: ");
		System.out.println("[ " + ukupnaEnergetskaVrednost + " kJ ]");
	}

	/*Primer Izlaza:
	 * Opis Meni-a: 
Namirnice: {
Jabuka[ 56 ]( 50.0 gr , 3575.0 kJ) 
Kruska[ 35 ]( 65.0 gr , 4647.5 kJ) 
Sladoled[ 27 ]( 75.0 gr , 5362.5 kJ) 
Pogaca[ 63 ]( 82.0 gr , 5863.0 kJ) 
Pita[ 39 ]( 150.0 gr , 10725.0 kJ) 
 }
 Ukupna Energetska Vrednost: [ 30173.0 kJ ]
*/

}
