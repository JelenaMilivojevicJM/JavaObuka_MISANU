package paket1;

public class Main {

	public static void main(String[] args) {
		/* Prilikom pokjretanja Java Programa, jedna programska nit odmah pocinje da se izvrsava! 
		 * To je glavna - inicijalna nit! Ona orva nastaje i poslednja se zavrsava.
		 *  Takodje ima ulogu i ciscenja adresa ostalih niti nakon sto su one unistene.
		 * */
		
		/* Upravljanje Glavnom niti radi se preko objekta tipa Thread. Pozivom metode currentThreat().
		 * Ova metoda pripada clasi Thread.*/
	
		//Kreiramo prvo referencu na trenutnu nit
		//Ova trenutna nit dodeljuje se promenljivoj - objektu t koji smo mi kreirali sada
		Thread t = Thread.currentThread();
		
		//Da vidimo koja je trenutna nit
		System.out.println("Trenutna nit: "+t);
		
		/*Znacenje recenice "Trenutna nit: Thread[main,5,main]"
		 * [ime niti, prioritet procesa, ime grupe kojoj nit pripada] 
		 * ime niti main podrazumevano ime GLAVNE niti.
		 * Takodje, po defaultu, njen prioritet je 5.
		 * Treci parametar main je ime grupe niti kojoj ta nit pripada. 
		 * Grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom. */
		
		//getname() - za vracanje imena niti
		System.out.println("Naziv niti: "+Thread.currentThread().getName());
		
		//getPriority() - vraca prioritet niti
		System.out.println("Prioritet niti: "+Thread.currentThread().getPriority());
		
		/**/
		/**/
		/**/
		
	}

}
