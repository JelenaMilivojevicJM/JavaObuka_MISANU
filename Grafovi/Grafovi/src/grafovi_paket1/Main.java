package grafovi_paket1;

public class Main {

	public static void main(String[] args) {
		// Kreiranje novog objekta klase Graf.
		Graf<Integer> graf = new Graf<Integer>();

		/*
		 * Dodavanje nove ivice između čvorova 0 i 1 u graf. Treći argument označava da
		 * ivica jeste dvosmerna.
		 */
		graf.dodajNovuIvicu(0, 1, true);
		graf.dodajNovuIvicu(0, 4, true);
		graf.dodajNovuIvicu(1, 2, true);
		graf.dodajNovuIvicu(1, 3, false);
		graf.dodajNovuIvicu(1, 4, true);
		graf.dodajNovuIvicu(2, 3, true);
		graf.dodajNovuIvicu(2, 4, true);
		graf.dodajNovuIvicu(3, 0, true);
		graf.dodajNovuIvicu(2, 0, true);
		
		System.out.println("----GRAF BROJEVA-----");
		/*
		 * Ispis liste susedstva grafa (Adjacency List). Lista susedstva se dobija
		 * pozivom metode toString() na objektu grafa.
		 */
		System.out.println("Lista susedstva(Adjacency List) grafa:\n" + graf.toString());

		/*
		 * Pozivanje metode izbrojiIvice() na objektu grafa koja broji broj čvorova u
		 * grafu.
		 */
		graf.izbrojiCvorove();

		/*
		 * Pozivanje metode izbrojiIvice() na objektu grafa koja broji broj ivica u
		 * grafu. Argument true označava da su ivice dvosmerne.
		 */
		graf.izbrojiIvice(true);

		/*
		 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
		 * sadrži ivicu između čvorova 1 i 2.
		 */
		graf.sadrziIvicu(1,2);
		
		/*
		 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
		 * sadrži ivicu između čvorova 3 i 4.
		 */
		graf.sadrziIvicu(3, 4);
		
		/*
		 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
		 * sadrži ivicu između čvorova 1 i 3.
		 */
		graf.sadrziIvicu(1, 3);

		/*
		 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
		 * sadrži ivicu između čvorova 2 i 4.
		 */
		graf.sadrziIvicu(2, 4);

		/*
		 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
		 * sadrži čvor 2.
		 */
		graf.sadrziCvor(2);
		
		/*
		 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
		 * sadrži čvor 3.
		 */
		graf.sadrziCvor(3);

		/*
		 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
		 * sadrži čvor 5.
		 */
		graf.sadrziCvor(5);
		System.out.println();
		
		// Kreiranje novog objekta klase Graf.
				Graf<String> grafVoce = new Graf<String>();

				/*
				 * Dodavanje nove ivice između čvorova u graf. Treći argument označava da
				 * ivica jeste dvosmerna.
				 */
				grafVoce.dodajNovuIvicu("Jabuka","Kruska", true);
				grafVoce.dodajNovuIvicu("Jabuka","Banana", true);
				grafVoce.dodajNovuIvicu("Kruska","Malina", true);
				grafVoce.dodajNovuIvicu("Kruska","Kajsija", false);
				grafVoce.dodajNovuIvicu("Kruska","Banana", true);
				grafVoce.dodajNovuIvicu("Malina","Kajsija", true);
				grafVoce.dodajNovuIvicu("Malina","Banana", true);
				grafVoce.dodajNovuIvicu("Kajsija","Jabuka", true);
				grafVoce.dodajNovuIvicu("Malina","Jabuka", true);
				
				System.out.println("----GRAF VOCA-----");
				/*
				 * Ispis liste susedstva grafa (Adjacency List). Lista susedstva se dobija
				 * pozivom metode toString() na objektu grafa.
				 */
				System.out.println("Lista susedstva(Adjacency List) grafVoce:\n" + grafVoce.toString());

				/*
				 * Pozivanje metode izbrojiIvice() na objektu grafa koja broji broj čvorova u
				 * grafu.
				 */
				grafVoce.izbrojiCvorove();

				/*
				 * Pozivanje metode izbrojiIvice() na objektu grafa koja broji broj ivica u
				 * grafu. Argument true označava da su ivice dvosmerne.
				 */
				grafVoce.izbrojiIvice(true);

				/*
				 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
				 * sadrži ivicu između čvorova "Kruska" i "Malina".
				 */
				grafVoce.sadrziIvicu("Kruska","Malina");
				
				/*
				 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
				 * sadrži ivicu između čvorova "Kajsija" i "Banana".
				 */
				grafVoce.sadrziIvicu("Kajsija","Banana");
				
				/*
				 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
				 * sadrži ivicu između čvorova "Kruska" i "Kajsija".
				 */
				grafVoce.sadrziIvicu("Kruska", "Kajsija");

				/*
				 * Pozivanje metode sadrziIvicu() na objektu grafa koja proverava da li graf
				 * sadrži ivicu između čvorova "Malina" i "Banana".
				 */
				grafVoce.sadrziIvicu("Malina","Banana");

				/*
				 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
				 * sadrži čvor "Malina".
				 */
				grafVoce.sadrziCvor("Malina");
				
				/*
				 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
				 * sadrži čvor "Kajsija".
				 */
				grafVoce.sadrziCvor("Kajsija");

				/*
				 * Pozivanje metode sadrziCvor() na objektu grafa koja proverava da li graf
				 * sadrži čvor "Kupina".
				 */
				grafVoce.sadrziCvor("Kupina");
	}

}
