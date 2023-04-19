package polimorfizam;

public class TestOblik {
	public static void main(String[] args) {
		Krug krug = new Krug();
		Pravougaonik pravougaonik = new Pravougaonik();
		Zvezda zvezda = new Zvezda();
		krug.crtaj();
		pravougaonik.crtaj();
		zvezda.crtaj();
	}
}