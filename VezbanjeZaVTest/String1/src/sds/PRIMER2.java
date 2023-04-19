package sds;

public class PRIMER2 {

	public static void main(String[] args) {
		// Metoda charAt vraca karakter tipa char sa zadate pozicije u stringu.
		// Indeksiranje ide od 0.

		char ch1;
		String s = "Januar";
		ch1 = s.charAt(0);

		char ch2;
		ch2 = s.charAt(3);
		System.out.println(ch1);
		System.out.println(ch2);
		/* */
		// Metoda za duzunbu stringa
		// Broje se i blanko znaci
		// imePromenljive.length();
		// "string ispis".length();
		/* // Duzina stringa dobija se pomocu metode length */

		/*
		 * Metoda za POREDJENJE Stringova - ima ij 3. 1. Pravi razliku: Metoda equals
		 * vrsi leksikografsko poredjenje stringova, pri cemu se pravi razlika izmedju
		 * // velikih i malih slova. Vraca true ako su stringovi isti, u suprotnom vraca
		 * false.
		 */

		/*
		 * 2. ne pravi razliku: Metoda iqualsIgnoreCase leksikograski poredi stringove,
		 * ali ne pravi razliku izmedju malih i velikih slova.
		 */

		/*
		 * 3.Metoda: Metoda copareTo poziva se kao: // s1.compareTo(s2) // vraca 0 ako
		 * su s1 i s2 jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1
		 * veci od s2.
		 */

		String s5 = "JAVA";
		String s6 = "JAVA";
		String s7 = "Java";

		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s5.equalsIgnoreCase(s6));

		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";
		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + "equalsIgnoreCase " + s10 + " = " + s8.equalsIgnoreCase(s10));

		// poredjenje pomocu logickih operatora
		boolean b;
		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");
		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		/* */
		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";
		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));

		/* */

	}

}
