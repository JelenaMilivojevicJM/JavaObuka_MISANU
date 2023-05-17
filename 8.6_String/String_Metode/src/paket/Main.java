package paket;

public class Main {

	public static void main(String[] args) {
		String s1 = new String("Jelena");
		String s2 = "JELENA";
		String s3 = new String("Jelena");
		char niz[] = { 'J', 'E', 'L', 'E', 'N', 'A' };
		String s4 = new String(niz);
// Metode Stringa:

// 1: length(); - Duzina Stringa
		System.out.println("Duzima Stringa 1 : " + s1.length());
		System.out.println("Duzima Stringa 1 : " + s2.length());

// 2: chartAt(x); - vraca karakter tipa char sa zadatu poziciju u stringu

		System.out.println("String1 , karakter na poziciji 3 : " + s1.charAt(3));
		System.out.println("String3 , karakter na poziciji 4 : " + s1.charAt(4));

// 3: equals(); - Strogo Poredjenje Vrednosti Stringova
		/*
		 * equals(); vrsi leksikografsko poredjenje stringova, pri cemu se pravi razlika
		 * izmedju velikih i malih slova. Vraca true ako su stringovi isti, u suprotnom
		 * vraca false.
		 */

		System.out.println("Da li su s1 i s2 jednaki: " + s1.equals(s2));
		System.out.println("Da li su s1 i s3 jednaki: " + s1.equals(s3));
		System.out.println("Da li su s2 i s4 jednaki: " + s2.equals(s4));

// 4: equalsIgnoreCase(); - Light poredjenje

		/*
		 * Metoda equalsIgnoreCase(); leksikograski poredi stringove, ali ne pravi
		 * razliku izmedju malih i velikih slova.
		 */

		System.out.println("Da li su s1 i s2 jednaki: " + s1.equalsIgnoreCase(s2));
		System.out.println("Da li su s1 i s3 jednaki: " + s1.equalsIgnoreCase(s3));
		System.out.println("Da li su s2 i s4 jednaki: " + s2.equalsIgnoreCase(s4));

// 5: compareTo(); - Poredjenje Dva Stringa po duzini

		/*
		 * Ako su jednaki = vratice 0; Ako je prvi > vratice pozitivan broj; Ako je prvi
		 * <, vratice negativan broj
		 */

		System.out.println(" s1 i s2 : " + s1.compareTo(s2));
		System.out.println(" s2 i s3: " + s2.compareTo(s3));
		System.out.println(" s3 i s4 : " + s3.compareTo(s4));
	}
}
