package paket;

public class Main {
	public static void main(String[] args) {
		// 1 objekat 1 parametrizovani tip
		A a = new A(5);
		a.getX();
		a.prikaziTip();

		// 1 parametrizovani tip, vise objekata
		B b1 = new B('c');
		b1.getY();
		b1.prikaziTip();

		B b2 = new B("Recenica");
		b2.getY();
		b2.prikaziTip();

		// 2parametrizovana tipa, jedan objekat
		C c = new C("Ime", 25);
		c.getAtribut1();
		c.getAtribut2();
		c.prikaziTip();
	}
}
