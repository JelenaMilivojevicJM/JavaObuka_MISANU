package jelena.milivojevic;

public class Main {

	public static void main(String[] args) {
		/* Defaultni konstruktor */
		Circle1 c1 = new Circle1();

		System.out.println("Površina kruga je: " + c1.area());

		/* Konstruktor sa parametrom */

		Circle2 c2 = new Circle2(10); /* kreiranje objekta sa parametrom */

		System.out.println("Area of Circle: " + c2.area2());
	}
}
