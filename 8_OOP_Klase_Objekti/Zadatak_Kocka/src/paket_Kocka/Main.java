package paket_Kocka;

public class Main {
	public static void main(String[] args) {
		Kocka k = new Kocka(5.0);
		k.setStranica(5.0);
		k.getStranica();

		System.out.println("Za stranicu a = " + k.getStranica() + " \nPovrsina kocke iznosi : " + k.racunajPovrsinu());
		System.out.println("Za stranicu a = " + k.getStranica() + " \nZapremina kockeiznosi : " + k.racunajZapreninu());
	}

}
