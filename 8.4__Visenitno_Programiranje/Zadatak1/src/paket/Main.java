package paket;

public class Main {

	public static void main(String[] args) {
		A a = new A("NitA");
		B b = new B("NitB");
		C c = new C("NitC");

		a.start();
		b.start();
		c.start();
	}

}
