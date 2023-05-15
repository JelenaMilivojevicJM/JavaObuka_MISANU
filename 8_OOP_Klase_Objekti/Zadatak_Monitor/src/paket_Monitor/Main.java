package paket_Monitor;

public class Main {
	public static void main(String[] args) {

		Monitor monitor = new Monitor();

		monitor.setMarka("Samsung");
		monitor.getMarka();

		monitor.setVelicinaEkrana(15);
		monitor.getVelicinaEkrana();

		System.out.println(monitor.toString());
	}
}
