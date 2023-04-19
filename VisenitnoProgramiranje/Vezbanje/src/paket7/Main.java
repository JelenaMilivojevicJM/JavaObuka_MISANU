package paket7;

public class Main {

	public static void main(String[] args) {
		A a = new A("A");
		System.out.println(a.isAlive());
		a.start();
		System.out.println(a.isAlive());
	}

}
