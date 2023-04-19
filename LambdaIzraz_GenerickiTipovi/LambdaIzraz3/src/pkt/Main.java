package pkt;

public class Main {

	public static void main(String[] args) {

		// Lambda izraz koji ima viticaste zagrade zavrsava se ;
		OkreniString obnuto = (str) -> {
			// Ovo je na neki nacin pomocna promenljiva u koju smestamo rezultat pa taj
			// rezultat dodeljujemo obnuto
			String rezultat = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				// Vadjenje jednog char-a iz Stringa
				rezultat += str.charAt(i);
			}
			return rezultat;
		};
		// Lambda izraz koji ima telo u vidu bloka naredni ({}) zavrsava se terminatorom
		// naredni ;

		// Stampanje vrednosti
		System.out.println("12345 " + obnuto.OkreniString("12345"));
		System.out.println("Java obrnuto " + obnuto.OkreniString("Java"));

	}

}
