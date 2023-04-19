package pkt1;

public class TestPas {
	public static void main(String[] args) {
		Pas p = new Pas();
		System.out.println("Klasa Pas");
		p.laj();
		p.dahci();
		ZLatniRetriver zr = new ZLatniRetriver();
		System.out.println("Klasa ZLatniRetriver");

		zr.laj();
		zr.dahci();
		zr.aportiraj();
	}
}