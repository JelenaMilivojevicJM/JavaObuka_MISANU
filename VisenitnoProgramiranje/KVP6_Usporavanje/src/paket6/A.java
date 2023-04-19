package paket6;

public class A extends Thread {

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			/*
			 * //Metoda za usporavanje threada: sleep(vrednost u milisekundama); Ova metoda
			 * privremeno suspenduje odnsosno zaustavlja izvrsavanje niti. Argument metode
			 * je interval u milisekundama Metoda sleep u klasi Thread moze da izazove
			 * izuzedtak InterruptedException kada neka druga nit pozeli da prekine
			 * izvrzavanje ove suspendovane niti.
			 */
			try {
				Thread.sleep(500);
				// Nit se suporava tako sto joj se suspenduju resursi
			} catch (InterruptedException e) {
				System.out.println("Nit je prekinuta");
				// Ako neka druga nit pokusava da pristupi dok je ova usporena, pa java nudi
				// catch opciju
				e.printStackTrace();
			}
			i++;
		}
	}
}
