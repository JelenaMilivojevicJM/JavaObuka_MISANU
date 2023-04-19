package dz1_5zad_paket1_JelenaM;

public class Main {

	public static void main(String[] args) {
		/*- Napisati program koji formira primer jednog okruga sa dve opštine,
		 *  od kojih svaka opština ima po dva naselja, 
		 *  a zatim ispiše okrug na glavnom izlazu. 
		 *  Koristiti konstantne podatke (ne treba ništa čitati s glavnog ulaza). */
		
		
		Okrug ok[] = new Okrug[4];
		
		try {
			
			ok[0] = new Okrug("Vracar",5300,"Jagodina",600.00,"Pomoravski");
			ok[1] = new Okrug("Bubanj",6800,"Jagodina",600.00,"Pomoravski");
			ok[2] = new Okrug("Kolonija",1460,"Despotovac",628.00,"Pomoravski");
			ok[3] = new Okrug("Vojnik",2840,"Despotovac",628.00,"Pomoravski");
			
			System.out.println("Naselje : Vrsta: BrStanovnika : Opstina : Povrsina : Okrug :");
			System.out.println();
			for(int i =0; i<ok.length; i++) {
				System.out.println(ok[i].toStringOkrug());
			}
			
		} catch (GreskaBrJedinica e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		/*Primer ispisa na izlazu:
		 * Naselje : Vrsta: BrStanovnika : Opstina : Povrsina : Okrug :
Vracar : K : 5300 : Jagodina : 1200.0 : Pomoravski
Bubanj : K : 6800 : Jagodina : 1200.0 : Pomoravski
Kolonija : K : 1460 : Despotovac : 1256.0 : Pomoravski
Vojnik : K : 2840 : Despotovac : 1256.0 : Pomoravski
 */
	}

}
