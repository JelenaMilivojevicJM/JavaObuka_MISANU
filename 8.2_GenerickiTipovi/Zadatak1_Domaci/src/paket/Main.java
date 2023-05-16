package paket;

/*Napisati genericku klasu “OpisnaOcena” koja omogućuje smeštanje vrednosti 
 * (Ocena, OpisnaOcena). Ocena je celobrojna vrednost, a OpisnaOcena je String-ovna vrednost. 
 * Ispis uraditi za ocene od 1 – 5. */

public class Main {
	public static void main(String[] args) {
		OpisnaOcena<Integer, String> ocena1 = new OpisnaOcena<Integer, String>(1, "Nedovoljan");
		ocena1.prikaziTip();
		OpisnaOcena<Integer, String> ocena2 = new OpisnaOcena<Integer, String>(2, "Dovoljan");
		ocena2.prikaziTip();
		OpisnaOcena<Integer, String> ocena3 = new OpisnaOcena<Integer, String>(3, "Dobar");
		ocena3.prikaziTip();
		OpisnaOcena<Integer, String> ocena4 = new OpisnaOcena<Integer, String>(4, "Vrlo Dobar");
		ocena4.prikaziTip();
		OpisnaOcena<Integer, String> ocena5 = new OpisnaOcena<Integer, String>(5, "Odlican");
		ocena5.prikaziTip();
	}
}
