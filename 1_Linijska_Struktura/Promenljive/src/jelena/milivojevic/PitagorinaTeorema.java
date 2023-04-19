package jelena.milivojevic;

public class PitagorinaTeorema {

	public static void main(String[] args) {
		/*
		 * Prikaz inicijalizacije i deklaracije promenljivih. Na primeru korišćenje
		 * Pitagorine teoreme za izračunavanje dužine hipotenuze na osnovu dužina kateta
		 * trougla.
		 */
		double x, y, z;
		x = 3;
		y = 4;
		z = Math.sqrt(x * x + y * y);
		System.out.println("Dužina hipotenuze je " + z);

		/* Izlaz: Dužina hipotenuze je 5.0 */
	}

}
