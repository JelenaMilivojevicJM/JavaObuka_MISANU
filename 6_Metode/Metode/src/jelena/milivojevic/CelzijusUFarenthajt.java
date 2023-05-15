package jelena.milivojevic;

public class CelzijusUFarenthajt {
	// Metoda za prevođenje Celzijusovih u Farenhajtove stepene
	public static double CuF(double celsius) {
		return (((0.9 / 0.5) * celsius) + 32);
	}

	public static void main(String[] args) {
		/*
		 * Neka je danas u Nišu izmerena temperatura 25°C. Napisati program za
		 * prevođenje Celzijusovih u Farenthajtove stepene. Na izlazu štampati vrednost
		 * izmerene temperature u Farenthajtovim stepenima.
		 */
		// Izmerena temperatura
		double temp = 25;

		// Štampanje rezultata
		System.out.println("Temperatura prevedena u Farenthajte iznosi: " + CuF(temp));
	}

}
