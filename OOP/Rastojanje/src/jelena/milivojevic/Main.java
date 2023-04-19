package jelena.milivojevic;

public class Main {

	public static void main(String[] args) {
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		Rastojanje r3 = new Rastojanje();

		/* Dodaju se vrednosti atributima objekta r1 */
		r1.stopala = 14;
		r1.inci = 9.5;

		/* Dodaju se vrednosti atributima objekta r2 */
		r2.stopala = 19;
		r2.inci = 5.5;

		System.out.println("Rastojanje 1: " + r1.stopala + "\'-" + r1.inci + "\"");
		System.out.println("Rastojanje 2: " + r2.stopala + "\'-" + r2.inci + "\"");

		/*
		 * S obzirom da nismo dodali vrednosti atributima objekta r3, ispisace se tkz.
		 * 'default' vrednosti. Za tip double default vrednost je '0.0' Za tip int
		 * default vrednost je '0'
		 */
		System.out.println("Rastojanje 3: " + r3.stopala + "\'-" + r3.inci + "\"");
	}

}
