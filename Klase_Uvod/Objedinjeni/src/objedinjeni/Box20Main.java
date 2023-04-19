package objedinjeni;

public class Box20Main {

	public static void main(String[] args) {
		
		//Preklapanje konstruktora
		
		Box20 b1 = new Box20();
		
		Box20 b2 = new Box20(10, 15, 20);
		
		Box20 b3 = new Box20(10);
		
		Box20 b4 = new Box20(b2);

		System.out.println("Zaprmeina je: " + b1.volume());
		System.out.println("Zaprmeina je: " + b2.volume());
		System.out.println("Zaprmeina je: " + b3.volume());
		System.out.println("Zaprmeina je: " + b4.volume());
	}

}
