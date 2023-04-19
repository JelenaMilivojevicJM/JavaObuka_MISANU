package jelena.milivojevic;

public class NaucniFormat {

	public static void main(String[] args) {
		/*
		 * Naučni format prikazuje broj u eksponencialnom obliku i zamenjujući deo broja
		 * E+n,pri kojem E (eksponent) množi prethodno broj sa 10 na n-ti stepen. Na
		 * primer, naučni format sa dve decimale prikazuje broj 12345678901 u obliku
		 * 1,23E+10, što je 1,23 puta 10 na 10-ti stepen.
		 */
		// Prikazivanje brojeva u naučnom (eksponencijalnom) prikazu

		// Inicijalizacija i Deklaracija promenljivih:
		float f1 = 35e3f;
		double d1 = 12E4d;

		// Izlaz:
		System.out.println("naucno zapisano 35e3f je = " + f1);
		System.out.println("naucno zapisano 12E4d je = " + d1);
	}

}
