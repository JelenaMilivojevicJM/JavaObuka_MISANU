package enum3;

public class Main {

	public static void main(String[] args) {
		/* Nabrajanje je kao vrsta klase, iako nema sve karakteristike klasicne klase. Instanca klase ne pravi se pomocu kljucne reci new.
		 * rezervisana rec Enum definise ovu klasu.
		 * Svaka konstanta - identifikator definisana u nabrajanju je zapravo objekat ciji tip je to isto nabrajanje.Na primer Crvena je tip Boja.
		 * 
		 *   */ 
		
		Boja b;
		
		System.out.println("Udeo zelene boje je: "+Boja.Zelena.getUdeo());
		
		System.out.println("Sve boje: ");
		
		for(Boja c :Boja.values()) {
			System.out.println(c+" "+c.getUdeo());
		}
		
		System.out.println();
	}

}
