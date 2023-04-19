package faktorijel_2Zadatak;

public class Main {

	public static void main(String[] args) {

		//Kreiranje promenljive i upotreba lambda izraza:
		Faktorijel broj = (n) -> {
			
			int rezultat = 1;
			
			for (int i = n; i >=1; i--) {
				
				rezultat *= i;
			}
			return rezultat;
		};

		//Ispis rezultata:
		System.out.println("Faktorijel broja 5 je: " + broj.racunajF(5));
		System.out.println("Faktorijel broja 10 je: " + broj.racunajF(10));
		System.out.println("Faktorijel broja 7 je: " + broj.racunajF(7));
		System.out.println("Faktorijel broja 3 je: " + broj.racunajF(3));
	}

}
