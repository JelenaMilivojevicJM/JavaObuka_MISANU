package jelena.milivojevic_zadatak1;

public class Main {

	public static void main(String[] args) {
		// Kreiranje promenljive kojoj dodeljujemo vrednost
		TestBroja broj = (n)-> n<0;
		
		//Ispitivanje ispinjenosti uslova
		if(broj.testNeg(2)) {
			System.out.println("Broj 2 je negativan");
		}else {
			System.out.println("Broj 2 je pozitivan");
		}
		
		if(broj.testNeg(-2)) {
			System.out.println("Broj -2 je negativan");
		}else {
			System.out.println("Broj -2 je pozitivan");
		}

	}

}
