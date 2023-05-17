package paket_Main;

import paket_novaNit.AA;

public class Main {
	public static void main(String[] args) {
		AA a1 = new AA("Nit1");
		AA a2 = new AA("Nit2");
		AA a3 = new AA("Nit3");

		//Metoda start zapocinje izvrsavanje niti pozivanjem njene metode run. /
		a1.start();
		a2.start();
		a3.start();
	}
}
