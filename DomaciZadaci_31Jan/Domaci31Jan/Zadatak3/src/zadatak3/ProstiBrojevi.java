package zadatak3;

public class ProstiBrojevi {

	public static void main(String[] args) {
		/*
		 * TEKST ZADATKA: 3. Napisati program koji ispisuje sve proste brojeve od 1 do
		 * 10. Prost broj je deljiv samo jedinicom i samim sobom.
		 */

		// ULAZ:
		// Deklarisanje i inicijalizacija limita 
		int limit = 10;
		
		//Deklarisanje brojaca radi mogucnosti sabiranja koliko ih ima
		int brojac;

		//OBRADA: Prolazak kroz uslov
		for (int i = 1; i <= limit; i++) {
			brojac = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					brojac++;
				}
			}

			//IZLAZ: Ispis onih koji su prosti
			if (brojac == 0) {
				System.out.println("Prost je broj: "+i);
			}
			
		}
	}

}
