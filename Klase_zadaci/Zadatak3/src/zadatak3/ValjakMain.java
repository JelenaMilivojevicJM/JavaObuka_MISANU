package zadatak3;

public class ValjakMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Valjak v1 = new Valjak(3,5);
		
		System.out.println(v1.getPoluprecnik());
		System.out.println(v1.getVisina());
		System.out.println(v1.Opis());
		System.out.println("Zapremina " + v1.racunajZapreminu());
	}

}
