package paket1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestiraBroj paranBroj = (n) -> (n % 2) == 0;
		// Ovo je lambda izraz: (n)->(n % 2) == 0
		// Lambda operator ->
		// Vrednost lanbda izraza smo smestili unutar prmenljive paran broj

		// Ispsitivanje
		if (paranBroj.testbr(10)) {
			System.out.println("Jeste paran broj");
		} else {
			System.out.println("Nije paran broj");
		}
	}

}
