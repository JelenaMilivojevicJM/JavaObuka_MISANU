package paket2;

public class VezbanjeMain {

	public static void main(String[] args) {
		
		VezbanjeA a = new VezbanjeA();
		
		Thread t = new Thread(a,"A");
		
		t.start();
		
	}

}
