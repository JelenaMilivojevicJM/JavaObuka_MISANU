package paket8;

public class Main {

	public static void main(String[] args) {
		
		A a = new A("A");
		A b = new A("B");

		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		try {
			b.join();
		}catch(Exception e) {
			System.out.println("Izuzetak:"+e);
		}
	}

}
