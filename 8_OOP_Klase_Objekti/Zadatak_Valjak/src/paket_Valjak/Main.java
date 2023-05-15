package paket_Valjak;

public class Main {
	public static void main(String[] args) {
		Valjak v1 = new Valjak(3,5);
		
		System.out.println(v1.getPoluprecnik());
		System.out.println(v1.getVisina());
		System.out.println(v1.Opis());
		System.out.println("Zapremina " + v1.racunajZapreminu());
	}
}
