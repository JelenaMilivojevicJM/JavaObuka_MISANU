package paket_k7;

public class Main {
	public static void main(String[] args) {
		// Objekat koji ulazi kao parametar konstruktora
		Circle c1 = new Circle(10);
		
		//Objekat koji koristimo za racunanje povrsine
		Circle c2 = new Circle(c1);
		
		//Ispis
		System.out.println("Povrsina je: "+c2.area());
	}
}
