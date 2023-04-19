package paket1;

public class Vezbanje2 {

	public static void main(String[] args) {
		// Pristup trenutnoj niti
		Thread t = Thread.currentThread();
		
		// Prikaz koja je:
		System.out.println(t); 
		
		// Prikaz imena niti
		System.out.println(t.getName()); 
		
		// Prikaz prioriteta niti
		System.out.println(t.getPriority()); 
	}

}
