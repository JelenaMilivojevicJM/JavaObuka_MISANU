package jelena.milivojevic;

public class RekurzivnoSumaCifaraBroja {
	/* Rekurzivna Metoda koja računa sumu svih cifara unetog broja */
	public static int racunajSC(int broj) {
		if (broj < 10) {
			return broj;
		} else {
			return (broj % 10) + racunajSC(broj / 10);
		}
	}

	public static void main(String[] args) {
		// Rekurzivno izracunavanje sume cifara broja
		System.out.println("Suma Cifara broja 234 = " + racunajSC(234));
		System.out.println();
		System.out.println("Suma Cifara broja 576 = " + racunajSC(576));
		System.out.println();
	}

}
