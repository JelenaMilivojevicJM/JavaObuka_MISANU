package paket3;

public class Main3 {

	public static void main(String[] args) {
		int d, a;
		
		try {
			 d = 0;
			 a = 10 / 0;
			 System.out.println("Ova poruka nece biti dostampana jer do nje ni ne dolazi.");
		}catch(ArithmeticException e){
			System.out.println("Deljenje nulom");
		}
		System.out.println("Program nastavlja sa radom");

	}
	//ArithmeticException je klasa u okviru java.lang biblioteke. A e je promenljiva odnosno parametar ove metode. Jer je Ta klasa ovde zapravo njegov tip vrednosti

	/*Hrijerarhija izuzetaka:
	 * svi ziuzeci zivedeni su iz klase Throwable.A ona ima dva direktna anaseldnika. 
	 * 1.Naslednik te klase je klasa Error. - To su oni zizuzeci na koje se ne moze uticati. Ona opisuje fatalne greske.
	 * Sa greske tog tipa nije potrebno navoditi try cathc blokove. 
	 * 
	 * 2.Druga klasa je klasa Exceprion. - klasa iz koje se izvode druge klase koje pripadaju neproverenim tipovima gresaka, odnosno izuzetaka. 
	 * Unutar ove klase spadaju:
	 * - 1. Runtime Exception - (IndexOutOfBoudnException, ArithmeticException)  
	 * - 2. Input Output Exception, 
	 * 
	 * 
	 */
}
