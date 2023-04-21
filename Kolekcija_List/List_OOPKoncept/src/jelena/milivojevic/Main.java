package jelena.milivojevic;

import izuzetak.Izuzetak;

public class Main {

	public static void main(String[] args) {
		// Kreiranje objekta klase velika Slova
		VelikoSlovo obj = new VelikoSlovo();

		//Pozivanje metoda ovog objekta unutar try catch bloka
		try {
			//Unos elemenata u listu:
			obj.unosVelikihSlova();
		} catch (Izuzetak e) {
			// Izuzetak uhvacen!
			System.out.println("*Greska: *" + e);
		}
		obj.ispisVelikihSlova();

	}

}
