package pkt2;

public class Main {
	public static void main(String[] args) {

		Sisar s = new Sisar();
		System.out.println("Boja ociju sisara: " + s.uzmiBojuOciju());

		Pas p = new Pas();
		p.lajati();
		System.out.println("Boja ociju psa: " + p.uzmiBojuOciju());

		Macka m = new Macka();
		m.mjaukati();
		System.out.println("Boja ociju macke: " + m.uzmiBojuOciju());
	}
}
