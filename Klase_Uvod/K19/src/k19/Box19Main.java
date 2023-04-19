package k19;

public class Box19Main {

	public static void main(String[] args) {
		
		Box19 b1 = new Box19(10, 15, 20);
		Box19 b2 = new Box19(5, 6, 7);

		System.out.println("Zaprmeina je: " + b1.volume());
		System.out.println("Zaprmeina je: " + b2.volume());
	}

}
