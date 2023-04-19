package enum2;

public class Main {

	public static void main(String[] args) {
		
		/*Sva nabrajanja  imaju dve unapred definisane metode:
		 * 1.values() - vraca niz koji sadrzi listu konstanti definisanih u nabrajanju. 
		 * 2.valueOf() - vraca konstantu(identifikator) iz nabrajanja cija vrednost odgovara znakovnom nizu proslednjenom u argumentu.
		 * 
		 * */
		Boja b;
		System.out.println("Boje: ");
		
		Boja nizBoja[] = Boja.values();
		for(Boja x : nizBoja) {
			System.out.println(x+" ");
		}
		
		Boja c;
		c = Boja.valueOf("Bela");
		//Vraca vrednost iz nabrajanja, koja odgovara imenu zadate konstante
		System.out.println("Boja: "+c);
	}

}
