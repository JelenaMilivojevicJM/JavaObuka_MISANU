package paket_Domine;

public class Main {
	public static void main(String[] args) {
		/* Zamena mesta poljima objekta */
		Domine domine = new Domine(2, 5);

		domine.getA();
		domine.getB();

		//Opis polja
		System.out.println(domine.opis());
		//Zamena mesta
		domine.okreni();
		//Opis polja nakon zamene mesta
		System.out.println(domine.opis());
		//Utvrdjivanje jednakosti
		System.out.println(domine.jednakost(domine));
	}
}