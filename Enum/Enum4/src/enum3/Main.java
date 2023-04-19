package enum3;

public class Main {

	public static void main(String[] args) {
		/*metoda: ordinal() - njome se dobija rdni broj odnosno polozaj date konstante u listi konstanti u nabrajanju. Redni rbojevi pocinju od 0. 
		 *  */
		System.out.println("Boja - redni broj");
		
		for(Boja b : Boja.values()) {
			System.out.println(b+" "+b.ordinal());
		}
		
		/*metoda: compareTo() - poredi redne brojeve dveju konstanti iz istog nabrajanja. 
		 *AKo je redni broj pozivajuce konstante manji od rednog broja konstante, ova metoda vratice negativan broj. 
		 *Ukoliko su redni brojevi jednaki, metoda varaca 0. 
		 *Ako pozivajuca konstanta ima redni rboj veci od rednog broja konstante s kojom uporedjuje, metoda vraca pozitivan broj.
		 *
		 * */
		
		Boja b1,b2,b3;
		
		b1 = Boja.Crvena;
		b2=Boja.Zelena;
		b3 = Boja.Plava;
		
		if(b1.compareTo(b2)<0) {
			System.out.println(b1+" dolazi pre "+b2);
		}
		
		if(b1.compareTo(b2)>0) {
			System.out.println(b2+" dolazi pre "+b1);
		}
		
		if(b1.compareTo(b3)==0) {
			System.out.println(b1+" dolazi pre "+b3);
		}
		
		
		/*metoda : equals() - poredi se jednakost konstante iz nabrajanja sa svakim drugim objektom */
		if(b1.equals(b2)) {
			System.out.println(" Greska");
		}
		
		if(b1.equals(b3)) {
			System.out.println(b1+" jednako "+b3);
		}
		
		
	}

}
